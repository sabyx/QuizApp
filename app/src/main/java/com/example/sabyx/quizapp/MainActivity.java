package com.example.sabyx.quizapp;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends Activity {

    int score = 0;

    boolean question1Answer1 = false;
    boolean question1Answer2 = false;
    boolean question1Answer3 = false;
    boolean question1Answer4 = false;

    boolean question2Answer1 = false;
    boolean question2Answer2 = false;
    boolean question2Answer3 = false;
    boolean question2Answer4 = false;

    boolean question3Answer3 = false;

    boolean question4Answer1 = false;
    boolean question4Answer2 = false;
    boolean question4Answer3 = false;
    boolean question4Answer4 = false;

    boolean question5Answer1 = false;
    boolean question5Answer2 = false;
    boolean question5Answer3 = false;
    boolean question5Answer4 = false;

    boolean question6Answer1 = false;
    boolean question6Answer2 = false;
    boolean question6Answer3 = false;
    boolean question6Answer4 = false;

    boolean question7Answer1 = false;
    boolean question7Answer2 = false;
    boolean question7Answer3 = false;
    boolean question7Answer4 = false;

    boolean question8Answer1 = false;
    boolean question8Answer2 = false;
    boolean question8Answer3 = false;
    boolean question8Answer4 = false;

    boolean question10Answer1 = false;
    boolean question10Answer2 = false;
    boolean question10Answer3 = false;
    boolean question10Answer4 = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
    }

    public void setQuestion1Answer1(View view) {
        CheckBox checkBox = (CheckBox) findViewById(R.id.question1_answer1);
        question1Answer1 = checkBox.isChecked();
    }

    public void setQuestion1Answer2(View view) {
        CheckBox checkBox = (CheckBox) findViewById(R.id.question1_answer2);
        question1Answer2 = checkBox.isChecked();
    }

    public void setQuestion1Answer3(View view) {
        CheckBox checkBox = (CheckBox) findViewById(R.id.question1_answer3);
        question1Answer3 = checkBox.isChecked();
    }

    public void setQuestion1Answer4(View view) {
        CheckBox checkBox = (CheckBox) findViewById(R.id.question1_answer4);
        question1Answer4 = checkBox.isChecked();
    }

    public void setQuestion2Answer1(View view) {
        CheckBox checkBox = (CheckBox) findViewById(R.id.question2_answer1);
        question2Answer1 = checkBox.isChecked();
    }

    public void setQuestion2Answer2(View view) {
        CheckBox checkBox = (CheckBox) findViewById(R.id.question2_answer2);
        question2Answer2 = checkBox.isChecked();
    }

    public void setQuestion2Answer3(View view) {
        CheckBox checkBox = (CheckBox) findViewById(R.id.question2_answer3);
        question2Answer3 = checkBox.isChecked();
    }

    public void setQuestion2Answer4(View view) {
        CheckBox checkBox = (CheckBox) findViewById(R.id.question2_answer4);
        question2Answer4 = checkBox.isChecked();
    }

    public void setQuestion3Answer3(View view) {
        RadioButton radioButton = (RadioButton) findViewById(R.id.question3_answer3);
        question3Answer3 = radioButton.isChecked();
    }

    public void setQuestion4Answer1(View view) {
        CheckBox checkBox = (CheckBox) findViewById(R.id.question4_answer1);
        question4Answer1 = checkBox.isChecked();
    }

    public void setQuestion4Answer2(View view) {
        CheckBox checkBox = (CheckBox) findViewById(R.id.question4_answer2);
        question4Answer2 = checkBox.isChecked();
    }

    public void setQuestion4Answer3(View view) {
        CheckBox checkBox = (CheckBox) findViewById(R.id.question4_answer3);
        question4Answer3 = checkBox.isChecked();
    }

    public void setQuestion4Answer4(View view) {
        CheckBox checkBox = (CheckBox) findViewById(R.id.question4_answer4);
        question4Answer4 = checkBox.isChecked();
    }

    public void setQuestion5Answer1(View view) {
        CheckBox checkBox = (CheckBox) findViewById(R.id.question5_answer1);
        question5Answer1 = checkBox.isChecked();
    }

    public void setQuestion5Answer2(View view) {
        CheckBox checkBox = (CheckBox) findViewById(R.id.question5_answer2);
        question5Answer2 = checkBox.isChecked();
    }

    public void setQuestion5Answer3(View view) {
        CheckBox checkBox = (CheckBox) findViewById(R.id.question5_answer3);
        question5Answer3 = checkBox.isChecked();
    }

    public void setQuestion5Answer4(View view) {
        CheckBox checkBox = (CheckBox) findViewById(R.id.question5_answer4);
        question5Answer4 = checkBox.isChecked();
    }

    public void setQuestion6Answer1(View view) {
        CheckBox checkBox = (CheckBox) findViewById(R.id.question6_answer1);
        question6Answer1 = checkBox.isChecked();
    }

    public void setQuestion6Answer2(View view) {
        CheckBox checkBox = (CheckBox) findViewById(R.id.question6_answer2);
        question6Answer2 = checkBox.isChecked();
    }

    public void setQuestion6Answer3(View view) {
        CheckBox checkBox = (CheckBox) findViewById(R.id.question6_answer3);
        question6Answer3 = checkBox.isChecked();
    }

    public void setQuestion6Answer4(View view) {
        CheckBox checkBox = (CheckBox) findViewById(R.id.question6_answer4);
        question6Answer4 = checkBox.isChecked();
    }

    public void setQuestion7Answer1(View view) {
        CheckBox checkBox = (CheckBox) findViewById(R.id.question7_answer1);
        question7Answer1 = checkBox.isChecked();
    }

    public void setQuestion7Answer2(View view) {
        CheckBox checkBox = (CheckBox) findViewById(R.id.question7_answer2);
        question7Answer2 = checkBox.isChecked();
    }

    public void setQuestion7Answer3(View view) {
        CheckBox checkBox = (CheckBox) findViewById(R.id.question7_answer3);
        question7Answer3 = checkBox.isChecked();
    }

    public void setQuestion7Answer4(View view) {
        CheckBox checkBox = (CheckBox) findViewById(R.id.question7_answer4);
        question7Answer4 = checkBox.isChecked();
    }

    public void setQuestion8Answer1(View view) {
        CheckBox checkBox = (CheckBox) findViewById(R.id.question8_answer1);
        question8Answer1 = checkBox.isChecked();
    }

    public void setQuestion8Answer2(View view) {
        CheckBox checkBox = (CheckBox) findViewById(R.id.question8_answer2);
        question8Answer2 = checkBox.isChecked();
    }

    public void setQuestion8Answer3(View view) {
        CheckBox checkBox = (CheckBox) findViewById(R.id.question8_answer3);
        question8Answer3 = checkBox.isChecked();
    }

    public void setQuestion8Answer4(View view) {
        CheckBox checkBox = (CheckBox) findViewById(R.id.question8_answer4);
        question8Answer4 = checkBox.isChecked();
    }

    public void setQuestion10Answer1(View view) {
        CheckBox checkBox = (CheckBox) findViewById(R.id.question10_answer1);
        question10Answer1 = checkBox.isChecked();
    }

    public void setQuestion10Answer2(View view) {
        CheckBox checkBox = (CheckBox) findViewById(R.id.question10_answer2);
        question10Answer2 = checkBox.isChecked();
    }

    public void setQuestion10Answer3(View view) {
        CheckBox checkBox = (CheckBox) findViewById(R.id.question10_answer3);
        question10Answer3 = checkBox.isChecked();
    }

    public void setQuestion10Answer4(View view) {
        CheckBox checkBox = (CheckBox) findViewById(R.id.question10_answer4);
        question10Answer4 = checkBox.isChecked();
    }

    public void resetCorrectAnswer(View view) {
        question3Answer3 = false;
    }

    public void wiewResults(View view) {
        if (question1Answer1 == false && question1Answer2 == false && question1Answer3 == false && question1Answer4 == true){
            score += 1;
        }
        if (question2Answer1 == false && question2Answer2 == true && question2Answer3 == false && question2Answer4 == false){
            score += 1;
        }
        if (question3Answer3 == true){
            score += 1;
        }
        if (question4Answer1 == true && question4Answer2 == false && question4Answer3 == false && question4Answer4 == false) {
            score++;
        }
        if (question5Answer1 == false && question5Answer2 == true && question5Answer3 == false && question5Answer4 == false) {
            score++;
        }
        if (question6Answer1 == true && question6Answer2 == true && question6Answer3 == false && question6Answer4 == false) {
            score++;
        }
        if (question7Answer1 == false && question7Answer2 == true && question7Answer3 == false && question7Answer4 == false) {
            score++;
        }
        if (question8Answer1 == true && question8Answer2 == false && question8Answer3 == false && question8Answer4 == false) {
            score++;
        }
        if (question10Answer1 == false && question10Answer2 == false && question10Answer3 == false && question10Answer4 == true) {
            score++;
        }
        String question9Answer = ((EditText) findViewById(R.id.question9_answer)).getText().toString();
        if (question9Answer.equalsIgnoreCase("Voldemort") ){
            score++;
        }

        String resultMessage = "You answered correctly to " + score + " out of 10 questions";
        if (score == 10) {
            resultMessage = "Yay! You answered all the questions correctly!";
        }

        Toast.makeText(this, resultMessage, Toast.LENGTH_LONG).show();
        score = 0;
    }
}
