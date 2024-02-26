package ru.netology.dao_hibernate.service;

import jakarta.transaction.Transactional;
import ru.netology.dao_hibernate.entity.Persons;
import ru.netology.dao_hibernate.repository.Repository;

import java.util.List;

@org.springframework.stereotype.Service
@Transactional
public class Service {
    private final Repository repository;

    public Service(Repository repository) {
        this.repository = repository;
    }

    public List<Persons> getPersonsByCity (String city){
        return repository.getPersonsByCity(city);
    }
}
