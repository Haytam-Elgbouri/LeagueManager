package com.haytam.leagueManager.controller;

import com.haytam.leagueManager.dto.MatchEventDTO;
import com.haytam.leagueManager.enums.EventType;
import com.haytam.leagueManager.service.MatchEventServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/match-event")
public class MatchEventController {

    private final MatchEventServiceImpl matchEventService;

    @PostMapping("goal")
    public void addGoal(@RequestBody MatchEventDTO matchEvent){
        matchEventService.addEvent(matchEvent, EventType.GOAL);
    }

    @PostMapping("assist")
    public void addAssist(@RequestBody MatchEventDTO matchEvent){
        matchEventService.addEvent(matchEvent, EventType.ASSIST);
    }

    @PostMapping("yellow-card")
    public void addYellowCard(@RequestBody MatchEventDTO matchEvent){
        matchEventService.addEvent(matchEvent, EventType.YELLOW_CARD);
    }

    @PostMapping("red-card")
    public void addRedCard(@RequestBody MatchEventDTO matchEvent, EventType eventType){
        matchEventService.addEvent(matchEvent, EventType.RED_CARD);
    }
}
