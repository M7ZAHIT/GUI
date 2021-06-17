package GUI05.EnumsLambdas;

import GUI05.EnumsLambdas.types.*;

public class Person {
    String name;
    Sex sex;
    Size size;
    Country country;

    public Person(String name, Sex sex, Size size, Country country) {
        this.name = name;
        this.sex = sex;
        this.size = size;
        this.country = country;
    }

    @Override
    public String toString() {
        return  name + "(" + sex +", " + size + ", " + country.toString() +')';
    }
}
