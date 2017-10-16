package com.priya.movieapp.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.priya.movieapp.Model.MovieModel;

@Repository
public interface MovieRepository extends CrudRepository<MovieModel, Integer>{

	
	
}
