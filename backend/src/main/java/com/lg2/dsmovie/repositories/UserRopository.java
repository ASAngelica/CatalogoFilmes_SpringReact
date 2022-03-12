package com.lg2.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lg2.dsmovie.entities.User;

public interface UserRopository extends JpaRepository<User, Long> {
	
	User findByEmail(String email);

}
