package com.haytam.leagueManager.controller;

import com.haytam.leagueManager.dto.MatchDTO;
import com.haytam.leagueManager.service.MatchServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/match")
public class MatchController {
    private final MatchServiceImpl matchService;

    @PostMapping
    public ResponseEntity<MatchDTO> addMatch(@RequestBody MatchDTO match){
        return ResponseEntity.ok(matchService.addMatch(match));
    }

    @GetMapping("/{id}")
    public ResponseEntity<MatchDTO> getMatch(@PathVariable Long id){
        return ResponseEntity.ok(matchService.getMatch(id));
    }

    @PostMapping("start-match/{id}")
    public void startMatch(@PathVariable Long id){
        matchService.startMatch(id);
    }

    @PostMapping("finish-match/{id}")
    public void finishMatch(@PathVariable Long id){
        matchService.finishMatch(id);
    }
}
