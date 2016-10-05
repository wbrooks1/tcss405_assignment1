package com.example.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    private final static String LOG_TAG = "DisplayMessageActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(message);

        ViewGroup layout = (ViewGroup) findViewById(R.id.activity_display_message);
        layout.addView(textView);
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(LOG_TAG, "App has been paused.");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i(LOG_TAG, "App has been resumed or initialized.");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.w(LOG_TAG, "App has been stopped");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.v(LOG_TAG, "App has been started");
    }

    @Override
    public void onRestart() {
        super.onRestart();
        Log.e(LOG_TAG, "App has been restarted");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e(LOG_TAG, "App has been DESTROYED!!");
    }
}
