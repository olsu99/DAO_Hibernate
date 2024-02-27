package ru.netology.dao_hibernate.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "Persons", schema = "netology")
@Entity
@IdClass(PersonsId.class)
public class Persons {
    @Id
    private String name;
    @Id
    private String surname;
    @Id
    private int age;
    private String phone_number;
    private String cityOfLiving;
}
