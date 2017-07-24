package io.egen.service;

import io.egen.entity.Movie;
import io.egen.repository.MovieRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MovieServiceImp implements MovieService {
	@Autowired
	MovieRepository repository;
	@Transactional
	public List<Movie> findAll() {

		return repository.findAll();
	}

	public Movie findOne(String id) {

		return repository.findOne(id);
	}

	public Movie create(Movie movie) {

		return repository.create(movie);
	}

	public Movie update(String id, Movie movie) {

		return repository.update(id, movie);
	}

	public void delete(String id) {
		// TODO Auto-generated method stub

	}

}
