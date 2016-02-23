package com.example.eastin.homework1;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.view.View.OnClickListener;

/**
 * Created by Eastin on 2/19/2016.
 */
public class question2 extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.question2, container, false);
    }

    /*@Override
    public void onAttach(Activity activity){
        super.onAttach(activity);
        mActivity = activity;
    }*/
    public void onActivityCreated (Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);

        RadioButton r1 = (RadioButton) getActivity().findViewById(R.id.radioButton1);
        RadioButton r2 = (RadioButton) getActivity().findViewById(R.id.radioButton2);
        RadioButton r3 = (RadioButton) getActivity().findViewById(R.id.radioButton3);

        r1.setOnClickListener(next_Listener);
        r2.setOnClickListener(next_Listener);
        r3.setOnClickListener(next_Listener);
    }

    private static final String TAG = question2.class.getSimpleName();

    private OnClickListener next_Listener = new OnClickListener(){
        public void onClick(View v){
            RadioGroup rg = (RadioGroup) getActivity().findViewById(R.id.radioGroup);
            RadioButton r1 = (RadioButton) getActivity().findViewById(R.id.radioButton1);
            RadioButton r2 = (RadioButton) getActivity().findViewById(R.id.radioButton2);
            RadioButton r3 = (RadioButton) getActivity().findViewById(R.id.radioButton3);
            if (r1.isChecked()) {
                Log.d(TAG, "1776 check");
                Toast.makeText(getActivity(), "1776", Toast.LENGTH_LONG).show();
                Questions.q2Correct = false;
            }
            if (r2.isChecked()) {
                Log.d(TAG, "1913 check");
                Toast.makeText(getActivity(), "1913", Toast.LENGTH_LONG).show();
                Questions.q2Correct = false;
            }
            if (r3.isChecked()) {
                Log.d(TAG, "1848 check");
                Toast.makeText(getActivity(), "1848", Toast.LENGTH_LONG).show();
                Questions.q2Correct = true;
            }
        }
    };
}
