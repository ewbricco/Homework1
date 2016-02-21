package com.example.eastin.homework1;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Questions extends Activity {
    RadioGroup rg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        question1 q1 = new question1();
        fragmentTransaction.replace(android.R.id.content, q1);
        fragmentTransaction.commit();
        View pageOfRadioButtons = getLayoutInflater().inflate(R.layout.question2, null);
        rg = (RadioGroup) pageOfRadioButtons.findViewById(R.id.radioGroup); //rg is null, need to add some View before findView...
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton r1 = (RadioButton) findViewById(R.id.radioButton1);
                RadioButton r2 = (RadioButton) findViewById(R.id.radioButton2);
                if(r1.isChecked()){
                    Toast.makeText(getBaseContext(), "1776", Toast.LENGTH_LONG).show();
                }
                else if(r2.isChecked()){
                    Toast.makeText(getBaseContext(), "1913", Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(getBaseContext(), "1848", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
    private EditText q1Guess;
    boolean q1Correct;
    boolean q2Correct;

    public void checkQ1(View v){
        Button button = (Button) v;
        q1Guess = (EditText) findViewById(R.id.q1Guess);
        Toast toast = new Toast (getApplicationContext());
        toast.setGravity(Gravity.TOP | Gravity.LEFT, 0, 0);
        toast.makeText(Questions.this, q1Guess.getText(), toast.LENGTH_SHORT).show();

    }


    public void gotoNextQuestion(View view){
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        question2 q2 = new question2();
        fragmentTransaction.replace(android.R.id.content, q2);
        fragmentTransaction.commit();

    }

    public void gotoSummary(View view){
        startActivity(new Intent(this, QuizSummary.class));
    }
}
