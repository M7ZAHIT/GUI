package GUI03.MyCol;

import org.jetbrains.annotations.NotNull;

import java.awt.*;

public class MyColor extends Color implements Comparable<MyColor>{

    public MyColor(int r, int g, int b) {
        super(r, g, b);
    }

    @Override
    public int compareTo(@NotNull MyColor o) {
        return (getRed()+getGreen()+getBlue())- (o.getRed()+o.getGreen()+o.getBlue());
    }

}
