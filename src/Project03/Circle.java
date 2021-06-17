package Project03;

import java.awt.*;
import java.time.LocalDateTime;

public class Circle {
    private Color color;
    private int x,y,radius;

    public Circle( int x, int y, int radius,Color color) {
        this.color = color;
        this.x = x;
        this.y = y;
        this.radius=radius;

    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    void drawCircle(Graphics g){

        g.setColor(this.color);
        int diameter = radius*2;

        String date = LocalDateTime.now().toString();
        g.drawString(date,x-50,y-100);

        g.drawOval(x-radius+50,y-radius-50,diameter,diameter);
        //width/2 -radius/2  //y= height/2 -radius
        g.fillOval(x-radius,y-radius,diameter,diameter);
    }
}
