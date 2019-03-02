package com.java.lambdaStreams.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    // Convert elements in list. Multiply each element by 2.
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 110, 200, 1, 4, 5);
        List<Integer> result = new ArrayList<>();

        System.out.println("Source: " + Arrays.toString(numbers.toArray()));
        for (int i = 0; i < numbers.size(); i++) {
            result.add(numbers.get(i) * 2);
        }
        System.out.println("Result: " + Arrays.toString(result.toArray()));

        List<Integer> result2 = numbers.stream().map(n -> n * 2).collect(Collectors.toList());
        System.out.println("Result: " + Arrays.toString(result2.toArray()));

        numbers.stream()
                .map(n -> n * 2) // Math.pow(number,2)
                .filter(number -> number * number > 500)
                .map(n -> n / 2f)
                .collect(Collectors.toList());
        List<Person> persons = Arrays.asList(
                new Person("Jan", "Kowalski", new Date(), "1234567890", "jan.kowalski@wp.wpl"),
                new Person("Janina", "Kowalska", new Date(), "0987654321", "janina.kowalska@wp.wpl")
        );
        List<String> names = persons.stream().map(p -> p.getName()).collect(Collectors.toList());
        System.out.println("Result: " + Arrays.toString(names.toArray()));
    }
}
