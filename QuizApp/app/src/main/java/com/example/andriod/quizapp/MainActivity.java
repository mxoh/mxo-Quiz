package com.example.andriod.quizapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    int result1, result2, result3, result4, result5, result6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void RadioButtonClicked(View view) {
        boolean checked = ((RadioButton)view).isChecked();

        switch (view.getId()) {
//Question A
            case R.id.rBtn_a1:
                if (checked)
                    result1 = 0;
                break;

            case R.id.rBtn_a2:
                if (checked)
                    result1 += 1;
                break;

            case R.id.rBtn_a3:
                if (checked)
                    result1 = 0;
                break;
//Question B
            case R.id.rBtn_b1:
                if (checked)
                    result2 = 0;
                break;

            case R.id.rBtn_b2:
                if (checked)
                    result2 += 1;
                break;

            case R.id.rBtn_b3:
                if (checked)
                    result2 = 0;
                break;
//Question C
            case R.id.rBtn_c1:
                if (checked)
                    result3 = 0;
                break;

            case R.id.rBtn_c2:
                if (checked)
                    result3 += 1;
                break;

            case R.id.rBtn_c3:
                if (checked)
                    result3 = 0;
                break;
//Question D
            case R.id.rBtn_d1:
                if (checked)
                    result4 += 1;
                break;

            case R.id.rBtn_d2:
                if (checked)
                    result4 = 0;
                break;

            case R.id.rBtn_d3:
                if (checked)
                    result4 = 0;
                break;
        }
    }

    public void onCheckboxClicked(View view) {
        switch (view.getId()) {
            case R.id.checkbox_e1:
                qE_CheckBox();
                break;
            case R.id.checkbox_e2:
                qE_CheckBox();
                break;
            case R.id.checkbox_e3:
                qE_CheckBox();
                break;
        }
    }

    private void qE_CheckBox() {
        /*QUESTION F CHECKBOXES*/
        CheckBox checkBoxE1 = findViewById(R.id.checkbox_e1);
        CheckBox checkBoxE2 = findViewById(R.id.checkbox_e2);
        CheckBox checkBoxE3 = findViewById(R.id.checkbox_e3);

        boolean rightAnswer = checkBoxE1.isChecked() && checkBoxE3.isChecked();
        boolean wrongAnswer = checkBoxE2.isChecked();

        if (rightAnswer && !wrongAnswer){
            result5 =+ 1;
        }else {
            result5 = 0;
        }
    }

    private void questionA() {

        RadioButton bnt1 = findViewById(R.id.rBtn_a1);
        RadioButton bnt2 = findViewById(R.id.rBtn_a2);
        RadioButton bnt3 = findViewById(R.id.rBtn_a3);

        String correctAnswer = "The correct answer is Google";

        if (bnt1.isChecked()) {
            bnt1.setBackgroundColor(Color.RED);
            TextView answer = findViewById(R.id.answerA);
            answer.setText(correctAnswer);
            answer.setTextColor(Color.GREEN);
            answer.setVisibility(View.VISIBLE);

        } else if (bnt3.isChecked()) {
            bnt3.setBackgroundColor(Color.RED);
            TextView answer = findViewById(R.id.answerA);
            answer.setText(correctAnswer);
            answer.setTextColor(Color.GREEN);
            answer.setVisibility(View.VISIBLE);

        }
        bnt1.setEnabled(false);
        bnt2.setChecked(true);
        bnt3.setEnabled(false);
    }

    private void questionB() {
        RadioButton bnt1 = findViewById(R.id.rBtn_b1);
        RadioButton bnt2 = findViewById(R.id.rBtn_b2);
        RadioButton bnt3 = findViewById(R.id.rBtn_b3);

        String correctAnswer = "The correct answer is Facebook";

        if (bnt1.isChecked()) {
            bnt1.setBackgroundColor(Color.RED);
            TextView answer = findViewById(R.id.answerB);
            answer.setText(correctAnswer);
            answer.setTextColor(Color.GREEN);
            answer.setVisibility(View.VISIBLE);

        } else if (bnt3.isChecked()) {
            bnt3.setBackgroundColor(Color.RED);
            TextView answer = findViewById(R.id.answerB);
            answer.setText(correctAnswer);
            answer.setTextColor(Color.GREEN);
            answer.setVisibility(View.VISIBLE);
        }
        bnt1.setEnabled(false);
        bnt2.setChecked(true);
        bnt3.setEnabled(false);
    }

    private void questionC() {
        RadioButton bnt1 = findViewById(R.id.rBtn_c1);
        RadioButton bnt2 = findViewById(R.id.rBtn_c2);
        RadioButton bnt3 = findViewById(R.id.rBtn_c3);

        String correctAnswer = "The correct answer is Android";

        if (bnt1.isChecked()) {
            bnt1.setBackgroundColor(Color.RED);
            TextView answer = findViewById(R.id.answerC);
            answer.setText(correctAnswer);
            answer.setTextColor(Color.GREEN);
            answer.setVisibility(View.VISIBLE);

        } else if (bnt3.isChecked()) {
            bnt3.setBackgroundColor(Color.RED);
            TextView answer = findViewById(R.id.answerC);
            answer.setText(correctAnswer);
            answer.setTextColor(Color.GREEN);
            answer.setVisibility(View.VISIBLE);
        }
        bnt1.setEnabled(false);
        bnt2.setChecked(true);
        bnt3.setEnabled(false);
    }

    private void questionD() {
        RadioButton bnt1 = findViewById(R.id.rBtn_d1);
        RadioButton bnt2 = findViewById(R.id.rBtn_d2);
        RadioButton bnt3 = findViewById(R.id.rBtn_d3);

        String correctAnswer = "The correct answer is Java has a huge developer community";

        if (bnt2.isChecked()) {
            bnt2.setBackgroundColor(Color.RED);
            TextView answer = findViewById(R.id.answerD);
            answer.setText(correctAnswer);
            answer.setTextColor(Color.GREEN);
            answer.setVisibility(View.VISIBLE);

        } else if (bnt3.isChecked()) {
            bnt3.setBackgroundColor(Color.RED);
            TextView answer = findViewById(R.id.answerD);
            answer.setText(correctAnswer);
            answer.setTextColor(Color.GREEN);
            answer.setVisibility(View.VISIBLE);
        }
        bnt1.setChecked(true);
        bnt2.setEnabled(false);
        bnt3.setEnabled(false);
    }

    private void questionE() {
        CheckBox checkBoxE1 = findViewById(R.id.checkbox_e1);
        CheckBox checkBoxE2 = findViewById(R.id.checkbox_e2);
        CheckBox checkBoxE3 = findViewById(R.id.checkbox_e3);

        String correctAnswer = "The correct answer is Behavior and Attributes only";
        boolean wrongAnswer = checkBoxE2.isChecked();

        if (wrongAnswer) {
            checkBoxE2.setBackgroundColor(Color.RED);
            TextView answer = findViewById(R.id.answerE);
            answer.setText(correctAnswer);
            answer.setTextColor(Color.GREEN);
            answer.setVisibility(View.VISIBLE);
        }

        boolean rightAnswer = checkBoxE1.isChecked() && checkBoxE3.isChecked();
        boolean wrongAnswer1 = rightAnswer &&  wrongAnswer;
        boolean wrongAnswer2 = checkBoxE1.isChecked() && checkBoxE2.isChecked();
        boolean wrongAnswer3 = checkBoxE3.isChecked();
        boolean wrongAnswer4 = checkBoxE2.isChecked() && checkBoxE3.isChecked();
        boolean wrongAnswer5 = checkBoxE1.isChecked();

        if (wrongAnswer1){
            TextView answer = findViewById(R.id.answerE);
            answer.setText(correctAnswer);
            answer.setTextColor(Color.GREEN);
            answer.setVisibility(View.VISIBLE);

        } else if (!wrongAnswer2 && wrongAnswer3) {
            TextView answer = findViewById(R.id.answerE);
            answer.setText(correctAnswer);
            answer.setTextColor(Color.GREEN);
            answer.setVisibility(View.VISIBLE);

        } else if (!wrongAnswer4 && wrongAnswer5) {
            TextView answer = findViewById(R.id.answerE);
            answer.setText(correctAnswer);
            answer.setTextColor(Color.GREEN);
            answer.setVisibility(View.VISIBLE);

        }
        if (rightAnswer && !wrongAnswer) {
            TextView answer = findViewById(R.id.answerE);
            answer.setText(null);
            answer.setVisibility(View.GONE);
        }
        checkBoxE1.setChecked(true);
        checkBoxE2.setEnabled(false);
        checkBoxE3.setChecked(true);
    }

    private void questionF() {
        EditText inputText = findViewById(R.id.inputTxt);
        String correctAnswer = "Oreo";
        String correction = String.format("The correct answer is %s",correctAnswer);
        String userAnswer = inputText.getText().toString();

        if (userAnswer.trim().equalsIgnoreCase(correctAnswer)) {
            result6 += 1;
        } else {
            TextView answer = findViewById(R.id.answerF);
            answer.setText(correction);
            answer.setTextColor(Color.GREEN);
            answer.setVisibility(View.VISIBLE);
        }
        inputText.setEnabled(false);
    }

    public void submit(View view) {
        RadioGroup radioGroup1 = findViewById(R.id.radioGroup1);
        RadioGroup radioGroup2 = findViewById(R.id.radioGroup2);
        RadioGroup radioGroup3 = findViewById(R.id.radioGroup3);
        RadioGroup radioGroup4 = findViewById(R.id.radioGroup4);

        CheckBox checkBox1 = findViewById(R.id.checkbox_e1);
        CheckBox checkBox2 = findViewById(R.id.checkbox_e2);
        CheckBox checkBox3 = findViewById(R.id.checkbox_e3);

        EditText editText = findViewById(R.id.inputTxt);

        boolean checked = checkBox1.isChecked() || checkBox2.isChecked() || checkBox3.isChecked();
        /*
        * ITS CHECK IF THE RADIO BTN CHECKBOX IS CHECKED
        */
        if (radioGroup1.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Question A is not answered", Toast.LENGTH_SHORT).show();

        }else if (radioGroup2.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Question B is not answered", Toast.LENGTH_SHORT).show();

        }else if (radioGroup3.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Question C is not answered", Toast.LENGTH_SHORT).show();

        }else if (radioGroup4.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Question D is not answered", Toast.LENGTH_SHORT).show();

        }else if (!checked) {
            Toast.makeText(this, "Question E is not answered", Toast.LENGTH_SHORT).show();

        } else if (editText.length() == 0) {
            Toast.makeText(this, "Question F is not answered", Toast.LENGTH_SHORT).show();

        } else {
            questionA();
            questionB();
            questionC();
            questionD();
            questionE();
            questionF();

            int score = result1 + result2 + result3 + result4 + result5 + result6;

            if (score <= 2){
                Toast.makeText(this,"Not good", Toast.LENGTH_SHORT).show();

            }else if(score <= 3){
                Toast.makeText(this,"GOOD", Toast.LENGTH_SHORT).show();

            }else{

                Toast.makeText(this, "EXCELLENT", Toast.LENGTH_SHORT).show();
            }
            String totalScore = String.format("TOTAL SCORE: %s/6",score);
//TOTAL RESULT TOAST
            Toast.makeText(this,totalScore,Toast.LENGTH_LONG).show();

            Button submit = findViewById(R.id.submitBTN);
            submit.setEnabled(false);
        }

    }
}
