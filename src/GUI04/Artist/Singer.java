package GUI04.Artist;

public abstract class Singer {
    String name;
    int  id;
    static int count = 0;

    public Singer(String name) {
        this.name = name;
        id=++count;
    }
    abstract String sing();

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return  "("+id+") "+name + ':' +sing();
    }
    static Singer loudest(Singer[] singers){
        Singer loud = null;
        int max =0;
        for (int i = 0; i <singers.length ; i++) {
            int count = 0;
            for (int j = 0; j <singers[i].sing().length() ; j++) {
                if (Character.isUpperCase(singers[i].sing().charAt(j)))count++;
            }
            if (count>max){
                max = count;
                loud = singers[i];
            }
        }
        return loud;
    }
}











