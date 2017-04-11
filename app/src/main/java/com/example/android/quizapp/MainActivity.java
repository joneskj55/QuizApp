package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
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

    public void questionThree(View view) {
        CheckBox firstCorrectChoice = (CheckBox) findViewById(R.id.choice_1_question_3);
        CheckBox secondCorrectChoice = (CheckBox) findViewById(R.id.choice_2_question_3);
        CheckBox thirdCorrectChoice = (CheckBox) findViewById(R.id.choice_3_question_3);
        boolean userFirstCorrect = firstCorrectChoice.isChecked();
        boolean userSecondCorrect = secondCorrectChoice.isChecked();
        boolean userThirdCorrect = thirdCorrectChoice.isChecked();

        if (userFirstCorrect && userSecondCorrect && userThirdCorrect) {
            score = score + 1;
        }
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
