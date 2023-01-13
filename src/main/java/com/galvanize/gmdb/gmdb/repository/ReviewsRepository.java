package com.galvanize.gmdb.gmdb.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.galvanize.gmdb.gmdb.entity.Reviews;

@Repository
public interface ReviewsRepository extends CrudRepository<Reviews, Long>{
 
}