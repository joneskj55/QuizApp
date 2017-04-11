package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void questionOne(View view) {
        RadioButton numberOneCorrectAnswer = (RadioButton) findViewById(R.id.choice_2_question_1);
        boolean answerForNumberOne = numberOneCorrectAnswer.isChecked();
        if (answerForNumberOne) {
            score = score + 1;
        }
    }

    public void questionTwo(View view) {
        String answerForNumberTwo = "This is it. ";
        EditText numberTwoUserAnswer = (EditText) findViewById(R.id.answer_question_2);
        String userAnswer = numberTwoUserAnswer.getText().toString();

        if (Objects.equals(answerForNumberTwo, userAnswer)) {
            score = score + 1;
        }
    }

    public void questionThree() {

    }

    public void questionFour(View view) {
        RadioButton numberFourCorrectAnswer = (RadioButton) findViewById(R.id.choice_1_question_4);
        boolean answerForNumberFour = numberFourCorrectAnswer.isChecked();
        if (answerForNumberFour) {
            score = score + 1;
        }
    }

    public void questionFive(View view) {
        RadioButton numberFiveCorrectAnswer = (RadioButton) findViewById(R.id.choice_3_question_5);
        boolean answerForNumberFive = numberFiveCorrectAnswer.isChecked();
        if (answerForNumberFive) {
            score = score + 1;
        }
    }

    public void submitTest(View view) {
        questionTwo(view);
        Toast.makeText(this, "Your score: " + score + "/5", Toast.LENGTH_SHORT).show();
    }
}
