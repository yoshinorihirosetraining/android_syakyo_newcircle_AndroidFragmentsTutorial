package com.gmail.yoshinorihirosetraining.androidfragmentstutorial;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class HandlingRuntimeConfigChangeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(getClass().getSimpleName(), "onCreate()");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_handling_runtime_config_change);

        if (savedInstanceState == null) {
            // FragmentManager fragmentManager = getFragmentManager();
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            FirstFragment fragment = new FirstFragment();
            fragmentTransaction.add(R.id.activity_handling_runtime_config_change, fragment);
            fragmentTransaction.commit();
        }
    }
}
