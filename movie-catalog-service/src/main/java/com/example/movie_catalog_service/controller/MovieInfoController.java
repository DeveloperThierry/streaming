package com.example.movie_catalog_service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.movie_catalog_service.model.MovieInfo;
import com.example.movie_catalog_service.model.MovieInfoRepository;

@RestController
@RequestMapping("/movie-info")
public class MovieInfoController {

    @Autowired
    private MovieInfoRepository repository;


    @PostMapping("/save")
    public List<MovieInfo> saveAll(@RequestBody List<MovieInfo> movieInfoList){
        return repository.saveAll(movieInfoList);
    }

    @GetMapping("/list")
    public List<MovieInfo> getAll(){
        return repository.findAll();
    }

    @GetMapping("/find-path-by-id/{movieInfoId}")
    public String findPathById(@PathVariable Long movieInfoId){
        var videoInfoOptional = repository.findById(movieInfoId);
        return videoInfoOptional.map(MovieInfo::getPath).orElse(null);
    }
}
