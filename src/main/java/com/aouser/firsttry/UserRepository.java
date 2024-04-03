package com.aouser.firsttry;

import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
// import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Repository;

@Repository
// @EnableMongoRepositories
public interface UserRepository extends MongoRepository<User,ObjectId>{
public Optional<User>findUserById(String id);






}
