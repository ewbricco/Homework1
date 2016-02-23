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
    }
    static boolean q1Correct=false;
    static boolean q2Correct=false;

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
