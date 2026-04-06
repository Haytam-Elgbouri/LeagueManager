package com.haytam.leagueManager.mapper;

import com.haytam.leagueManager.dto.PlayerDTO;
import com.haytam.leagueManager.entity.Player;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PlayerMapper {
    Player toEntity(PlayerDTO dto);
    PlayerDTO toDto(Player entity);
}
