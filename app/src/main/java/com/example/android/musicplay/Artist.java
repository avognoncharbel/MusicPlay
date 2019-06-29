package com.example.android.musicplay;

public class Artist {
    private String artistName;
    private int    albumCount ;
    private int  artistFollowers;
    private int artistImageId;

    public Artist(String name, int albums, int follows, int image){
        artistName= name;
        albumCount= albums;
        artistFollowers = follows;
        artistImageId = image;
    }
    public String getArtistName(){
        return artistName;
    }
    public int getAlbumCount(){
        return albumCount;
    }
    public int getArtistFollowers(){
        return artistFollowers;
    }
    public int getArtistImageId(){
        return artistImageId;
    }
}