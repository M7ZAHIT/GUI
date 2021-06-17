package GUI07.StudentGroup;

public class Student {
    String name;
    String group;
    int sNumber;

    public Student(String name, String group, int sNumber) {
        this.name = name;
        this.group = group;
        this.sNumber = sNumber;
    }

    @Override
    public String toString() {
        return  name + "(" + group +")" + sNumber ;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public int getsNumber() {
        return sNumber;
    }
}
