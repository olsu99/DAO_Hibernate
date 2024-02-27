package ru.netology.dao_hibernate.service;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import ru.netology.dao_hibernate.entity.Persons;
import ru.netology.dao_hibernate.repository.PersonsRepo;

import java.util.List;

@Service
@Transactional
public class PersonsService {
    private final PersonsRepo personsRepo;

    public PersonsService(PersonsRepo personsRepo) {
        this.personsRepo = personsRepo;
    }

    public List<Persons> getPersonsByCity(String city) {
        return personsRepo.getPersonsByCity(city);
    }
}
