package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.MoviesLike;

public interface MoviesLikeRepository extends JpaRepository<MoviesLike, Long>{

}
