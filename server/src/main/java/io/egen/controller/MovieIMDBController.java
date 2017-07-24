package io.egen.controller;

import io.egen.entity.Artist;
import io.egen.entity.MovieImdb;
import io.egen.service.ArtistService;
import io.egen.service.MovieIMDBService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieIMDBController {
	@Autowired
	MovieIMDBService service;
	
		public List<MovieImdb> findAll() {
		return service.findAll();
	}
		public MovieImdb findOne(String id) {
			return service.findOne(id);
		}

		public MovieImdb create(MovieImdb movieimdb) {
			return service.create(movieimdb);
		}

		public void delete(String id) {
			service.delete(id);
		}

		public MovieImdb update(String id,MovieImdb movieimdb) {
			return service.update(id, movieimdb);
		}
}
