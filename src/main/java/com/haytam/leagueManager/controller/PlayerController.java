package com.haytam.leagueManager.controller;

import com.haytam.leagueManager.dto.PlayerDTO;
import com.haytam.leagueManager.service.PlayerServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/player")
public class PlayerController {
    private final PlayerServiceImpl playerService;

    @PostMapping
    public ResponseEntity<PlayerDTO> addPlayer(@RequestBody PlayerDTO player){
        return ResponseEntity.ok(playerService.addPlayer(player));
    }

    @GetMapping
    public ResponseEntity<List<PlayerDTO>> getPlayers(){
        return ResponseEntity.ok(playerService.getPlayers());
    }

    @GetMapping("/{id}")
    public ResponseEntity<PlayerDTO> getPlayer(@PathVariable Long id){
        return ResponseEntity.ok(playerService.getPlayer(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<PlayerDTO> updatePlayer(@RequestBody PlayerDTO player, @PathVariable Long id){
        return ResponseEntity.ok(playerService.updatePlayer(player, id));
    }

    @DeleteMapping("/{id}")
    public void deletePlayer(@PathVariable Long id){
        playerService.deletePlayer(id);
    }
}
