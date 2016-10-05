package com.example.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public final static String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    private final static String LOG_TAG = "MainActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.edit_message);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
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
