package com.example.eastin.homework1;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;

public class Questions extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_questions);
        FragmentManager fragmentManager = getFragmentManager();

        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        question1 q1 = new question1();
        fragmentTransaction.replace(android.R.id.content, q1);

        fragmentTransaction.commit();

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
