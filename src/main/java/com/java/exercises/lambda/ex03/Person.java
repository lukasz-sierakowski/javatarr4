package com.java.exercises.lambda.ex03;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Person {
    private String name;
    private String lastName;
    private List<BankAccount> accounts;
}
