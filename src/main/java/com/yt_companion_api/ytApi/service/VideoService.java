package com.yt_companion_api.ytApi.service;

import com.yt_companion_api.ytApi.model.Video;
import java.util.List;
public interface VideoService {
    List<Video> getAllChannelVideos(String channelID);
}
