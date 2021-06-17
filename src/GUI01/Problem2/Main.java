package GUI01.Problem2;


public class Main {
    public static void main(String[] args) {
        Person[] people = {
                new Person("A",10),
                new Person("B",9),
                new Person("C",10),
                new Person("D",5),
                new Person("E",30),
                new Person("F",1),
        } ;
        Person.sort(people);
        for (int i = 0; i <people.length ; i++) {
            System.out.println(people[i].toString());
        }
    }
}
