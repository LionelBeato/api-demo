package com.wozu.Api2.Services;

import com.wozu.Api2.Models.Movie;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MovieServiceImpl implements MovieService {
//    injects the api_key from application.properties.
    @Value("${api_key}")
    String api_key;

    @Override
    public Movie getMovieFromMovieApi(String search) {
        String url = "http://omdbapi.com/?apikey=" + api_key + "&t=" + search + "&plot=full";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(url, Movie.class);
    }
}
