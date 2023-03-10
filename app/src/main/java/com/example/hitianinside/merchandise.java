package com.example.hitianinside;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;

public class merchandise extends AppCompatActivity {
    VideoView videoView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_merchandise);
        videoView2 = findViewById(R.id.videoView2);
        Uri uri =Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.hit);
        videoView2.setVideoURI(uri);
        videoView2.start();
        videoView2.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setLooping(true);

            }
        });
    }
}