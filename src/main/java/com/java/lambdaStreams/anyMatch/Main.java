package com.java.lambdaStreams.anyMatch;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 110, 200, 1, 4, 5);
        boolean result = false;

        System.out.println("Source: " + Arrays.toString(numbers.toArray()));
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) > 100) {
                result = true;
                break;
            }
        }
        System.out.println("Result: " + result);

        boolean result2 = numbers.stream().anyMatch(element -> element > 100);
        System.out.println("Result: " + result2);
    }
}
