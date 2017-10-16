package com.priya.movieapp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.priya.movieapp.Model.MovieModel;
import com.priya.movieapp.Service.MovieService;

@RestController
@RequestMapping("/v0.1/MovieService")
public class MovieController {
    
    @Autowired
    private MovieService movieService;
    
    
    @RequestMapping( value="/Movies", method=RequestMethod.POST, consumes="application/json")
      public ResponseEntity<?> create(@RequestBody MovieModel movie)
      {
          /*Add validation code*/        
           movieService.addMovie(movie);
          return new ResponseEntity<String>("New data is created", HttpStatus.OK) ;
         
      }
     
     
    @RequestMapping(value="/Movies", method=RequestMethod.GET)
   public ResponseEntity<List<MovieModel>> read() {
         
        List<MovieModel> resultList1 = movieService.getAllMovies();
         
        return new ResponseEntity<List<MovieModel>>(resultList1, HttpStatus.OK) ;
   }
    
    
     @RequestMapping(value="/Movies", method=RequestMethod.PUT)
        public ResponseEntity<MovieModel> update() {
            MovieModel md3=new MovieModel(2,"ha","haha","hahaha");
            System.out.println("helloworld");
            return new ResponseEntity<MovieModel>(md3,HttpStatus.OK);
        }
     
    
     @RequestMapping(value="/Movies", method = RequestMethod.DELETE)
     public ResponseEntity<MovieModel> delete() {
            MovieModel md4=new MovieModel(2,"ha","haha","hahaha");
            System.out.println("helloworld");
            return new ResponseEntity<MovieModel>(md4,HttpStatus.OK);
     }

     @RequestMapping(value="/Movies/id/{id}", method = RequestMethod.GET)
     public ResponseEntity<MovieModel> getMovieId(@PathVariable() String id) {
            MovieModel md5=new MovieModel(2,"ha","haha","hahaha");
            System.out.println("helloworld");
            return new ResponseEntity<MovieModel>(md5,HttpStatus.OK);
     }
     
}