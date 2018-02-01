package com.eyubero.ebolapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
//        Start main activity on an simple mode
        nextActivity();

    }

    public void nextActivity(){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
