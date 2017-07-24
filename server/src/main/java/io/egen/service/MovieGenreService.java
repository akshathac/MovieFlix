package io.egen.service;

import io.egen.entity.Artist;
import io.egen.entity.MovieGenre;
import io.egen.repository.ArtistRepository;
import io.egen.repository.MovieGenreRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
public class MovieGenreService {
	@Autowired
	MovieGenreRepository repository;
	
	@Transactional
	public List<MovieGenre> findAll() {

		return repository.findAll();
	}

	public MovieGenre findOne(String id) {

		return repository.findOne(id);
	}

	public MovieGenre create(MovieGenre moviegenre) {

		return repository.create(moviegenre);
	}

	public MovieGenre update(String id, MovieGenre moviegenre) {

		return repository.update(id, moviegenre);
	}

	public void delete(String id) {
		// TODO Auto-generated method stub

	}
}
