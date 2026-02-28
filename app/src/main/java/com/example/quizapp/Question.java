package com.example.quizapp;

public class Question {
    private String question;
    private String[] answers;
    private int correctAnswer;

    public Question(String question, String[] answers, int correctAnswer) {
        this.question = question;
        this.answers = answers;
        this.correctAnswer = correctAnswer;
    }

    public String getQuestion() {
        return this.question;
    }

    public String getAnswer(int index) throws Exception {
        if (index > this.answers.length || index < 0) {
            throw new Exception("Answer not found");
        } else {
            return this.answers[index];
        }
    }

    public int getCorrectAnswer() {
        return this.correctAnswer;
    }
}
