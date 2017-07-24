package io.egen.service;

import io.egen.entity.Artist;
import io.egen.entity.Movie;
import io.egen.entity.OthersRating;
import io.egen.entity.User;
import io.egen.repository.OthersRatingRepository;
import io.egen.repository.UserRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {
	@Autowired
	UserRepository repository;
	
	@Transactional
	public List<User> findAll() {

		return repository.findAll();
	}

	public User findOne(String id) {

		return repository.findOne(id);
	}

	public User create(User otherscomment) {

		return repository.create(otherscomment);
	}

	public User update(String id, User otherscomment) {

		return repository.update(id, otherscomment);
	}

	public void delete(String id) {
		// TODO Auto-generated method stub

	}
}
