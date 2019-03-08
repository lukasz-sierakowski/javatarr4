package com.java.collections;

import com.java.oop.Person;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Person> lista = new ArrayList<>();
        lista.add(new Person("Jan", "Kowalski"));
        lista.add(new Person("Jan", "Kowalski"));
        boolean exists = lista.contains(new Person("Jan", "Kowalski"));
        System.out.println(exists);
        Person person = new Person("Jan", "Kowalski");
        lista.add(person);
        exists = lista.contains(person);
        System.out.println(exists);

        List<Person> persons = lista.subList(2, 3);
        person.setName("Jadwiga");

        lista.forEach(element -> System.out.println(element));

        Queue<String> queue = new LinkedList<>();
        for (int i = 0; i < 50; i++) {
            queue.add("Test");
        }
        // Pobiera i zostawia w kolejce
        queue.peek();
        // Pobiera z kolejki
        queue.poll();
        // Sprawdza element w kolejce
        queue.size();

        //SET
        HashSet<String> set = new HashSet<>();
        boolean hasAdded = set.add("Tekst");
        System.out.println("Dodano Tekst: " + hasAdded);
        hasAdded = set.add("Tekst");
        System.out.println("Dodano Tekst: " + hasAdded);
        set.size();
        set.forEach(element -> System.out.println(element));

        HashMap<String, Person> personMap = new HashMap<>();
        personMap.put("1234567890", new Person());

        Person person1 = personMap.get("1234567890");

        boolean containstKey = personMap.containsKey("1234567890"); // true

        boolean containsValue = personMap.containsValue(new Person()); // true

        int size = personMap.size(); // 1

        personMap.clear();
        for (Person p : personMap.values()) {

        }
        for (String key : personMap.keySet()) {

        }
    }
}
