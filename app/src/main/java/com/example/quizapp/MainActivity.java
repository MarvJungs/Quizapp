package com.example.quizapp;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private final QuestionRepository questionRepository = new QuestionRepository();
    private Question q;
    private TextView txtView_question;
    private Button[] answers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        txtView_question = findViewById(R.id.txtView_question);
        answers = new Button[] {
                findViewById(R.id.btn_answer1),
                findViewById(R.id.btn_answer2),
                findViewById(R.id.btn_answer3),
                findViewById(R.id.btn_answer4)
        };

        drawQuestion();
        this.displayQuestion();
    }

    public void checkAnswer(View view) {
        for (int i = 0; i < answers.length; i++) {
            if (view.getId() == answers[i].getId()) {
                if (q.getCorrectAnswer() != i) {
                    answers[i].setEnabled(false);
                } else {
                    drawQuestion();
                    displayQuestion();
                    return;
                }
            }
        }
    }

    private void drawQuestion() {
        q = questionRepository.getRandomQuestion();
    }
    
    private void displayQuestion() {
        for (Button answer: answers) {
            answer.setEnabled(true);
        }
        txtView_question.setText(q.getQuestion());
        for (int i = 0; i < answers.length; i++) {
            try {
                answers[i].setText(q.getAnswer(i));
            } catch (Exception e) {
                Log.e(getResources().getString(R.string.app_name), e.getMessage());
            }
        }
    }
}