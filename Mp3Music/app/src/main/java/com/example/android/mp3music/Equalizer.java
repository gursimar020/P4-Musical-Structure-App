package com.example.android.mp3music;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

import com.example.android.mp3music.R;

public class Equalizer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equalizer);

        Button playlist = (Button) findViewById(R.id.playlist_button);

        playlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent playlist_activity = new Intent(Equalizer.this, Playlist.class);
                startActivity(playlist_activity);
            }
        });

        Button library = (Button) findViewById(R.id.library);

        library.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent MainActivity = new Intent(Equalizer.this, MainActivity.class);
                startActivity(MainActivity);
            }
        });

    }
}
