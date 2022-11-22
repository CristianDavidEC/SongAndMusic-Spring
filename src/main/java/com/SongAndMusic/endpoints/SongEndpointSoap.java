package com.SongAndMusic.endpoints;

import java.util.ArrayList;
import java.util.List;

import com.SongAndMusic.services.SongService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import com.song_soap.gs_ws.*;
import com.SongAndMusic.models.SongModel;

@Endpoint
public class SongEndpointSoap {
    private static final String NAMESPACE_URI = "http://spring.io/guides/gs-producing-web-service";
    @Autowired
    SongService songService;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "addSongRequest")
    @ResponsePayload
    public AddSongResponse addUser(@RequestPayload AddSongRequest request) {
        AddSongResponse response = new AddSongResponse();
        ServiceStatus serviceStatus = new ServiceStatus();

        SongModel newSong = new SongModel();
        BeanUtils.copyProperties(request.getSongInfo(), newSong);
        songService.saveSong(newSong);
        serviceStatus.setStatus("SUCCESS");
        serviceStatus.setMessage("Content Added Successfully");
        response.setServiceStatus(serviceStatus);
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getSongByIdRequest")
    @ResponsePayload
    public GetSongByIdResponse getUser(@RequestPayload GetSongByIdRequest request) {
        GetSongByIdResponse response = new GetSongByIdResponse();
        SongInfo  songInfo =  new SongInfo();
        BeanUtils.copyProperties(songService.getSongById(request.getId()), songInfo);
        response.setSongInfo(songInfo);
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getAllSongsRequest")
    @ResponsePayload
    public GetAllSongsResponse getAllUsers() {
        GetAllSongsResponse response = new GetAllSongsResponse();
        List<SongInfo> articleInfoList = new ArrayList<>();
        List<SongModel> articleList = songService.getAllSongs();
        for (int i = 0; i < articleList.size(); i++) {
            SongInfo ob = new SongInfo();
            BeanUtils.copyProperties(articleList.get(i), ob);
            articleInfoList.add(ob);
        }
        response.getSongInfo().addAll(articleInfoList);
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "updateSongRequest")
    @ResponsePayload
    public UpdateSongResponse updateUser(@RequestPayload UpdateSongRequest request) {
        SongModel updateSong = new SongModel();
        BeanUtils.copyProperties(request.getSongInfo(), updateSong);
        songService.saveSong(updateSong);
        ServiceStatus serviceStatus = new ServiceStatus();
        serviceStatus.setStatus("SUCCESS");
        serviceStatus.setMessage("Content Updated Successfully");
        UpdateSongResponse response = new UpdateSongResponse();
        response.setServiceStatus(serviceStatus);
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "deleteSongRequest")
    @ResponsePayload
    public DeleteSongResponse deleteUser(@RequestPayload DeleteSongRequest request) {
        songService.deleteSong(request.getId());
        ServiceStatus serviceStatus = new ServiceStatus();

        serviceStatus.setStatus("SUCCESS");
        serviceStatus.setMessage("Content Deleted Successfully");
        DeleteSongResponse response = new DeleteSongResponse();
        response.setServiceStatus(serviceStatus);
        return response;
    }
}