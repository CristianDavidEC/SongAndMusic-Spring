package com.SongAndMusic.controllers;

import com.SongAndMusic.models.SongModel;
import com.SongAndMusic.services.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/song")
public class SongController {
    @Autowired
    SongService songService;

    @GetMapping()
    public ResponseEntity<ArrayList<SongModel>> getAllSongs() {
        ArrayList<SongModel> songs = songService.getAllSongs();
        return ResponseEntity.status(HttpStatus.OK).body(songs);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<SongModel> getSongById(@PathVariable("id") Long id) {
        SongModel songFound = songService.getSongById(id);
        if (songFound == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }

        return ResponseEntity.status(HttpStatus.OK).body(songFound);
    }

    @PostMapping(path = "/byName")
    public ResponseEntity<ArrayList<SongModel>> getSongByName(@RequestBody String name) {
        ArrayList<SongModel> songsFound = songService.findByName(name);
        if (songsFound.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }

        return ResponseEntity.status(HttpStatus.OK).body(songsFound);
    }
    @PostMapping()
    public ResponseEntity<SongModel> saveSong(@RequestBody SongModel song) {
        if(!song.isValidSong()){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

        SongModel newSong = songService.saveSong(song);
        return ResponseEntity.status(HttpStatus.CREATED).body(newSong);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<String> deleteSong(@PathVariable("id") Long id) {
        String message = "Song deleted successfully";
        boolean wasDeleted = songService.deleteSong(id);
        if (!wasDeleted) {
            message = "Delete song failed";
            return  ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);
        }

        return ResponseEntity.status(HttpStatus.OK).body(message);
    }
}
