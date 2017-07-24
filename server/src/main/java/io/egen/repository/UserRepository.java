package io.egen.repository;

import io.egen.entity.Calender;
import io.egen.entity.User;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
	@PersistenceContext
    private EntityManager entityManager;

    public List<User> findAll() {
        Query query = entityManager.createQuery("SELECT * FROM User");
        return query.getResultList();
    }

    public User findOne(String id) {
        return entityManager.find(User.class, id);
    }
    
    public User create(User art) {
        entityManager.persist(art);
        return art;
    }

    public User update(String id,User art) {
        return entityManager.merge(art);
    }

    public void delete(User art) {
        entityManager.remove(art);
    }
}
