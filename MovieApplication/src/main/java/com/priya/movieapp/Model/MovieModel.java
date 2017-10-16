package com.priya.movieapp.Model;

//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;


public class MovieModel {
	
	private int MovieId;
	private String MovieName;
	private String MovieDescription;
	private String MovieImageLink;
	
	@Autowired
	public MovieModel(int movieId, String movieName, String movieDescription, String movieImageLink) {
		super();
		MovieId = movieId;
		MovieName = movieName;
		MovieDescription = movieDescription;
		MovieImageLink = movieImageLink;
	}
	
	public MovieModel() {
		
	}
	
	
	public int getMovieId() {
		return MovieId;
	}
	public void setMovieId(int movieId) {
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
