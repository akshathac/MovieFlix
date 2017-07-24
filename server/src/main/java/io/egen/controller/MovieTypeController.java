package io.egen.controller;

import io.egen.entity.MovieImdb;
import io.egen.entity.MovieType;
import io.egen.service.MovieTypeService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping(value = "/types")
public class MovieTypeController {
	@Autowired
	MovieTypeService service;
	
	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)  
		public List<MovieType> findAll() {
		return service.findAll();
	}
		public MovieType findOne(String id) {
			return service.findOne(id);
		}

		public MovieType create(MovieType movieimdb) {
			return service.create(movieimdb);
		}

		public void delete(String id) {
			service.delete(id);
		}

		public MovieType update(String id,MovieType movieimdb) {
			return service.update(id, movieimdb);
		}
}
