package com.example.android.mp3music;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Payments extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payments);

        Button playlist = (Button) findViewById(R.id.playlist_button);

        playlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent playlist_activity = new Intent(Payments.this, Playlist.class);
                startActivity(playlist_activity);
            }
        });

        Button library = (Button) findViewById(R.id.library);

        library.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent MainActivity = new Intent(Payments.this, MainActivity.class);
                startActivity(MainActivity);
            }
        });

        Button pay1 = (Button) findViewById(R.id.net);
        pay1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Payments.this, "Please Wait ! Redirect to Net Banking", Toast.LENGTH_SHORT).show();
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://netbanking.hdfcbank.com/netbanking/"));
                startActivity(browserIntent);
            }
        });


        Button pay2 = (Button) findViewById(R.id.card);
        pay2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Payments.this, "Please Wait ! Redirect to Credit Card ", Toast.LENGTH_SHORT).show();
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.billdesk.com/pgidsk/pgmerc/hdfccard/"));
                startActivity(browserIntent);
            }
        });


        Button pay3 = (Button) findViewById(R.id.paytm);
        pay3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Payments.this, "Please Wait ! Redirect to Paytm Website", Toast.LENGTH_SHORT).show();
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://paytm.com/"));
                startActivity(browserIntent);
            }
        });

    }
}
