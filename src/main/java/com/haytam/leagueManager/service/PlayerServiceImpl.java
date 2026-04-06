package com.haytam.leagueManager.service;

import com.haytam.leagueManager.dto.PlayerDTO;
import com.haytam.leagueManager.entity.Player;
import com.haytam.leagueManager.mapper.PlayerMapper;
import com.haytam.leagueManager.mapper.TeamMapper;
import com.haytam.leagueManager.repository.PlayerRepository;
import com.haytam.leagueManager.repository.TeamRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;
@RequiredArgsConstructor
public class PlayerServiceImpl {
    private final PlayerMapper mapper;
    private final PlayerRepository repository;

    public PlayerDTO addPlayer(PlayerDTO dto){
        Player player = mapper.toEntity(dto);
        repository.save(player);
        return mapper.toDto(player);
    }

    public PlayerDTO getPlayer(Long id){
        Player player = repository.findById(id).orElseThrow(null);
        return mapper.toDto(player);
    }

    public List<PlayerDTO> getPlayers(){
        return repository.findAll().stream()
                .map(mapper::toDto)
                .toList();
    }

    public void deletePlayer(Long id){
        repository.deleteById(id);
    }

    public PlayerDTO updatePlayer(PlayerDTO dto){
        return null;
    }
}
