package com.haytam.leagueManager.dto;

import com.haytam.leagueManager.enums.MatchStatus;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;
@Getter
@AllArgsConstructor
public class MatchDTO {

    private Long id;
    private TeamDTO homeTeam;
    private TeamDTO awayTeam;
    private Integer homeScore;
    private Integer awayScore;
    private LocalDate date;
    private MatchStatus status;

}
