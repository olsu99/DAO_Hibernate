package ru.netology.dao_hibernate.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;
import ru.netology.dao_hibernate.entity.Persons;

import java.util.List;

@Repository
public class PersonsRepo {
    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public List<Persons> getPersonsByCity(String city) {
        return entityManager.createQuery(
                        "select p from Persons p where p.cityOfLiving = :city", Persons.class
                )
                .setParameter("city", city)
                .getResultList();
    }
}
