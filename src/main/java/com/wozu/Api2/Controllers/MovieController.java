package com.wozu.Api2.Controllers;

import com.wozu.Api2.Models.Movie;
import com.wozu.Api2.Services.MovieServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class MovieController {

    @Autowired
    MovieServiceImpl movieServiceImpl;

    @GetMapping("/movie/{search}")
    @ResponseBody
    public Movie getMovie(@RequestParam String search) {
        return movieServiceImpl.getMovieFromMovieApi(search);
    }
}
