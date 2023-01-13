package com.galvanize.gmdb.gmdb.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.galvanize.gmdb.gmdb.entity.Reviews;
import com.galvanize.gmdb.gmdb.repository.ReviewsRepository;

@RestController
@RequestMapping("/reviews")  
public class ReviewsController {
    private final ReviewsRepository repository;

    public ReviewsController(ReviewsRepository repository){
        this.repository = repository;
    }

    @PostMapping("")  
    public void createReview(@RequestBody Reviews review) {
        this.repository.save(review);
    }

    // 1. As a user
    //    I can GET a list of movies from GMDB that includes Movie ID | Movie Title | Year Released | Genre | Runtime
    //    so that I can see the list of available movies.


}