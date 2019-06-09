package team.bupt.is.fourteen.musicgame;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class KichikuActivity extends AppCompatActivity {
    private Button button1, button2, button3, button4, button5, button6, button7, button8, bgmButton;
    private MediaPlayer mp, mp1, mp3, mp2,mp4,mp5,mp6,mp7, mp8;
    private AudioManager am;
    private int max;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kichiku);

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        bgmButton = findViewById(R.id.bgmButton);



        mp = MediaPlayer.create(this, R.raw.lemon);
        mp1 = MediaPlayer.create(this,R.raw.jkl);
        mp2 = MediaPlayer.create(this,R.raw.jnpgc);
        mp3 = MediaPlayer.create(this,R.raw.fuhrer);
        mp4 = MediaPlayer.create(this, R.raw.zgl);
        mp5 = MediaPlayer.create(this, R.raw.lover);
        mp6 = MediaPlayer.create(this, R.raw.nice);
        mp7 = MediaPlayer.create(this, R.raw.lff);
        mp8 = MediaPlayer.create(this, R.raw.duang);

        am = (AudioManager) this.getSystemService(Context.AUDIO_SERVICE);
        max = am.getStreamMaxVolume(AudioManager.STREAM_MUSIC);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp1.start();
                if(mp6.isPlaying()){
                    mp6.pause();
                }
                if(mp2.isPlaying()){
                    mp2.pause();
                }
                if(mp3.isPlaying()){
                    mp3.pause();
                }
                if(mp4.isPlaying()){
                    mp4.pause();
                }
                if(mp5.isPlaying()){
                    mp5.pause();
                }
                if(mp7.isPlaying()){
                    mp7.pause();
                }
                if(mp8.isPlaying()){
                    mp8.pause();
                }
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp2.start();
                if(mp1.isPlaying()){
                    mp1.pause();
                }
                if(mp6.isPlaying()){
                    mp6.pause();
                }
                if(mp3.isPlaying()){
                    mp3.pause();
                }
                if(mp4.isPlaying()){
                    mp4.pause();
                }
                if(mp5.isPlaying()){
                    mp5.pause();
                }

                if(mp7.isPlaying()){
                    mp7.pause();
                }
                if(mp8.isPlaying()){
                    mp8.pause();
                }
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp3.start();
                if(mp1.isPlaying()){
                    mp1.pause();
                }
                if(mp2.isPlaying()){
                    mp2.pause();
                }
                if(mp6.isPlaying()){
                    mp6.pause();
                }
                if(mp4.isPlaying()){
                    mp4.pause();
                }
                if(mp5.isPlaying()){
                    mp5.pause();
                }
                if(mp7.isPlaying()){
                    mp7.pause();
                }
                if(mp8.isPlaying()){
                    mp8.pause();
                }
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp4.start();
                if(mp1.isPlaying()){
                    mp1.pause();
                }
                if(mp2.isPlaying()){
                    mp2.pause();
                }
                if(mp3.isPlaying()){
                    mp3.pause();
                }
                if(mp6.isPlaying()){
                    mp6.pause();
                }
                if(mp5.isPlaying()){
                    mp5.pause();
                }
                if(mp7.isPlaying()){
                    mp7.pause();
                }
                if(mp8.isPlaying()){
                    mp8.pause();
                }
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp5.start();
                if(mp1.isPlaying()){
                    mp1.pause();
                }
                if(mp2.isPlaying()){
                    mp2.pause();
                }
                if(mp3.isPlaying()){
                    mp3.pause();
                }
                if(mp4.isPlaying()){
                    mp4.pause();
                }
                if(mp6.isPlaying()){
                    mp6.pause();
                }
                if(mp7.isPlaying()){
                    mp7.pause();
                }
                if(mp8.isPlaying()){
                    mp8.pause();
                }
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp6.start();
                if(mp1.isPlaying()){
                    mp1.pause();
                }
                if(mp2.isPlaying()){
                    mp2.pause();
                }
                if(mp3.isPlaying()){
                    mp3.pause();
                }
                if(mp4.isPlaying()){
                    mp4.pause();
                }
                if(mp5.isPlaying()){
                    mp5.pause();
                }
                if(mp7.isPlaying()){
                    mp7.pause();
                }
                if(mp8.isPlaying()){
                    mp8.pause();
                }
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp7.start();
                if(mp1.isPlaying()){
                    mp1.pause();
                }
                if(mp2.isPlaying()){
                    mp2.pause();
                }
                if(mp3.isPlaying()){
                    mp3.pause();
                }
                if(mp4.isPlaying()){
                    mp4.pause();
                }
                if(mp5.isPlaying()){
                    mp5.pause();
                }
                if(mp6.isPlaying()){
                    mp6.pause();
                }
                if(mp8.isPlaying()){
                    mp8.pause();
                }
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp8.start();
                if(mp1.isPlaying()){
                    mp1.pause();
                }
                if(mp2.isPlaying()){
                    mp2.pause();
                }
                if(mp3.isPlaying()){
                    mp3.pause();
                }
                if(mp4.isPlaying()){
                    mp4.pause();
                }
                if(mp5.isPlaying()){
                    mp5.pause();
                }
                if(mp6.isPlaying()){
                    mp6.pause();
                }
                if(mp7.isPlaying()){
                    mp7.pause();
                }
            }
        });

        bgmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!mp.isPlaying()){
                    mp.start();
                }
            }
        });
    }
    //重写onStop,当piano界面完全被覆盖释放mp
    @Override
    protected void onStop() {
        super.onStop();
        mp1.release();
        mp2.release();
        mp3.release();
        mp4.release();
        mp5.release();
        mp6.release();
        mp7.release();
    }
}

