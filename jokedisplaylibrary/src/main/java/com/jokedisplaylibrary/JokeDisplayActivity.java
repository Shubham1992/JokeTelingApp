package com.jokedisplaylibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeDisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_display);
        TextView tvJoke = (TextView) findViewById(R.id.tvJoke);

        if(getIntent() != null)
        tvJoke.setText(getIntent().getStringExtra("joke"));
    }
}
