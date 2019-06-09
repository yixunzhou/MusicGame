package team.bupt.is.fourteen.musicgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button piano;
    private Button kichiku;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        piano = findViewById(R.id.pianoButton);
        kichiku = findViewById(R.id.kichikuButton);

        piano.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Piano2Activity.class);
                startActivity(intent);
            }
        });

        kichiku.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, KichikuActivity.class);
                startActivity(intent);
            }
        });


    }
}
