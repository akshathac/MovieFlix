package io.egen.repository;

import io.egen.entity.MovieType;
import io.egen.entity.OthersComment;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;


@Repository
public class OthersCommentRepository {
	@PersistenceContext
    private EntityManager entityManager;

    public List<OthersComment> findAll() {
        Query query = entityManager.createQuery("SELECT * FROM MovieType");
        return query.getResultList();
    }

    public OthersComment findOne(String id) {
        return entityManager.find(OthersComment.class, id);
    }
    
    public OthersComment create(OthersComment art) {
        entityManager.persist(art);
        return art;
    }

    public OthersComment update(String id,OthersComment art) {
        return entityManager.merge(art);
    }

    public void delete(OthersComment art) {
        entityManager.remove(art);
    }
}
