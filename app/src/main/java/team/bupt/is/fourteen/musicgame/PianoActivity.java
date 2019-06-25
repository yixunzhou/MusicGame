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


        mp6 = MediaPlayer.create(this, R.raw.slow6);//创建MediaPlayer音频
        mp1=MediaPlayer.create(this,R.raw.slow1);
        mp2=MediaPlayer.create(this,R.raw.slow2);
        mp3=MediaPlayer.create(this,R.raw.slow3);
        mp4 = MediaPlayer.create(this, R.raw.slow4);
        mp5 = MediaPlayer.create(this, R.raw.slow5);
        mp7 = MediaPlayer.create(this, R.raw.slow7);
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
                }
        });
        mBtnmusic1.setOnClickListener(new View.OnClickListener() {
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
                }
        });
        mBtnmusic2.setOnClickListener(new View.OnClickListener() {
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
            }
        });
        mBtnmusic3.setOnClickListener(new View.OnClickListener() {
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
            }
        });
        mBtnmusic5.setOnClickListener(new View.OnClickListener() {
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
            }
        });
        mBtnmusic6.setOnClickListener(new View.OnClickListener() {
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
            }
        });
        mBtnmusic7.setOnClickListener(new View.OnClickListener() {
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
