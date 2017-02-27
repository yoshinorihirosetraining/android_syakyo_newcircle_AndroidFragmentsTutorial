package com.gmail.yoshinorihirosetraining.androidfragmentstutorial;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class FirstFragment extends Fragment implements View.OnClickListener {
    @Override
    public View onCreateView(LayoutInflater inflater,
                              ViewGroup container,
                              Bundle savedInstanceState) {
        Log.d(getClass().getSimpleName(), "onCreate()");
        View view = inflater.inflate(R.layout.first_fragment, container, false);
        Button nextButton = (Button)view.findViewById(R.id.button_first);
        nextButton.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View view) {
        ;
    }
}
