package com.SongAndMusic.endpoints;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import com.SongAndMusic.services.SongService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import gs_ws.*;
import com.SongAndMusic.models.SongModel;

@Endpoint
public class SongEndpointSoap {
    private static final String NAMESPACE_URI = "http://spring.io/guides/gs-producing-web-service";
    @Autowired
    SongService songService;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "addSongRequest")
    @ResponsePayload
    public AddSongResponse addSong(@RequestPayload AddSongRequest request) {
        SongModel addSong = new SongModel();
        AddSongResponse response = new AddSongResponse();
        String message = "Song added successfully";
        BeanUtils.copyProperties(request.getSongInfo(), addSong);

        if (!addSong.isValidSong()){
            message = "The Request Data Is Not Valid";
            response.setServiceStatus(getServiceStatus(HttpStatus.BAD_REQUEST.toString(), message));

            return response;
        }

        songService.saveSong(addSong);
        response.setServiceStatus(getServiceStatus(HttpStatus.OK.toString(), message));

        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getSongByIdRequest")
    @ResponsePayload
    public GetSongByIdResponse getSongId(@RequestPayload GetSongByIdRequest request) {
        GetSongByIdResponse response = new GetSongByIdResponse();
        SongInfo  songInfo =  new SongInfo();
        String message = "Content Found";
        SongModel songFound = songService.getSongById(request.getId());

        if (songFound == null) {
            message = "Content Not Found";
            response.setServiceStatus(getServiceStatus(HttpStatus.NOT_FOUND.toString(), message));

            return response;
        }

        BeanUtils.copyProperties(songFound, songInfo);
        response.setSongInfo(songInfo);
        response.setServiceStatus(getServiceStatus(HttpStatus.OK.toString(), message));

        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getSongByNameRequest")
    @ResponsePayload
    public GetSongByNameResponse getSongName(@RequestPayload GetSongByNameRequest request) {
        GetSongByNameResponse response = new GetSongByNameResponse();
        String message = "Content Found";
        List<SongModel> songListFound = songService.findByName(request.getName());

        if (songListFound.isEmpty()) {
            message = "Content Not Found";
            response.setServiceStatus(getServiceStatus(HttpStatus.NOT_FOUND.toString(), message));

            return response;
        }

        for (SongModel song : songListFound) {
            SongInfo songInfo =  new SongInfo();
            BeanUtils.copyProperties(song, songInfo);
            response.getSongInfo().add(songInfo);
        }
        response.setServiceStatus(getServiceStatus(HttpStatus.OK.toString(), message));

        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getAllSongsRequest")
    @ResponsePayload
    public GetAllSongsResponse getAllSongs() {
        GetAllSongsResponse response = new GetAllSongsResponse();
        List<SongModel> songListFound = songService.getAllSongs();

        for (SongModel song : songListFound) {
            SongInfo songInfo =  new SongInfo();
            BeanUtils.copyProperties(song, songInfo);
            response.getSongInfo().add(songInfo);
        }

        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "updateSongRequest")
    @ResponsePayload
    public UpdateSongResponse updateSong(@RequestPayload UpdateSongRequest request) {
        SongModel updateSong = new SongModel();
        UpdateSongResponse response = new UpdateSongResponse();
        String message = "Content Updated Successfully";
        BeanUtils.copyProperties(request.getSongInfo(), updateSong);

        if (!updateSong.isValidSong()){
            message = "The Request Data Is Not Valid";
            response.setServiceStatus(getServiceStatus(HttpStatus.BAD_REQUEST.toString(), message));

            return response;
        }

        songService.saveSong(updateSong);
        response.setServiceStatus(getServiceStatus(HttpStatus.OK.toString(), message));

        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "deleteSongRequest")
    @ResponsePayload
    public DeleteSongResponse deleteSong(@RequestPayload DeleteSongRequest request) {
        boolean wasDeleted = songService.deleteSong(request.getId());
        DeleteSongResponse response = new DeleteSongResponse();
        String message = wasDeleted ? "Content Deleted Successfully" : "Content Deletion Failed";

        if (!wasDeleted) {
            response.setServiceStatus(getServiceStatus(HttpStatus.NOT_FOUND.toString(), message));

            return response;
        }

        response.setServiceStatus(getServiceStatus(HttpStatus.OK.toString(), message));

        return response;
    }

    private ServiceStatus getServiceStatus(String status, String message) {
        ServiceStatus serviceStatus = new ServiceStatus();
        serviceStatus.setStatus(status);
        serviceStatus.setMessage(message);

        return serviceStatus;
    }
}