package io.egen.repository;

import io.egen.entity.Employee;
import io.egen.entity.Movie;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

@Repository
public class MovieRepositoryImp implements MovieRepository {
	@PersistenceContext
	private EntityManager entityManager;

	public List<Movie> findAll() {
		TypedQuery<Movie> query = entityManager.createNamedQuery(
				"Movie.findAll", Movie.class);
		return query.getResultList();
	}

	public Movie findOne(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Movie create(Movie movie) {
		// TODO Auto-generated method stub
		return null;
	}

	public Movie update(String id, Movie movie) {
		// TODO Auto-generated method stub
		return null;
	}

	public void delete(String id) {
		// TODO Auto-generated method stub

	}

}
