package com.haytam.leagueManager.repository;

import com.haytam.leagueManager.entity.MatchEvent;
import com.haytam.leagueManager.enums.EventType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatchEventRepository extends JpaRepository<MatchEvent, Long> {
    Integer countByTypeAndTeamIdAndMatchId(EventType eventType, Long teamId, Long matchId);
}
