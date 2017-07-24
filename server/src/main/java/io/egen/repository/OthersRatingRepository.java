package io.egen.repository;

import io.egen.entity.MovieImdb;
import io.egen.entity.OthersRating;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

@Repository
public class OthersRatingRepository {
	@PersistenceContext
    private EntityManager entityManager;

    public List<OthersRating> findAll() {
        Query query = entityManager.createQuery("SELECT * FROM OthersRating");
        return query.getResultList();
    }

    public OthersRating findOne(String id) {
        return entityManager.find(OthersRating.class, id);
    }
    
    public OthersRating create(OthersRating art) {
        entityManager.persist(art);
        return art;
    }

    public OthersRating update(String id,OthersRating art) {
        return entityManager.merge(art);
    }

    public void delete(OthersRating art) {
        entityManager.remove(art);
    }
}
