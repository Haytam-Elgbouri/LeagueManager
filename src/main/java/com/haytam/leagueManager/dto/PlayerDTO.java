package com.haytam.leagueManager.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class PlayerDTO {

    private Long id;
    private String firstName;
    private String lastName;
    private String photoUrl;
    private TeamDTO team;

}
