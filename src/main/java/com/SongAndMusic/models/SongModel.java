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
    private String oroginalTone;
    private String femaleTone;
    private String maleTone;
    private long artistId;
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

    public String getOroginalTone() {
        return oroginalTone;
    }

    public void setOroginalTone(String oroginalTone) {
        this.oroginalTone = oroginalTone;
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

    public long getArtistId() {
        return artistId;
    }

    public void setArtistId(long artistId) {
        this.artistId = artistId;
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
