package io.egen.repository;

import io.egen.entity.Calender;
import io.egen.entity.MovieGenre;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

@Repository
public class MovieGenreRepository {
	@PersistenceContext
    private EntityManager entityManager;

    public List<MovieGenre> findAll() {
        Query query = entityManager.createQuery("SELECT * FROM MovieGenre");
        return query.getResultList();
    }

    public MovieGenre findOne(String id) {
        return entityManager.find(MovieGenre.class, id);
    }
    
    public MovieGenre create(MovieGenre art) {
        entityManager.persist(art);
        return art;
    }

    public MovieGenre update(String id,MovieGenre art) {
        return entityManager.merge(art);
    }

    public void delete(MovieGenre art) {
        entityManager.remove(art);
    }
}
