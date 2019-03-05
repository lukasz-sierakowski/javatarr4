package com.java.exercises.lambda.ex03;

public class PersonAccountComparer {
    public static int compare(Person person1, Person person2){
        double sumAccount1 = person1.getAccounts().stream().mapToDouble(a -> a.getBalance()).sum();
        double sumAccount2 = person2.getAccounts().stream().mapToDouble(a -> a.getBalance()).sum();
        return Double.compare(sumAccount1, sumAccount2);
    }
}
