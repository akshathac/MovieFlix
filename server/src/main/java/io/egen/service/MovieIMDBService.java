package io.egen.service;

import io.egen.entity.MovieGenre;
import io.egen.entity.MovieImdb;
import io.egen.repository.MovieGenreRepository;
import io.egen.repository.MovieIMDBRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MovieIMDBService {
	@Autowired
	MovieIMDBRepository repository;
	
	@Transactional
	public List<MovieImdb> findAll() {

		return repository.findAll();
	}

	public MovieImdb findOne(String id) {

		return repository.findOne(id);
	}

	public MovieImdb create(MovieImdb movieImdb) {

		return repository.create(movieImdb);
	}

	public MovieImdb update(String id, MovieImdb movieImdb) {

		return repository.update(id, movieImdb);
	}

	public void delete(String id) {
		// TODO Auto-generated method stub

	}
}
