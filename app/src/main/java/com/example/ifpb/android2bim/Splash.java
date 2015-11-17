package com.example.ifpb.android2bim;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;

import java.util.Timer;
import java.util.TimerTask;


public class Splash extends Activity{


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        new Timer().schedule(new TimerTask() {

            @Override
            public void run() {
                finish();

                Intent intent = new Intent();
                intent.setClass(Splash.this, MainActivity.class);
                startActivity(intent);
            }
        }, 4000);
    }


}