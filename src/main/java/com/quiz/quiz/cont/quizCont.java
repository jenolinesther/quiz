package com.quiz.quiz.cont;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.quiz.model.quizModel;
import com.quiz.quiz.service.quizService;

@RestController
@RequestMapping
@CrossOrigin
public class quizCont {
	@Autowired
    private quizService questionService;

    @GetMapping("/all")
    public List<quizModel> getAllQuestions() {
        return questionService.getAllQuestions();
    }

    @GetMapping("/{id}")
    public Optional<quizModel> getQuestionById(@PathVariable String id) {
        return questionService.getQuestionById(id);
    }

    @PostMapping("/add")
    public quizModel addQuestion(@RequestBody quizModel question) {
        return questionService.addQuestion(question);
    }

    @DeleteMapping("/{id}")
    public void deleteQuestion(@PathVariable String id) {
        questionService.deleteQuestion(id);
    }
    
    private int currentQuestionIndex = 0; 

    @GetMapping("/next")
    public ResponseEntity<quizModel> getNextQuestion() {
        List<quizModel> questions = questionService.getAllQuestions();
        
        if (questions.isEmpty()) {
            return ResponseEntity.noContent().build();
        }

        quizModel nextQuestion = questions.get(currentQuestionIndex);

        currentQuestionIndex = (currentQuestionIndex + 1) % questions.size();

        return ResponseEntity.ok(nextQuestion);
    }
}