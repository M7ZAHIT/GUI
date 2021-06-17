package GUI01.Problem2;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person " + "name = '" + name + ", age = " + age;
    }

    public int compareTo(Person person) {
        return (age < person.getAge()) ? -1 : ((person.getAge() == age) ? 0 : 1);
    }
    public static Person[] sort(Person  [] people){
        Person tmp;

        for (int i = 0; i <people.length ; i++) {
            for (int j = i+1; j < people.length ; j++) {
                if(people[i].compareTo(people[j])>0){
                    tmp = people[i];
                    people[i]=people[j];
                    people[j]=tmp;
                }
            }

        }
        return people;
    }
}
