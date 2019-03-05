package com.java.exercises.lambda.ex03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Utwórz​​ klasę​​ sortującą​​ osoby​​ na​​ podstawie​​ środków​​ zgromadzonych​​ na​​ kontach.
 * Metodę​​ sortującą​​ umieść​​ w​​ osobnej​​ klasie,​​ tak​​ aby​​ można​​ było​​ łatwo​​ wykonać​​ testy
 * jednostkowe.​​ Wykonaj​​ zadanie​​ zgodnie​​ z​​ poniższymi​​ punktami.
 * a. Utwórz​​ klasę​​ BankAccount​​ zawierającą​​ pola:
 * i. name​​ typu​​ String
 * ii. balance​​ typu​​ Double
 * b. Utwórz​​ klasę​​ Person​​ zawierającą​​ pola:
 * i. name​​ typu​​ String
 * ii. lastName​​ typu​​ String
 * iii. accounts​​ typu​​ List<BankAccount>
 * c. Utwórz​​ 5​​ osób​​ posiadających​​ co​​ najmniej​​ 2​​ konta​​ na​​ liście​​ accounts.
 * d. Dodaj​​ utworzone​​ osoby​​ do​​ listy​​ List<paerson>
 * e. Za​​ pomocą​​ strumieni​​ posortuj​​ osoby​​ według​​ sumy​​ środków​​ zgromadzonych
 * na​​ posiadanych​​ kontach
 * persons.stream().sorted(<wyrażenie​​ lambda>);
 * f. Wyświetl​​ posortowane​​ osoby.
 * g. Przygotuj​​ testy​​ jednostkowe​​ sprawdzające​​ metodę​​ sortowania.
 */
public class Main {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        Person person = new Person("Jan", "Kowalski", Arrays.asList(
                new BankAccount("PLN", 1550d),
                new BankAccount("GBP", 134d)));
        personList.add(person);
        //personList.stream().sorted((p1, p2) -> p1.compareTo(p2));
        double a1 = person.getAccounts().stream().mapToDouble(account -> account.getBalance()).sum();
        double a2 = person.getAccounts().stream().mapToDouble(account -> account.getBalance()).sum();
        Double.compare(a1, a2);
        List<Person> sortedPersonByAccount = personList.stream().sorted((p1, p2) -> {
            double sumAccount1 = p1.getAccounts().stream().mapToDouble(a -> a.getBalance()).sum();
            double sumAccount2 = p2.getAccounts().stream().mapToDouble(a -> a.getBalance()).sum();
            return Double.compare(sumAccount1, sumAccount2);
        }).collect(Collectors.toList());
        //personList.stream().sorted((p1, p2) -> PersonAccountComparer.compare(p1, p2));
    }
}
