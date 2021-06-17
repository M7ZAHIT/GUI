package GUI03.MyCol;

import java.util.Comparator;

public class MyColorCompar implements Comparator<MyColor> {
    final static int RED =0,GREEN=1,BLUE=2;
    int x;
    public MyColorCompar(int x) {
        this.x=x;
    }

    @Override
    public int compare(MyColor o1, MyColor o2) {
        switch (x) {
            case RED:
                return o1.getRed()-o2.getRed();
            case GREEN:
                return o1.getGreen()- o2.getGreen();
            case BLUE:
                return o1.getBlue()-o2.getBlue();
        }
        return 0;
    }
}
