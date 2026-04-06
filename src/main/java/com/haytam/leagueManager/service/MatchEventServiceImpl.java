package com.haytam.leagueManager.service;

import com.haytam.leagueManager.dto.MatchEventDTO;
import com.haytam.leagueManager.entity.MatchEvent;
import com.haytam.leagueManager.enums.EventType;
import com.haytam.leagueManager.mapper.MatchEventMapper;
import com.haytam.leagueManager.repository.MatchEventRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class MatchEventServiceImpl {
    private final MatchEventMapper mapper;
    private final MatchEventRepository repository;

//    public MatchEventDTO addMatchEvent(MatchEventDTO dto){
//        MatchEvent matchEvent = mapper.toEntity(dto);
//        repository.save(matchEvent);
//        return mapper.toDto(matchEvent);
//    }
//
    public void addEvent(MatchEventDTO dto, EventType eventType){
        MatchEvent matchEvent = mapper.toEntity(dto);
        matchEvent.setType(eventType);
        repository.save(matchEvent);
//        return mapper.toDto(matchEvent);
    }
//    public void addAssist(Long matchId, Long teamId, Long playerId){}
//    public void addYellowCard (Long matchId, Long teamId, Long playerId){}
//    public void addRedCard(Long matchId, Long teamId, Long playerId){}

}
