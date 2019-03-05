package com.java.exercises.lambda.ex03;

import com.sun.org.apache.xml.internal.resolver.readers.ExtendedXMLCatalogReader;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class PersonAccountComparerTest {

    @Test
    public void shouldCompare2Accounts() {
        Person person1 = new Person("Jan", "Kowalski", Arrays.asList(
                new BankAccount("PLN", 1550d),
                new BankAccount("GBP", 134d)));
        Person person2 = new Person("Janina", "Kowalska", Arrays.asList(
                new BankAccount("PLN", 1550d),
                new BankAccount("GBP", 134d),
                new BankAccount("CHM", 10000d)));

        int result = PersonAccountComparer.compare(person1, person2);
        Assert.assertTrue(result == -1);
    }

}