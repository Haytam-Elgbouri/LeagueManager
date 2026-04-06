package com.haytam.leagueManager.repository;

import com.haytam.leagueManager.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Long> {
}
