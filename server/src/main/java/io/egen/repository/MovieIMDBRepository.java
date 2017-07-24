package io.egen.repository;

import io.egen.entity.MovieGenre;
import io.egen.entity.MovieImdb;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

@Repository
public class MovieIMDBRepository {
	@PersistenceContext
    private EntityManager entityManager;

    public List<MovieImdb> findAll() {
        Query query = entityManager.createQuery("SELECT * FROM MovieImdb");
        return query.getResultList();
    }

    public MovieImdb findOne(String id) {
        return entityManager.find(MovieImdb.class, id);
    }
    
    public MovieImdb create(MovieImdb art) {
        entityManager.persist(art);
        return art;
    }

    public MovieImdb update(String id,MovieImdb art) {
        return entityManager.merge(art);
    }

    public void delete(MovieImdb art) {
        entityManager.remove(art);
    }
}
