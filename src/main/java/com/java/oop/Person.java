package com.java.oop;

import lombok.*;

import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Person {
    String name;
    String surname;
    Address address;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
}
