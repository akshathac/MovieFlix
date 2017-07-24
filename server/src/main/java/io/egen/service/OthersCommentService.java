package io.egen.service;

import io.egen.entity.MovieGenre;
import io.egen.entity.OthersComment;
import io.egen.repository.MovieGenreRepository;
import io.egen.repository.OthersCommentRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OthersCommentService {
	@Autowired
	OthersCommentRepository repository;
	
	@Transactional
	public List<OthersComment> findAll() {

		return repository.findAll();
	}

	public OthersComment findOne(String id) {

		return repository.findOne(id);
	}

	public OthersComment create(OthersComment otherscomment) {

		return repository.create(otherscomment);
	}

	public OthersComment update(String id, OthersComment otherscomment) {

		return repository.update(id, otherscomment);
	}

	public void delete(String id) {
		// TODO Auto-generated method stub

	}
}
