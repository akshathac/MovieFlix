package io.egen.repository;

import io.egen.entity.Movie;

import java.util.List;

public interface MovieRepository {
	List<Movie> findAll();

	Movie findOne(String id);

	Movie create(Movie movie);

	Movie update(String id, Movie movie);

    void delete(String id);
}
