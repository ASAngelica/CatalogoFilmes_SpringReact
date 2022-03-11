package com.lg2.dsmovie.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lg2.dsmovie.dto.MovieDTO;
import com.lg2.dsmovie.entities.Movie;
import com.lg2.dsmovie.repositories.MovieRopository;

@Service
public class MovieService {
	
	@Autowired
	private MovieRopository repository;
	
	@Transactional(readOnly = true)
	public Page<MovieDTO> findAll(Pageable pageable){
		Page<Movie> result = repository.findAll(pageable);
		Page<MovieDTO> page = result.map(x -> new MovieDTO(x));
		return page;		
	}
	
	@Transactional(readOnly = true)
	public MovieDTO findById(Long id){
		Movie result = repository.findById(id).get(); // Tratamento de exceção necessário para ver se existe o id, implementar ...
		MovieDTO dto = new MovieDTO(result);
		return dto;		
	}

}
