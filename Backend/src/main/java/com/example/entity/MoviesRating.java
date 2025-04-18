package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class MoviesRating {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private double rating;
	
	@ManyToOne
	@JoinColumn(name =  "fk_userId")
	private User user;
	
	@ManyToOne
	@JoinColumn(name = "fk_movieId")
	private Movies movie;
}
