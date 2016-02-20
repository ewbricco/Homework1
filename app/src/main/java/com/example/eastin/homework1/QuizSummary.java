package com.example.eastin.homework1;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;

public class QuizSummary extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_summary);
    }
    public void Quit(View view){
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
    public void GotoQuestions(View view){
        //setContentView(R.layout.activity_questions);
        startActivity(new Intent(this, Questions.class));
    }
}
