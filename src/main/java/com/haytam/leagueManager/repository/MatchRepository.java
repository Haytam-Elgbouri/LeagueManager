package com.haytam.leagueManager.repository;

import com.haytam.leagueManager.entity.Match;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatchRepository extends JpaRepository<Match, Long> {
}
