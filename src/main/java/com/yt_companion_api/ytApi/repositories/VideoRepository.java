package com.yt_companion_api.ytApi.repositories;
import com.yt_companion_api.ytApi.model.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<Video, String> {
}

