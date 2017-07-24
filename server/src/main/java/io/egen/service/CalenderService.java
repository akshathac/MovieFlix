package io.egen.service;

import io.egen.entity.Calender;
import io.egen.entity.MovieType;
import io.egen.repository.CalenderRepository;
import io.egen.repository.MovieTypeRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

public class CalenderService {
	@Autowired
	CalenderRepository repository;
	
	@Transactional
	public List<Calender> findAll() {

		return repository.findAll();
	}

	public Calender findOne(String id) {

		return repository.findOne(id);
	}

	public Calender create(Calender movietype) {

		return repository.create(movietype);
	}

	public Calender update(String id, Calender movietype) {

		return repository.update(id, movietype);
	}

	public void delete(String id) {
		// TODO Auto-generated method stub

	}
}
