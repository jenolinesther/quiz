package com.quiz.quiz.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "quiz")  // Specifies MongoDB collection name
public class quizModel {

    @Id
    private String questionId;  
    private String questionText;
    private String questionSection;
    private List<String> answerOptions;  
    private String correctOption;
    private Integer marks;
    private Integer timeForQuestion;  //seconds
    private String difficultyLevel;   
    private String questionType;     

    // Default Constructor
    public quizModel() {}

    // Parameterized Constructor
    public quizModel(String questionId, String questionText, String questionSection, List<String> answerOptions, 
                         String correctOption, Integer marks, Integer timeForQuestion, String difficultyLevel, String questionType) {
        this.questionId = questionId;
        this.questionText = questionText;
        this.questionSection = questionSection;
        this.answerOptions = answerOptions;
        this.correctOption = correctOption;
        this.marks = marks;
        this.timeForQuestion = timeForQuestion;
        this.difficultyLevel = difficultyLevel;
        this.questionType = questionType;
    }

    // Getters and Setters
    public String getQuestionId() {
        return questionId;
    }

    public void setQuestionId(String questionId) {
        this.questionId = questionId;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public String getQuestionSection() {
        return questionSection;
    }

    public void setQuestionSection(String questionSection) {
        this.questionSection = questionSection;
    }

    public List<String> getAnswerOptions() {
        return answerOptions;
    }

    public void setAnswerOptions(List<String> answerOptions) {
        this.answerOptions = answerOptions;
    }

    public String getCorrectOption() {
        return correctOption;
    }

    public void setCorrectOption(String correctOption) {
        this.correctOption = correctOption;
    }

    public Integer getMarks() {
        return marks;
    }

    public void setMarks(Integer marks) {
        this.marks = marks;
    }

    public Integer getTimeForQuestion() {
        return timeForQuestion;
    }

    public void setTimeForQuestion(Integer timeForQuestion) {
        this.timeForQuestion = timeForQuestion;
    }

    public String getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(String difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }

    public String getQuestionType() {
        return questionType;
    }

    public void setQuestionType(String questionType) {
        this.questionType = questionType;
    }
}