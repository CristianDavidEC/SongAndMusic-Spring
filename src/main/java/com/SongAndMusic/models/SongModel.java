package com.SongAndMusic.models;
import javax.persistence.*;

@Entity
@Table(name = "songs")
public class SongModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private long id;
    private String name;
    private String lyrics;
    private String originalTone;
    private String femaleTone;
    private String maleTone;
    private String artist;
    private int time;
    private String genre;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLyrics() {
        return lyrics;
    }

    public void setLyrics(String lyrics) {
        this.lyrics = lyrics;
    }

    public String getOriginalTone() {
        return originalTone;
    }

    public void setOriginalTone(String originalTone) {
        this.originalTone = originalTone;
    }

    public String getFemaleTone() {
        return femaleTone;
    }

    public void setFemaleTone(String femaleTone) {
        this.femaleTone = femaleTone;
    }

    public String getMaleTone() {
        return maleTone;
    }

    public void setMaleTone(String maleTone) {
        this.maleTone = maleTone;
    }

    public String getArtistId() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
