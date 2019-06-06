package team.bupt.is.fourteen.musicgame;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class PianoActivity extends AppCompatActivity {
    private Button mBtnmusic, mBtnmusic1, mBtnmusic2, mBtnmusic3,mBtnmusic4,mBtnmusic5,mBtnmusic6,mBtnmusic7;
    private MediaPlayer mp1, mp3, mp2,mp4,mp5,mp6,mp7,mp; //MediaPlayer引用
    private AudioManager am;//AudioManager引用
    private int max;//最大音量

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_piano);//绑定piano.xml

        mBtnmusic1 = findViewById(R.id.btPanioOne);//mBtnmusic绑定按钮id
        mBtnmusic2 = findViewById(R.id.btPanioTwo);
        mBtnmusic3 = findViewById(R.id.btPanioThree);
        mBtnmusic4 = findViewById(R.id.btPanioFour);
        mBtnmusic5 = findViewById(R.id.btPanioFive);
        mBtnmusic6 = findViewById(R.id.btPanioSix);
        mBtnmusic7 = findViewById(R.id.btPanioSeven);


        mp6 = MediaPlayer.create(this, R.raw.a);//创建MediaPlayer音频
        mp1=MediaPlayer.create(this,R.raw.ba);
        mp2=MediaPlayer.create(this,R.raw.be);
        mp3=MediaPlayer.create(this,R.raw.bo);
        mp4 = MediaPlayer.create(this, R.raw.bu);
        mp5 = MediaPlayer.create(this, R.raw.sa);
        mp7 = MediaPlayer.create(this, R.raw.se);
        mp= MediaPlayer.create(this, R.raw.lemon);
        //调用声音
        am = (AudioManager) this.getSystemService(Context.AUDIO_SERVICE);
        max = am.getStreamMaxVolume(AudioManager.STREAM_MUSIC);
        //mp.start();

        //创建ButtonClickListener
        mBtnmusic4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp4.start();
            }
        });
        mBtnmusic1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp1.start();
            }
        });
        mBtnmusic2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp2.start();
            }
        });
        mBtnmusic3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp3.start();
            }
        });
        mBtnmusic5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp5.start();
            }
        });
        mBtnmusic6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp6.start();
            }
        });
        mBtnmusic7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp7.start();
            }
        });
    }
}
