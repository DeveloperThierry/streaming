package com.example.movie_streaming_service.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URI;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/stream")
public class MovieStreamController {
    private static final Logger log = Logger.getLogger(MovieStreamController.class.getName());

    @Autowired
    private MovieCatalogService movieCatalogService;

    @GetMapping("/redirect/{movieId}")
    public ResponseEntity<Void> redirectToYoutube(@PathVariable Long movieId) {
        String youtubeUrl = movieCatalogService.getMoviePath(movieId); 

        if (youtubeUrl != null) {
            log.log(Level.INFO, "Redirecting to {0}", youtubeUrl);
            return ResponseEntity.status(HttpStatus.FOUND)
                    .location(URI.create(youtubeUrl))
                    .build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
