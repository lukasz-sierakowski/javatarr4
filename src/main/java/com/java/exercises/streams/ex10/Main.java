package com.java.exercises.streams.ex10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Utwórz klasę pracownik posiadającą imię, nazwisko i wynagrodzenie. Dodaj 10
 * pracowników do kolekcji ArrayList. Korzystając ze strumieni znajdź średnie
 * wynagrodzenie pracownika, a następnie korzystając ze strumieni wyświetl wszystkich
 * pracowników zarabiających więcej niż średnia.
 */
public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Jan", "Kowalski", 1500d));
        persons.add(new Person("Janina", "Kowalska", 1330d));
        persons.add(new Person("Michał", "Kowalski", 25500d));
        persons.add(new Person("Wojciech", "Kowalski", 11500d));

        Double averageSallary = persons.stream().mapToDouble(p -> p.getWynagrodzenie()).average().getAsDouble();
        List<Person> personsWithSalaryAboveAverage = persons.stream().filter(p -> p.getWynagrodzenie() > averageSallary).collect(Collectors.toList());

        System.out.println(Arrays.toString(personsWithSalaryAboveAverage.toArray()));
    }
}
