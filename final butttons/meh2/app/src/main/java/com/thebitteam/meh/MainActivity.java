package com.thebitteam.meh;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    ProgressBar progressBar;
ImageView symptom;
ImageView mediplayer;
ImageView nearby;
ImageView games;
ImageView mailto;
ImageView cht_sess;
ImageView about_us;
ImageView forum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        progressBar = findViewById(R.id.main_progressbaR);


        symptom=(ImageView) findViewById(R.id.symptoms);
        mediplayer=(ImageView) findViewById(R.id.media);
        nearby=(ImageView) findViewById(R.id.nearby);
        games=findViewById(R.id.games);
        cht_sess=findViewById(R.id.chatroom);
        mailto=findViewById(R.id.mail);
        about_us=findViewById(R.id.about_us);
        forum=findViewById(R.id.forum);
        about_us=findViewById(R.id.about_us);


        symptom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, SymptomCheckingActivity.class));
            }
        });

        mediplayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, songActivity.class));
            }
        });

        nearby.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, nearby_Psych.class));
            }
        });
        games.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, games.class));
            }
        });

        mailto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=null, chooser=null;
                intent=new Intent(Intent.ACTION_SEND);
                intent.setData(Uri.parse("mailto:"));
                String[] to={"help@jevanaastha.com"};
                intent.putExtra(Intent.EXTRA_EMAIL,to);
                intent.putExtra(Intent.EXTRA_SUBJECT,"REGARDING MENTAL HEALTH ISSUE!");
                intent.setType("message/rfc822");
                chooser=Intent.createChooser(intent,"Send Email");
                startActivity(chooser);

            }
        });

        cht_sess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, chat_sessio.class));
            }
        });
        forum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, forum.class));
            }
        });
        about_us.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, about_us.class));
            }
        });




    }
}

