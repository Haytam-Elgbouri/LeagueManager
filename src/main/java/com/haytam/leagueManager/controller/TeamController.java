package com.haytam.leagueManager.controller;

import com.haytam.leagueManager.dto.TeamDTO;
import com.haytam.leagueManager.service.TeamServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/team")
public class TeamController {
    private final TeamServiceImpl teamService;

    @PostMapping
    public ResponseEntity<TeamDTO> addTeam(@RequestBody TeamDTO team){
        return ResponseEntity.ok(teamService.addTeam(team));
    }

    @GetMapping
    public ResponseEntity<List<TeamDTO>> getTeams(){
        return ResponseEntity.ok(teamService.getTeams());
    }

    @GetMapping("/{id}")
    public ResponseEntity<TeamDTO> getTeam(@PathVariable Long id){
        return ResponseEntity.ok(teamService.getTeam(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<TeamDTO> updateTeam(@RequestBody TeamDTO team, @PathVariable Long id){
        return ResponseEntity.ok(teamService.updateTeam(team, id));
    }

    @DeleteMapping("/{id}")
    public void deleteTeam(@PathVariable Long id){
        teamService.deleteTeam(id);
    }
}
