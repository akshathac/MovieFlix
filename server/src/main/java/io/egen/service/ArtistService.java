package io.egen.service;

import io.egen.entity.Artist;
import io.egen.entity.Movie;

import java.util.List;

public interface ArtistService {
	public List<Artist> findAll();

	public Artist findOne(String id);

	public Artist create(Artist artist);

	public Artist update(String id, Artist artist);

	public void delete(String id);
}
