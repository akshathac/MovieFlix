package io.egen.controller;

import java.util.List;

import io.egen.entity.Artist;
import io.egen.entity.Employee;
import io.egen.entity.MovieGenre;
import io.egen.service.ArtistService;
import io.egen.service.MovieGenreService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/genres")
public class MovieGenreController {
	@Autowired
	MovieGenreService service;


    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<MovieGenre> findAll() {
        return service.findAll();
    }
    public MovieGenre findOne(String id) {
		return service.findOne(id);
	}

	public MovieGenre create(MovieGenre moviegenre) {
		return service.create(moviegenre);
	}

	public void delete(String id) {
		service.delete(id);
	}

	public MovieGenre update(String id,MovieGenre moviegenre) {
		return service.update(id, moviegenre);
	}

}
