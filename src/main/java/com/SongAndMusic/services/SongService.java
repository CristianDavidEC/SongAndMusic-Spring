package com.SongAndMusic.services;

import com.SongAndMusic.models.SongModel;
import com.SongAndMusic.repositories.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class SongService {
    @Autowired
    SongRepository songRepository;

    public ArrayList<SongModel> getAllSongs() {
        return (ArrayList<SongModel>) songRepository.findAll();
    }

    public SongModel saveSong(SongModel song) {
        return songRepository.save(song);
    }

    public SongModel getSongById(Long id) {
        return songRepository.findById(id).orElse(null);
    }

    public ArrayList<SongModel> findByName(String name) {
        return songRepository.findByName(name);
    }

    public boolean deleteSong(Long id) {
        try {
            songRepository.deleteById(id);
            return true;
        } catch (Exception err) {
            return false;
        }
    }

}
