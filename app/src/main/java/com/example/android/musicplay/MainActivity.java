package com.example.android.musicplay;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView album = (TextView)findViewById(R.id.album_textview);
        album.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent albumIntent = new Intent(MainActivity.this,AlbumActivity.class);
                startActivity(albumIntent);
            }
        });

        TextView artist = (TextView)findViewById(R.id.artist_textview);
        artist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent artistIntent = new Intent(MainActivity.this, artistActivity.class);
                startActivity(artistIntent);
            }
        });
    }
}
