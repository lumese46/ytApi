package com.yt_companion_api.ytApi.config;
import com.yt_companion_api.ytApi.repositories.VideoRepository;
import com.yt_companion_api.ytApi.model.Video;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class DataInitializer {

    @Bean
    CommandLineRunner initDatabase(VideoRepository repository) {
        return args -> {
            repository.save(new Video("abc123", "Understanding Java Streams",
                    "A beginner-friendly guide to Java Streams.", "2025-11-01"));

            repository.save(new Video("def456", "Spring Boot REST API Tutorial",
                    "Step-by-step guide to building REST APIs with Spring Boot.", "2025-10-25"));

            repository.save(new Video("ghi789", "YouTube API Integration",
                    "Learn how to integrate YouTube API into your app.", "2025-10-20"));

            System.out.println("✅ Sample videos inserted into database!");
        };
    }
}

