package Project02;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class ReSizeRect extends JFrame {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(ReSizeRect::paint);
    }

    static void paint(){
        JFrame frame = new JFrame("Resize Rectangle");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

        Rectangle rectangle = new Rectangle(50,50,200,200,Color.RED);
        frame.setPreferredSize(new Dimension(600,400));

        JSlider slider = new JSlider(0,100);
        slider.setMinorTickSpacing(5);
        slider.setMajorTickSpacing(10);
        slider.setPaintLabels(true);

        JPanel panel = new JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                rectangle.drawRectangle(g);
            }

        };

        slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                if (!slider.getValueIsAdjusting()){
                    int width = slider.getValue()*5;
                    int height = slider.getValue()*5;

                    rectangle.setWidth(width);
                    rectangle.setHeight(height);

                    panel.repaint();
                }
            }
        });
        frame.add(slider, BorderLayout.SOUTH);
        frame.add(panel, BorderLayout.CENTER);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
class Rectangle{
    private int x,y,width,height;
    private Color color;

    public Rectangle(int x, int y, int width, int height, Color color) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    void drawRectangle(Graphics g){
        g.setColor(this.color);

        g.fillRect(x,y,width,height);
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
