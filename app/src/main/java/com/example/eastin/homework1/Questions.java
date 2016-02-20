package com.example.eastin.homework1;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;

public class Questions extends Activity {

    int questionNumber = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_questions);
        frags();




    }

    public void frags(){
        FragmentManager fragmentManager = getFragmentManager();

        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        if(questionNumber == 1){
            question1 q1 = new question1();
            fragmentTransaction.replace(android.R.id.content, q1);
        }
        else{
            question2 q2 = new question2();
            fragmentTransaction.replace(android.R.id.content, q2);
        }

        fragmentTransaction.commit();
    }

    public void gotoNextQuestion(){
        questionNumber++;
        frags();
    }

}
