package GUI08.GetPersons;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamNames {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(
                "john", "al", "KENNY", "jenny","noemi");
        System.out.println(getPersons(list));
    }

    static List<Person> getPersons(List<String> list) {
       return list.stream().filter(p->p.length() >3)
               .map(p-> p.substring(0,1).toUpperCase()+ p.substring(1).toLowerCase())
               .sorted().limit(3).map(p-> new Person(p) ).collect(Collectors.toList());
    }
}
