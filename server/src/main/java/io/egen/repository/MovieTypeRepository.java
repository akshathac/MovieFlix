package io.egen.repository;

import io.egen.entity.MovieImdb;
import io.egen.entity.MovieType;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

public class MovieTypeRepository {
	@PersistenceContext
    private EntityManager entityManager;

    public List<MovieType> findAll() {
        Query query = entityManager.createQuery("SELECT * FROM MovieType");
        return query.getResultList();
    }

    public MovieType findOne(String id) {
        return entityManager.find(MovieType.class, id);
    }
    
    public MovieType create(MovieType art) {
        entityManager.persist(art);
        return art;
    }

    public MovieType update(String id,MovieType art) {
        return entityManager.merge(art);
    }

    public void delete(MovieType art) {
        entityManager.remove(art);
    }
}
