package com.example.android.quizapp;

import android.os.PersistableBundle;
import android.support.annotation.Nullable;
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

    //check all answers, display toast message with score
    public void submitTest(View view) {
        //question 1
        RadioButton numberOneCorrectAnswer = (RadioButton) findViewById(R.id.choice_2_question_1);
        boolean answerForNumberOne = numberOneCorrectAnswer.isChecked();
        if (answerForNumberOne) {
            score = score + 1;
        }

        //question 2
        String answerForNumberTwo = "This is it. ";
        EditText numberTwoUserAnswer = (EditText) findViewById(R.id.answer_question_2);
        String userAnswer = numberTwoUserAnswer.getText().toString();

        if (Objects.equals(answerForNumberTwo, userAnswer)) {
            score = score + 1;
        }

        //question 3
        CheckBox firstCorrectChoice = (CheckBox) findViewById(R.id.choice_1_question_3);
        CheckBox secondCorrectChoice = (CheckBox) findViewById(R.id.choice_2_question_3);
        CheckBox thirdCorrectChoice = (CheckBox) findViewById(R.id.choice_3_question_3);
        CheckBox fourthCheckBox = (CheckBox) findViewById(R.id.choice_4_question_3);

        boolean userFirstCorrect = firstCorrectChoice.isChecked();
        boolean userSecondCorrect = secondCorrectChoice.isChecked();
        boolean userThirdCorrect = thirdCorrectChoice.isChecked();
        boolean userFourthCheckBox = fourthCheckBox.isChecked();

        if (userFirstCorrect && userSecondCorrect && userThirdCorrect) {
            score = score + 1;
        }

        //question 4
        RadioButton numberFourCorrectAnswer = (RadioButton) findViewById(R.id.choice_1_question_4);
        boolean answerForNumberFour = numberFourCorrectAnswer.isChecked();
        if (answerForNumberFour) {
            score = score + 1;
        }

        //question 5
        RadioButton numberFiveCorrectAnswer = (RadioButton) findViewById(R.id.choice_3_question_5);
        boolean answerForNumberFive = numberFiveCorrectAnswer.isChecked();
        if (answerForNumberFive) {
            score = score + 1;
        }

        //if user selected fourth checkbox they will lose a point
        if (userFourthCheckBox) {
            score = score - 1;
        }

        Toast.makeText(this, "Your score: " + score + "/5", Toast.LENGTH_SHORT).show();
        score = 0; //resets score
        setContentView(R.layout.activity_main); //resets test
    }
}


