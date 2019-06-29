package com.example.android.musicplay;

import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

public class artistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_main_list);

        ArrayList<Artist> favArtists = new ArrayList<Artist>();
        favArtists.add(new Artist("Tupac",4,1500,R.drawable.tupac));
        favArtists.add(new Artist("Roberto Torres ",8,7800,R.drawable.torres));
        favArtists.add(new Artist("Sarah Lynn",24,10500, R.drawable.sarah));
        favArtists.add(new Artist("Lorie",8,700, R.drawable.lorie));
        favArtists.add(new Artist("JayZ",14,15000,R.drawable.jayz));
        favArtists.add(new Artist("Ray Charles",40,154400, R.drawable.raycharles));
        favArtists.add(new Artist("Beyoncee",47,114500,R.drawable.beyonce));
        favArtists.add(new Artist("Rodriguez",4,1500,R.drawable.rodroguez));
        favArtists.add(new Artist("Salsa King",77,778500, R.drawable.salsa));
        favArtists.add(new Artist("Bob Marley",97,1444500,R.drawable.bobmarley));
        favArtists.add(new Artist("Nat King Cole",50,115500,R.drawable.natkingcole));
        favArtists.add(new Artist("Marvin Sapp",49,88500,R.drawable.marvinsapp));

        ArtistAdapter itemAdapter = new ArtistAdapter(this,favArtists);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemAdapter);

    }



}
