package com.quiz.quiz.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.quiz.model.quizModel;
import com.quiz.quiz.repo.quizRepo;
@Service
public class quizService {
	 @Autowired
	    private quizRepo questionRepository;

	    public List<quizModel> getAllQuestions() {
	        return questionRepository.findAll();
	    }

	    public Optional<quizModel> getQuestionById(String id) {
	        return questionRepository.findById(id);
	    }

	    public quizModel addQuestion(quizModel question) {
	        return questionRepository.save(question);
	    }

	    public void deleteQuestion(String id) {
	        questionRepository.deleteById(id);
	    }

}