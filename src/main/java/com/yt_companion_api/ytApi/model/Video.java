package com.yt_companion_api.ytApi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "videos")
public class Video {
    @Id
    private String videoId;
    private String title;
    private String description;
    private String publishedAt;
    // ✅ Link to channel
    private String channelId;

    public Video(String videoId, String title, String description, String publishedAt, String channelId) {
        this.videoId = videoId;
        this.title = title;
        this.description = description;
        this.publishedAt = publishedAt;
        this.channelId = channelId;
    }

    public Video() {} // Required by JPA

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }

    public String getVideoId() {
        return videoId;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId;
    }
    // Optional constructor for videos with no channel (for compatibility)
    public Video(String videoId, String title, String description, String publishedAt) {
        this(videoId, title, description, publishedAt, null);
    }
}
