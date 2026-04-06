package com.haytam.leagueManager.dto;

import com.haytam.leagueManager.entity.Match;
import com.haytam.leagueManager.entity.Player;
import com.haytam.leagueManager.entity.Team;
import com.haytam.leagueManager.enums.EventType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class MatchEventDTO {

    private Long id;
    private Match match;
    private Player player;
    private Team team;
    private EventType type;
    private Integer minute;

}
