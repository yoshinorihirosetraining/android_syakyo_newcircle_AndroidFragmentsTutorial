package com.gmail.yoshinorihirosetraining.androidfragmentstutorial;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class NoLayoutFragment extends Fragment {

    SimpleTask task;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Button button = (Button)getActivity().findViewById(R.id.button_no_layout);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startTask();
            }
        });
    }

    public void startTask() {
        if (task != null) {
            task.cancel(true);
        }
        task = new SimpleTask();
        task.execute();
    }

    /**
     * AsyncTask class only waiting.
     */
    public class SimpleTask extends AsyncTask<Void, Integer, Void> {
        @Override
        public Void doInBackground(Void... args) {
            try {
                for (int i = 0; i < 100; i++) {
                    Thread.sleep(100);
                    publishProgress(new Integer(i));
                }
            } catch (InterruptedException e) {
                ;
            }
            return null;
        }

        @Override
        public void onProgressUpdate(Integer... progresses) {
            ProgressBar progressBar
                    = (ProgressBar)(getActivity().findViewById(R.id.progressbar_no_layout));
            progressBar.setProgress(progresses[0].intValue());
        }
    }
}
