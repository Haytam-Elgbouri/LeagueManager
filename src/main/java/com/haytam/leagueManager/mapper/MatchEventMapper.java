package com.haytam.leagueManager.mapper;

import com.haytam.leagueManager.dto.MatchEventDTO;
import com.haytam.leagueManager.entity.MatchEvent;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MatchEventMapper {
    MatchEvent toEntity(MatchEventDTO dto);
    MatchEventDTO toDto(MatchEvent entity);
}
