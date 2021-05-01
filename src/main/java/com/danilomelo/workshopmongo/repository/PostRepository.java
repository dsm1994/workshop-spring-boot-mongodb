package com.danilomelo.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.danilomelo.workshopmongo.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String>  {

}
