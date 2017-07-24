package io.egen.service;

import io.egen.entity.OthersComment;
import io.egen.entity.OthersRating;
import io.egen.repository.MovieGenreRepository;
import io.egen.repository.OthersRatingRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OthersRatingService {
	@Autowired
	OthersRatingRepository repository;
	
	@Transactional
	public List<OthersRating> findAll() {

		return repository.findAll();
	}

	public OthersRating findOne(String id) {

		return repository.findOne(id);
	}

	public OthersRating create(OthersRating otherscomment) {

		return repository.create(otherscomment);
	}

	public OthersRating update(String id, OthersRating otherscomment) {

		return repository.update(id, otherscomment);
	}

	public void delete(String id) {
		// TODO Auto-generated method stub

	}
}
