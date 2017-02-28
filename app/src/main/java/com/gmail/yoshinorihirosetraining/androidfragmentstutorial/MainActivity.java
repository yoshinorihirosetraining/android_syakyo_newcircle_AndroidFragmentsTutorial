package com.gmail.yoshinorihirosetraining.androidfragmentstutorial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

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
    @OnClick(R.id.button_runtime_config) public void onClick3(View view) {
        startActivity(new Intent(this, HandlingRuntimeConfigChangeActivity.class)); }
    @OnClick(R.id.button_saving_fragment_state) public void onClick4(View view) {
        startActivity(new Intent(this, StateSavingActivity.class)); }
    @OnClick(R.id.button_retaining) public void onClick5(View view) {
        startActivity(new Intent(this, RetainingActivity.class)); }
    @OnClick(R.id.button_using_fragments_with_no_layouts) public void onClick6(View view) {
        startActivity(new Intent(this, NoLayoutActivity.class)); }
}
