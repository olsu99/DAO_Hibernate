package ru.netology.dao_hibernate.entity;

import lombok.*;

import java.io.Serializable;

@ToString
@Getter
@Setter
@NoArgsConstructor
public class PersonsId implements Serializable {
    private String name;
    private String surname;
    private int age;

    public PersonsId (String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
}
