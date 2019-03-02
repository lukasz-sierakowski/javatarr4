package com.java.lambdaStreams.map;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    private String name;
    private String surname;
    private Date dateOfBirth;
    private String PESEL;
    private String email;
}
