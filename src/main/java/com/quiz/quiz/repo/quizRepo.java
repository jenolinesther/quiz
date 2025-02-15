package com.quiz.quiz.repo;

import com.quiz.quiz.model.quizModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface quizRepo extends MongoRepository<quizModel, String> {
}