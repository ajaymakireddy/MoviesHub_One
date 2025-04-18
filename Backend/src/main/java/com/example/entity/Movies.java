package com.example.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Movies {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String title;
	private String type;
	private int releasedYear;
	private String director;
	private String description;
	private String writer;
	private int likes;
	private int dislikes;
	private int reviews;
	private double rating ;
	private Date updatedDate;
	
}
