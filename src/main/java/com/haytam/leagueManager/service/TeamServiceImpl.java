package com.haytam.leagueManager.service;

import com.haytam.leagueManager.dto.TeamDTO;
import com.haytam.leagueManager.entity.Team;
import com.haytam.leagueManager.mapper.TeamMapper;
import com.haytam.leagueManager.repository.TeamRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class TeamServiceImpl {

    private final TeamMapper mapper;
    private final TeamRepository repository;

    public TeamDTO addTeam(TeamDTO dto){
        Team team = mapper.toEntity(dto);
        repository.save(team);
        return mapper.toDto(team);
    }

    public TeamDTO getTeam(Long id){
        Team team = repository.findById(id).orElseThrow(null);
        return mapper.toDto(team);
    }

    public List<TeamDTO> getTeams(){
        return repository.findAll().stream()
                .map(mapper::toDto)
                .toList();
    }

    public TeamDTO updateTeam(TeamDTO dto, Long id){
        return null;
    }

    public void deleteTeam(Long id){
        repository.deleteById(id);
    }


}
