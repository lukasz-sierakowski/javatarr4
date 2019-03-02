package com.java.lambdaStreams.findFirst;

import com.java.lambdaStreams.map.Person;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 110, 200, 1, 4, 5);
        Integer result = null;

        System.out.println("Source: " + Arrays.toString(numbers.toArray()));
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) > 100) {
                result = numbers.get(i);
                break;
            }
        }
        System.out.println("Result: " + result);

        Optional<Integer> result2 = numbers.stream().filter(el -> el > 100).findFirst();
        System.out.println("Result: " + result2.get());
        String a = "Jan";
        String b = "Jan";
        boolean c = a == b;
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.print(c);
        System.out.print(a == name);
        Person p1 = new Person();
        Person p2 = new Person();
        boolean c1 = p1.equals(p2);
    }
}
