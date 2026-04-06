package com.haytam.leagueManager.mapper;

import com.haytam.leagueManager.dto.TeamDTO;
import com.haytam.leagueManager.entity.Team;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TeamMapper {
    Team toEntity (TeamDTO dto);
    TeamDTO toDto(Team entity);
}
