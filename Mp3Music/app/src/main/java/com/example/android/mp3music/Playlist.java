package com.example.android.mp3music;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Playlist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);
        ArrayList<String> playlist_list = new ArrayList<>();
        for (int i = 1; i < 20; i++)
            playlist_list.add("Song " + i);
        ArrayAdapter<String> playlist_adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, playlist_list);
        ListView playlist_view = (ListView) findViewById(R.id.playlist_list);
        playlist_view.setAdapter(playlist_adapter);

        Button library = (Button) findViewById(R.id.library);

        library.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent MainActivity = new Intent(Playlist.this, MainActivity.class);
                startActivity(MainActivity);
            }
        });
        Button buy = (Button) findViewById(R.id.buy);
        buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Payments = new Intent(Playlist.this, Payments.class);
                startActivity(Payments);
            }
        });
    }

    public void addsong(View view) {
        Toast.makeText(this, "Your Song is Added", Toast.LENGTH_LONG).show();
    }
}

