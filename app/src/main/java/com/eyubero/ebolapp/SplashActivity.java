package com.eyubero.ebolapp;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
//        Start main activity on an simple mode
//        nextActivity();

//        Launch main activity by thread
//        We need to launch a thread runneable and catch it with a handler, because why want to launch after 3 sec
        Runnable launch = new Runnable() {
            @Override
            public void run() {
                nextActivity();
            }
        };
        Handler mHandler = new Handler();
        mHandler.postDelayed(launch,3000);
    }

    public void nextActivity(){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
