package io.egen.controller;

import java.util.List;

import io.egen.entity.Artist;
import io.egen.entity.Movie;
import io.egen.service.ArtistService;
import io.egen.service.MovieService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArtistController {
	@Autowired
	ArtistService service;
	
		public List<Artist> findAll() {
		return service.findAll();
	}
		public Artist findOne(String id) {
			return service.findOne(id);
		}

		public Artist create(Artist artist) {
			return service.create(artist);
		}

		public void delete(String id) {
			service.delete(id);
		}

		public Artist update(String id,Artist artist) {
			return service.update(id, artist);
		}
}
