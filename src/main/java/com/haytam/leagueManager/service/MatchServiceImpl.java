package com.haytam.leagueManager.service;

import com.haytam.leagueManager.dto.MatchDTO;
import com.haytam.leagueManager.entity.Match;
import com.haytam.leagueManager.mapper.MatchMapper;
import com.haytam.leagueManager.repository.MatchEventRepository;
import com.haytam.leagueManager.repository.MatchRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

import static com.haytam.leagueManager.enums.EventType.GOAL;
import static com.haytam.leagueManager.enums.MatchStatus.*;
@Service
@RequiredArgsConstructor
public class MatchServiceImpl {

    private final MatchMapper mapper;
    private final MatchRepository repository;

    private final MatchEventRepository eventRepository;


    public MatchDTO addMatch(MatchDTO dto){
        Match match = mapper.toEntity(dto);
        match.setDate(LocalDate.now());
        match.setStatus(COMING);
        repository.save(match);
        return mapper.toDto(match);
    }

    public MatchDTO getMatch(Long id){
        Match match = repository.findById(id).orElseThrow();
        return mapper.toDto(match);
    }

    public void startMatch(Long matchId){

        Match match = repository.findById(matchId).orElseThrow(null);

        if (match.getStatus() != COMING){
            throw new RuntimeException("Match already started or finished");
        }else{
            match.setStatus(IN_PROGRESS);
            match.setAwayScore(0);
            match.setHomeScore(0);

            repository.save(match);
        }
    }

    public void finishMatch(Long matchId){

        Match match = repository.findById(matchId).orElseThrow(null);

        if (match.getStatus() != IN_PROGRESS){
            throw new RuntimeException("Match already finished or hasn't started yet");
        }else{
            match.setStatus(FINISHED);
            Integer homeScore = eventRepository
                    .countByTypeAndTeamIdAndMatchId(GOAL, match.getHomeTeam().getId(), matchId);

            Integer awayScore = eventRepository
                    .countByTypeAndTeamIdAndMatchId(GOAL, match.getAwayTeam().getId(), matchId);

            match.setHomeScore(homeScore);
            match.setAwayScore(awayScore);

            repository.save(match);
        }
    }
}
