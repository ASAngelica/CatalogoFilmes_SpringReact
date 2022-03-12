package com.lg2.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lg2.dsmovie.entities.Movie;

public interface MovieRopository extends JpaRepository<Movie, Long> {

}
