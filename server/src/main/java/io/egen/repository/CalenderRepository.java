package io.egen.repository;

import io.egen.entity.Artist;
import io.egen.entity.Calender;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

@Repository
public class CalenderRepository {
	@PersistenceContext
    private EntityManager entityManager;

    public List<Calender> findAll() {
        Query query = entityManager.createQuery("SELECT * FROM Calender");
        return query.getResultList();
    }

    public Calender findOne(String id) {
        return entityManager.find(Calender.class, id);
    }
    
    public Calender create(Calender art) {
        entityManager.persist(art);
        return art;
    }

    public Calender update(String id,Calender art) {
        return entityManager.merge(art);
    }

    public void delete(Calender art) {
        entityManager.remove(art);
    }
}
