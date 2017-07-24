package io.egen.repository;

import io.egen.entity.Artist;
import io.egen.entity.Employee;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

@Repository
public class ArtistRepositoryImpl implements ArtistRepository{
	 @PersistenceContext
	    private EntityManager entityManager;

	    public List<Artist> findAll() {
	        Query query = entityManager.createQuery("SELECT * FROM Artist");
	        return query.getResultList();
	    }

	    public Artist findOne(String id) {
	        return entityManager.find(Artist.class, id);
	    }
	    
	    public Artist create(Artist art) {
	        entityManager.persist(art);
	        return art;
	    }

	    public Artist update(String id,Artist art) {
	        return entityManager.merge(art);
	    }

	    public void delete(Artist art) {
	        entityManager.remove(art);
	    }

}
