package com.example.eastin.homework1;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.app.Fragment;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Eastin on 2/19/2016.
 */
public class question1 extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.question1, container, false);
    }

    @Override
    public void onPause(){
        super.onPause();
        EditText q1Guess = (EditText) getActivity().findViewById(R.id.q1Guess);
        if(q1Guess.getText().toString().equals("Wisconsin") || q1Guess.getText().toString().equals("wisconsin")){
            Questions.q1Correct=true;
        }
    }
}
