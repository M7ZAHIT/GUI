package GUI05.EnumsLambdas;

import GUI05.EnumsLambdas.types.*;

import java.util.Arrays;
import java.util.Comparator;

public class EnumsLambdas {
    public static void main(String[] args) {
        Person[] persons = {
                new Person("Max", Sex.M, Size.XL, Country.NL),
                new Person("Jan", Sex.M, Size.S, Country.PL),
                new Person("Eva", Sex.F, Size.XS, Country.NL),
                new Person("Lina", Sex.F, Size.L, Country.DE),
                new Person("Mila", Sex.F, Size.S, Country.DE),
                new Person("Ola", Sex.F, Size.M, Country.PL),
        };

        Comparator<Person> sexThenSize =(Person p1,Person p2) ->{
            int val = p1.sex.compareTo(p2.sex);
            if (val !=0)return val;
            else return p1.size.compareTo(p2.size);
        };
        Arrays.sort(persons, sexThenSize);
        printArray("\t*** Persons by sex and then size ***", persons);

        Arrays.sort(persons,(Person p1,Person p2)->{
            int val = p1.size.compareTo(p2.size);
            if (val != 0 )return val;
            else return p1.name.compareTo(p2.name);
        });
        printArray("\t*** Persons by size and then name ***", persons);

        Country[] countries = Country.values();
        Arrays.sort(countries,  (Country c1 ,Country c2)-> c1.toString().compareTo(c2.toString()) );
        printArray("\t*** Countries by name ***", countries);
    }

    private static void printArray(String s, Person[] persons) {
        System.out.println(s);
        for (int i = 0; i < persons.length ; i++) {
            System.out.println(persons[i].toString());
        }
    }
    private static void printArray(String s, Country[] persons) {
        System.out.println(s);
        for (int i = 0; i < persons.length ; i++) {
            System.out.println(persons[i].toString());
        }
    }
}
