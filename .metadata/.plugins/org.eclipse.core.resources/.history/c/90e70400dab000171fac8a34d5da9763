	package com.priya.movieapp.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="MongoMovie")
public class MovieModel {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer MovieId;
	private String MovieName;
	private String MovieDescription;
	private String MovieImageLink;
	
	@Autowired
	public MovieModel(Integer movieId, String movieName, String movieDescription, String movieImageLink) {
		super();
		MovieId = movieId;
		MovieName = movieName;
		MovieDescription = movieDescription;
		MovieImageLink = movieImageLink;
	}
	
	public MovieModel() {
		
	}
	
	
	public Integer getMovieId() {
		return MovieId;
	}
	public void setMovieId(Integer movieId) {
		MovieId = movieId;
	}
	public String getMovieName() {
		return MovieName;
	}
	public void setMovieName(String movieName) {
		MovieName = movieName;
	}
	public String getMovieDescription() {
		return MovieDescription;
	}
	public void setMovieDescription(String movieDescription) {
		MovieDescription = movieDescription;
	}
	public String getMovieImageLink() {
		return MovieImageLink;
	}
	public void setMovieImageLink(String movieImageLink) {
		MovieImageLink = movieImageLink;
	}
	
}
