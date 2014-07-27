package com.mkyong.common.controller;

import com.mkyong.common.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.security.PublicKey;

@Controller
@RequestMapping("/movie")
public class MovieController {

    @Autowired
    public MovieService movieService;

	@RequestMapping(value="/{name}", method = RequestMethod.GET)
	public String getMovie(@PathVariable String name, ModelMap model) {

        String name1 = movieService.getName(1);

        model.addAttribute("movie", name1);
        return "list";

    }

}