package com.gmail.yoshinorihirosetraining.androidfragmentstutorial;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.button_statically_including) public void onClick1(View view) {
        startActivity(new Intent(this, FirstStaticallyEmbeddingActivity.class)); }
    @OnClick(R.id.button_dynamically_adding) public void onClick2(View view) {
        startActivity(new Intent(this, FirstDynamicallyAddingActivity.class)); }
}
