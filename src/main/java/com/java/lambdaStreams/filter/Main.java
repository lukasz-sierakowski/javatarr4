package com.java.lambdaStreams.filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Filter elements that x > 100
        List<Integer> numbers = Arrays.asList(10, 20, 110, 200, 1, 4, 5);
        List<Integer> result = new ArrayList<Integer>();

        System.out.println("Source: " + Arrays.toString(numbers.toArray()));
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) > 100) {
                result.add(numbers.get(i));
            }
        }
        System.out.println("Result: " + Arrays.toString(result.toArray()));

        List<Integer> result2 = numbers.stream().filter(element -> element > 100).collect(Collectors.toList());
        System.out.println("Result: " + Arrays.toString(result2.toArray()));
        // Filter numbers (50, 100)
        List<Integer> result3 = numbers.stream()
                .filter(element -> element < 100)
                .filter(element -> element > 50)
                .collect(Collectors.toList());
    }
}
