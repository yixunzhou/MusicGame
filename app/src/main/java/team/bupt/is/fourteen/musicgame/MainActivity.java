package team.bupt.is.fourteen.musicgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button piano;
    private Button nineButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        piano = findViewById(R.id.pianoButton);
        nineButton = findViewById(R.id.nineButton);

        piano.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PianoActivity.class);// 你的类命名为PianoActivity.java,别忘了在manifest里注册
                startActivity(intent);
            }
        });

        nineButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, NineButtonActivity.class);
                startActivity(intent);
            }
        });


    }
}
