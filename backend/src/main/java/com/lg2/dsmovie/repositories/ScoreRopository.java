package com.lg2.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lg2.dsmovie.entities.Score;
import com.lg2.dsmovie.entities.ScorePK;

public interface ScoreRopository extends JpaRepository<Score, ScorePK> {
	
}
