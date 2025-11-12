package com.yt_companion_api.ytApi.controller;
import com.yt_companion_api.ytApi.service.VideoService;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import com.yt_companion_api.ytApi.model.Video;

@RestController
@RequestMapping("/api")
public class VideoController {

    private final VideoService videoService;

    @Autowired
    public VideoController(VideoService videoService) {
        this.videoService = videoService;
    }


    @GetMapping("/channel/{channelId}")
    public List<Video> getVideos(@PathVariable String channelId) {
        return videoService.getAllChannelVideos(channelId);
    }



}
