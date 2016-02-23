package com.example.eastin.homework1;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.TextView;

public class QuizSummary extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_summary);
        Bundle extras = getIntent().getExtras();
        boolean[] results = extras.getBooleanArray("results");
        TextView result1 = (TextView)findViewById(R.id.textView5);
        TextView result2 = (TextView)findViewById(R.id.textView6);
        String q1Correct;
        String q2Correct;
        if(results[0]){
            q1Correct = "correct";
        }
        else{
            q1Correct = "incorrect";
        }
        if(results[1]){
            q2Correct = "correct";
        }
        else{
            q2Correct = "incorrect";
        }

        result1.setText("Question 1 was " + q1Correct);
        result2.setText("Question 2 was " + q2Correct);
    }

    public void Quit(View view){
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
    public void GotoQuestions(View view){
        //setContentView(R.layout.activity_questions);
        Questions.q2Correct=false;
        Questions.q1Correct=false;
        startActivity(new Intent(this, Questions.class));
    }
}
