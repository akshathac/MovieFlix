package io.egen.service;

import io.egen.entity.Artist;
import io.egen.entity.Movie;
import io.egen.repository.ArtistRepository;
import io.egen.repository.MovieRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
public class ArtistServiceImpl implements ArtistService{
	@Autowired
	ArtistRepository repository;
	
	@Transactional
	public List<Artist> findAll() {

		return repository.findAll();
	}

	public Artist findOne(String id) {

		return repository.findOne(id);
	}

	public Artist create(Artist artist) {

		return repository.create(artist);
	}

	public Artist update(String id, Artist artist) {

		return repository.update(id, artist);
	}

	public void delete(String id) {
		// TODO Auto-generated method stub

	}
}
