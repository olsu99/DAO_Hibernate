package ru.netology.dao_hibernate.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.dao_hibernate.entity.Persons;
import ru.netology.dao_hibernate.service.Service;

import java.util.List;

@RestController
public class Controller {

    private final Service service;

    public Controller(Service service) {
        this.service = service;
    }

    @GetMapping("/persons/by-city")
    @ResponseBody
    public List<Persons> getMapping(@RequestParam("city") String city) {
        return service.getPersonsByCity(city);
    }
}
