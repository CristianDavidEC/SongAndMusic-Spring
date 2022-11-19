package com.SongAndMusic.controllers;

import com.SongAndMusic.models.SongModel;
import com.SongAndMusic.services.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/song")
public class SongController {
    @Autowired
    SongService songService;

    @GetMapping()
    public ArrayList<SongModel> getAllSongs() {
        return songService.getAllSongs();
    }

    @GetMapping(path = "/{id}")
    public SongModel getSongById(@PathVariable("id") Long id) {
        return songService.getSongById(id);
    }

    @PostMapping()
    public SongModel saveSong(@RequestBody SongModel song) {
        return songService.saveSong(song);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteSong(@PathVariable("id") Long id) {
        boolean ok = songService.deleteSong(id);
        if (ok) {
            return "Delete song with id: " + id + " successfully";
        } else {
            return "Delete song with id: " + id + " failed";
        }
    }
}
