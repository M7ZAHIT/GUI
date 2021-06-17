package GUI08.GetPersons;

public class Person {
    private String name;
    Person(String n) { name = n; }
    @Override
    public String toString() {
        return name;
    }
}
