package com.example.android.musicplay;

import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

public class AlbumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_main_list);
//        getActionBar().setDisplayHomeAsUpEnabled(true);//Up Navigation arrow


        ArrayList<Album> favAlbums = new ArrayList <Album>();
            favAlbums.add(new Album("El cabrone","Salsa King","2012","Single", R.drawable.salsa));
            favAlbums.add(new Album("One Love","Bob Marley","2000","Album",R.drawable.bobmarley));
            favAlbums.add(new Album("Got a woman","Ray Charles","1960","Single", R.drawable.raycharles));
            favAlbums.add(new Album("Guantanamera","Roberto Torres ","1960","Single",R.drawable.torres));
            favAlbums.add(new Album("Dance with Lords","Sarah Lynn","2011","Single", R.drawable.sarah));
            favAlbums.add(new Album("All Eyes on me","Tupac","1998","Album" ,R.drawable.tupac));
            favAlbums.add(new Album("Aprrendre","Lorie","2001","Album", R.drawable.lorie));
            favAlbums.add(new Album("Roock with me","JayZ","2011","Album",R.drawable.jayz));
            favAlbums.add(new Album("Listen","Beyoncee","2009","Single",R.drawable.beyonce));
            favAlbums.add(new Album("Mamacita","Rodriguez","2002","album",R.drawable.rodroguez));
            favAlbums.add(new Album("Mona Lisa","Nat King Cole","1968","Album",R.drawable.natkingcole));
            favAlbums.add(new Album("Heal me","Marvin Sapp","2001","single",R.drawable.marvinsapp));

       AlbumAdapter itemAdapter = new AlbumAdapter(this,favAlbums);
       ListView listView = (ListView) findViewById(R.id.list);
       listView.setAdapter(itemAdapter);
    }


}
