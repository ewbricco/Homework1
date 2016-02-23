package com.example.eastin.homework1;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
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
        //View pageOfRadioButtons = getLayoutInflater().inflate(R.layout.question2, null);
        //rg = (RadioGroup) pageOfRadioButtons.findViewById(R.id.radioGroup);

    }

    private static final String TAG = Questions.class.getSimpleName();
    static boolean q1Correct=false;
    static boolean q2Correct=false;

    /*public void checkQ1(View v){
        Log.d(TAG, "checking Q1");
        EditText q1Guess = (EditText) v.findViewById(R.id.q1Guess);
        Toast toast = new Toast (getApplicationContext());
        toast.setGravity(Gravity.TOP | Gravity.LEFT, 0, 0);
        toast.makeText(Questions.this, q1Guess.getText(), toast.LENGTH_SHORT).show();
        Log.d(TAG, "q1:" + q1Guess.getText());
        if(q1Guess.getText().toString().equals("Wisconsin") || q1Guess.getText().equals("wisconsin")){
            q1Correct=true;
        }
    }*/


    public void gotoNextQuestion(View view){
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        question2 q2 = new question2();
        fragmentTransaction.replace(android.R.id.content, q2);
        fragmentTransaction.commit();
    }

    public void gotoSummary(View view){
        boolean[] results = new boolean[2];
        results[0] = q1Correct;
        results[1] = q2Correct;
        Intent intent = new Intent(getApplicationContext(), QuizSummary.class);
        intent.putExtra("results", results);
        startActivity(intent);
    }
}
