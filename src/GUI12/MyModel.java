package GUI12;

import javax.swing.*;
import java.util.ArrayList;

public class MyModel  extends AbstractListModel<Person> {
    ArrayList<Person> people = new ArrayList<>();

    public MyModel() {
        people.add(new Person("Kayle",180,80,Size.L));
    }

    public void addPerson(Person person ){
        people.add(person);
        fireIntervalAdded(this,0,people.size());
    }

    @Override
    public int getSize() {
        return people.size();
    }

    @Override
    public Person getElementAt(int index) {
        return people.get(index);
    }
}
