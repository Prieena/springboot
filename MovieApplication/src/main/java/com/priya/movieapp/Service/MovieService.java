package com.priya.movieapp.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.priya.movieapp.Interface.MovieInterface;
import com.priya.movieapp.Model.MovieModel;
import com.priya.movieapp.Repository.MovieRepository;

@Service
public class MovieService implements MovieInterface{

    List<MovieModel> resultList = new ArrayList<>(Arrays.asList(
            
            new MovieModel(2, "ascl", "sddefsc", "gvhjgjjh"),
            new MovieModel(3, "sacvha", "sac", "hghjgj")));

public List<MovieModel> getAllMovies( )
{
    return resultList;
}


public MovieModel addMovie(MovieModel moviemodel)
{
    resultList.add(moviemodel);
    return moviemodel;
}
}
	
/*       private static List<MovieModel> movie;
       
     @Autowired
       public MovieRepository movieRepository;
       
//       static{
//           movie= DummyMovieModel();
//                   }
       
@Override
public List<MovieModel> getAllMovies( )
{
    List <MovieModel> movieList= (List<MovieModel>)movieRepository.findAll();
   return movieList;
}

@Override
public MovieModel addMovie(MovieModel moviemodel)
{
   movie.add(moviemodel);
  
    return moviemodel;
}

private static List<MovieModel> DummyMovieModel(){
   List<MovieModel> resultset = new ArrayList<MovieModel>();
     
      resultset.add(new MovieModel(1, "ascl", "sddefsc", "gvhjgjjh"));
      resultset.add(new MovieModel(2, "ascsl", "sdcdefsc", "gvhjcgjjh"));
    return resultset;
    
}
}
*/