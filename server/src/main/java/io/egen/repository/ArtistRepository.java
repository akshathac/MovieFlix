package io.egen.repository;

import io.egen.entity.Artist;
import io.egen.entity.Employee;

import java.util.List;

public interface ArtistRepository {
	List<Artist> findAll();

	Artist findOne(String id);

	Artist create(Artist art);

	Artist update(String id,Artist art);

    void delete(Artist art);

}
