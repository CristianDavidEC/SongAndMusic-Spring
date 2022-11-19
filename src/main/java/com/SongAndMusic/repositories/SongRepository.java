package com.SongAndMusic.repositories;

import com.SongAndMusic.models.SongModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface SongRepository extends CrudRepository<SongModel, Long> {
    public  abstract ArrayList<SongModel> findByName(String name);

}
