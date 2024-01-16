package dev.bonoloa.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;//repo ref. needing initialise as is private
    public List<Movie> allMovies(){
        return movieRepository.findAll();//findall defined in mongo repo class
    }
    //findall defined in mongo repo class
}
