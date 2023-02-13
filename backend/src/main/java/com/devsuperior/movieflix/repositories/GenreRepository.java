package com.devsuperior.movieflix.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.movieflix.entities.Genre;
import com.devsuperior.movieflix.entities.User;

public interface GenreRepository extends JpaRepository<Genre, Long>{

	User findByEmail(String username);

}
