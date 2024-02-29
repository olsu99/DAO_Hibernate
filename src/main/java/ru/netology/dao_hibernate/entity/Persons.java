package ru.netology.dao_hibernate.entity;

import jakarta.persistence.*;
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
    @Column(name="phone_number")
    private String phoneNumber;
    @Column(name="city_of_living")
    private String cityOfLiving;
}
