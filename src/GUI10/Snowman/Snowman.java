package GUI10.Snowman;

import javax.swing.*;
import java.awt.*;

public class Snowman extends JPanel{
    public static void main(String[] args) {

    }

    @Override
    public void paintComponents(Graphics g) {
        super.paintComponents(g);
        int h = getHeight();
        int w = getWidth();
        g.setColor(Color.WHITE);
        g.fillOval((w-(h/6))/2,0,h/6,h/6); // x= 1/6 of height
        g.fillOval((w-(h/4))/2,0,h/4,h/4);
        g.fillOval((w-(h/2))/2,0,h/2,h/2);
    }


}
