package com.haytam.leagueManager.mapper;

import com.haytam.leagueManager.dto.MatchDTO;
import com.haytam.leagueManager.entity.Match;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MatchMapper {
    Match toEntity(MatchDTO dto);
    MatchDTO toDto(Match entity);
}
