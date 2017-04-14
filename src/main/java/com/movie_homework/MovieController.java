package com.movie_homework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by chrisaanerud on 4/13/17.
 */

@Controller
public class MovieController {

    @Autowired
    MovieRepository movieRepository;

    @GetMapping("/")
    public String listMovies(Model model, String search) {

        model.addAttribute("search", search);
        model.addAttribute("movies", movieRepository.listMovies(search));
        return "index";
    }

    @GetMapping("/movieform")
    public String movieform() {

        return "movieform";
    }
}
