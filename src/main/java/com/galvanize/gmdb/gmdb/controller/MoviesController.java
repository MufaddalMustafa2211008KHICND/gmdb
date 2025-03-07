package com.galvanize.gmdb.gmdb.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.galvanize.gmdb.gmdb.entity.Movies;
import com.galvanize.gmdb.gmdb.repository.MoviesRepository;

@RestController
@RequestMapping("/movies")  
public class MoviesController {
    private final MoviesRepository repository;

    public MoviesController(MoviesRepository repository){
        this.repository = repository;
    }

    @PostMapping("")  
    public void createMovies(@RequestBody Movies movie) {
        this.repository.save(movie);
    }

    // 1. As a user
    //    I can GET a list of movies from GMDB that includes Movie ID | Movie Title | Year Released | Genre | Runtime
    //    so that I can see the list of available movies.
    @GetMapping("/all") 
    public List<Movies> getAllMovies(){
        return this.repository.findAll();
    }

    @GetMapping("/{id}") 
    public Movies getAllMovies(@PathVariable long id){
        return this.repository.getMovieById(id);
    }


}