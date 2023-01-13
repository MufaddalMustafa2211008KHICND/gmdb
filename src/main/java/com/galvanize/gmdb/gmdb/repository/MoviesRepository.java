package com.galvanize.gmdb.gmdb.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.galvanize.gmdb.gmdb.entity.Movies;

@Repository
public interface MoviesRepository extends CrudRepository<Movies, Long>{

    List<Movies> findAll();
    Movies getMovieById(long id);
    

    
}