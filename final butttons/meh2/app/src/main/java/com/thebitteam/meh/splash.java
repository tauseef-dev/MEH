package com.thebitteam.meh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Thread thread=new Thread(){
            @Override
            public void run() {
                try {
                    sleep(1500);
                    Intent intent=new Intent(getBaseContext(),MainActivity.class);
                    startActivity(intent);
                }catch (Exception e){

                }
            }
        };
        thread.start();
    }
}
