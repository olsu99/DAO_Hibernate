package ru.netology.dao_hibernate.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.dao_hibernate.entity.Persons;
import ru.netology.dao_hibernate.service.PersonsService;

import java.util.List;

@RestController
public class PersonsController {

    private final PersonsService personsService;

    public PersonsController(PersonsService personsService) {
        this.personsService = personsService;
    }

    @GetMapping("/persons/by-city")
    @ResponseBody
    public List<Persons> getMapping(@RequestParam("city") String city) {
        return personsService.getPersonsByCity(city);
    }
}
