package com.gmail.yoshinorihirosetraining.androidfragmentstutorial;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class StateSavingFragment extends Fragment {

    private ArrayAdapter<String> adapter;

    //
    // NOTE: ADD UNIQUE ID TO ALL VIEWS OF THE FRAGMENT AND ACTIVITY, OR NOT WORK.
    //
    @Override
    public View onCreateView(LayoutInflater inflater,
                              ViewGroup container,
                              Bundle savedInstanceState) {
        Log.d(getClass().getSimpleName(), "onCreateView()");
        View view = inflater.inflate(R.layout.state_saving_fragment, container, false);

        ArrayList<String> list;
        if (savedInstanceState == null) {
            list = new ArrayList<String>();
        } else {
            list = savedInstanceState.getStringArrayList("data");
        }
        adapter = new ArrayAdapter<String>(
                this.getContext(), android.R.layout.simple_list_item_1, list);
        ((ListView)view.findViewById(R.id.listview_state_saving)).setAdapter(adapter);

        Button button = (Button)view.findViewById(R.id.button_state_saving);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EditText edit = (EditText)(getView().findViewById(R.id.edit_state_saving_msg));
                String text = edit.getEditableText().toString();
                adapter.add(text);
            }
        });

        return view;
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < adapter.getCount(); i++) list.add(adapter.getItem(i));
        outState.putStringArrayList("data", list);
    }
}
