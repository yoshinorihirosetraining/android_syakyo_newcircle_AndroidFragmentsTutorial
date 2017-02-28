package com.gmail.yoshinorihirosetraining.androidfragmentstutorial;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class RetainingFragment extends Fragment {

    private int count = 0; // variable not saved by Bundle

    @Override
    public View onCreateView(LayoutInflater inflater,
                              ViewGroup container,
                              Bundle savedInstanceState) {
        Log.d(getClass().getSimpleName(), "onCreateView()");
        View view = inflater.inflate(R.layout.retaining_fragment, container, false);

        final CheckBox checkBox = (CheckBox)view.findViewById(R.id.retaining_fragment_checkbox);
        final Button button = (Button)view.findViewById(R.id.retaining_fragment_button);
        final TextView text = (TextView)view.findViewById(R.id.retaining_fragment_text);

        text.setText("" + count);

        if (savedInstanceState != null) {
            checkBox.setChecked(savedInstanceState.getBoolean("check"));
        }

        checkBox.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                setRetainInstance(checkBox.isChecked());
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                count++;
                text.setText("" + count);
            }
        });

        return view;
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        CheckBox checkBox = (CheckBox)(getView().findViewById(R.id.retaining_fragment_checkbox));
        outState.putBoolean("check", checkBox.isChecked());
    }
}
