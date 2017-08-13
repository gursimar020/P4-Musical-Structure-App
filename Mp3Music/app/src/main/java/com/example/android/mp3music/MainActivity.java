package com.example.android.mp3music;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

import com.example.android.mp3music.Playlist;
import com.example.android.mp3music.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageView pause = (ImageView) findViewById(R.id.pause);
        ImageView back = (ImageView) findViewById(R.id.back_button);
        ImageView next = (ImageView) findViewById(R.id.next);
        ImageView settings = (ImageView) findViewById(R.id.settings);
        ImageView equalizer = (ImageView) findViewById(R.id.equalizer);

        pause.setImageAlpha(210);
        back.setImageAlpha(180);
        next.setImageAlpha(180);
        settings.setImageAlpha(150);
        equalizer.setImageAlpha(150);

        Button playlist = (Button) findViewById(R.id.playlist_button);

        playlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent playlist_activity = new Intent(MainActivity.this, Playlist.class);
                startActivity(playlist_activity);
            }
        });

        equalizer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent equalizer_activity = new Intent(MainActivity.this, com.example.android.mp3music.Equalizer.class);
                startActivity(equalizer_activity);
            }
        });

        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent settings_activity = new Intent(MainActivity.this, Settings.class);
                startActivity(settings_activity);
            }
        });

    }
}
