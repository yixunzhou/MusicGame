package com.example.win10.piano;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button piano;
    private Button kichiku;
    private TextView t1,t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1=findViewById(R.id.piano);
        t2=findViewById(R.id.kichuku);
        piano = findViewById(R.id.pianoButton);
        kichiku = findViewById(R.id.kichikuButton);
        t1.setClickable(true);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent = new Intent(MainActivity.this, PianoActivity.class);
                Intent intt=new Intent(MainActivity.this,PianoActivity.class);
                startActivity(intt);
            }
        });
        t2.setClickable(true);
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent = new Intent(MainActivity.this, PianoActivity.class);
                Intent intt=new Intent(MainActivity.this,KichikuActivity.class);
                startActivity(intt);
            }
        });
        piano.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent = new Intent(MainActivity.this, PianoActivity.class);
                Intent intt=new Intent(MainActivity.this,PianoActivity.class);
                startActivity(intt);
            }
        });

        kichiku.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent = new Intent(MainActivity.this, KichikuActivity.class);
                Intent inttt=new Intent(MainActivity.this,KichikuActivity.class);
                startActivity(inttt);
            }
        });


    }
}
