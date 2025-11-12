package com.yt_companion_api.ytApi.service;


import com.yt_companion_api.ytApi.model.Video;
import com.yt_companion_api.ytApi.repositories.VideoRepository;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;



@Service
public class VideoServiceImpl implements VideoService {

    private final VideoRepository videoRepository;

    public VideoServiceImpl(VideoRepository videoRepository) {
        this.videoRepository = videoRepository;
    }

    @Override
    public List<Video> getAllChannelVideos(String channelId) {
        // For now, ignore channelId and return mock data
        return videoRepository.findAll();
    }
}
