package com.example.android.musicplay;

public class Album {
    private String albumName;
    private String albumArtist;
    private String albumYear;
    private String albumType;
    private int albumPicId;

    public Album(String malbumName,String malbumArtist, String malbumYear,String malbumType,int malbumPicId){
        this.albumName=malbumName;
        this.albumArtist=malbumArtist;
        this.albumYear=malbumYear;
        this.albumType=malbumType;
        this.albumPicId=malbumPicId;
    }

    public String getAlbumName(){
        return albumName;
    }
    public String getAlbumYear(){
        return albumYear;
    }

    public String getAlbumArtist(){
        return albumArtist;
    }
    public String getAlbumType(){
        return albumType;
    }
    public int getAlbumPicId(){
        return albumPicId;
    }

}