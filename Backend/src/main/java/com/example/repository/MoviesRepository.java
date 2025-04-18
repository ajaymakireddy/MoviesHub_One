package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Movies;

public interface MoviesRepository extends JpaRepository<Movies, Long>{

}
