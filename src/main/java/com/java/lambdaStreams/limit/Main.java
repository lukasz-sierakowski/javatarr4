package com.java.lambdaStreams.limit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 110, 200, 1, 4, 5);
        List<Integer> result = new ArrayList<>();

        System.out.println("Source: " + Arrays.toString(numbers.toArray()));
        for (int i = 0; i < 4; i++) {
            result.add(numbers.get(i));
        }
        System.out.println("Result: " + Arrays.toString(result.toArray()));

        List<Integer> result2 = numbers.stream().limit(4).collect(Collectors.toList());
        System.out.println("Result: " + Arrays.toString(result2.toArray()));
    }
}
