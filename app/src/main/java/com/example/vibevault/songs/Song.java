package com.example.vibevault.songs;

import com.example.vibevault.albums.Album;
import com.example.vibevault.artists.Artist;

import java.util.List;

public class Song {

    private String id;
    private String name;
    private int duration_ms;
    private Album album;
    private Artist artist;

    private int popularity;

    private boolean isFavourite = false;

   /* public class Artists { // Cuando se defina artists, hay que cambiar esto.
        public String name;
    }*/

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration_ms() {
        return duration_ms;
    }

    public void setDuration_ms(int duration_ms) {
        this.duration_ms = duration_ms;
    }

    public Artist getArtist() {
        return artist;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

   /* public List<Artists> getArtists() {
        return artists;
    }
*/
    public void setArtists(Artist artist) {
        this.artist = artist;
    }

    public String getAlbumCover(int opt) {
        return album.getImage(opt);
    }

    public int getPopularity() {
        return popularity;
    }

    public void setPopularity(int popularity) {
        this.popularity = popularity;
    }

    public boolean isFavourite() {
        return isFavourite;
    }

    public void setFavourite(boolean favourite) {
        isFavourite = favourite;
    }
}
