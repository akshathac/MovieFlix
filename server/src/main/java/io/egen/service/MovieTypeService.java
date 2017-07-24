package io.egen.service;

import io.egen.entity.MovieImdb;
import io.egen.entity.MovieType;
import io.egen.repository.MovieIMDBRepository;
import io.egen.repository.MovieTypeRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MovieTypeService {
	@Autowired
	MovieTypeRepository repository;
	
	@Transactional
	public List<MovieType> findAll() {

		return repository.findAll();
	}

	public MovieType findOne(String id) {

		return repository.findOne(id);
	}

	public MovieType create(MovieType movietype) {

		return repository.create(movietype);
	}

	public MovieType update(String id, MovieType movietype) {

		return repository.update(id, movietype);
	}

	public void delete(String id) {
		// TODO Auto-generated method stub

	}
}
