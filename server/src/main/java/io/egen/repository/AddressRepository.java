package io.egen.repository;

import io.egen.entity.Address;
import io.egen.entity.Artist;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

@Repository
public class AddressRepository {
	@PersistenceContext
    private EntityManager entityManager;

    public List<Address> findAll() {
        Query query = entityManager.createQuery("SELECT * FROM Address");
        return query.getResultList();
    }

    public Address findOne(String id) {
        return entityManager.find(Address.class, id);
    }
    
    public Address create(Address art) {
        entityManager.persist(art);
        return art;
    }

    public Address update(String id,Address art) {
        return entityManager.merge(art);
    }

    public void delete(Address art) {
        entityManager.remove(art);
    }
}
