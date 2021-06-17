package Project03;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;


public class ColorSelector {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(ColorSelector::colorSelector);
    }
    static void colorSelector(){
        JFrame frame = new JFrame("Color Selector");
        Circle circle = new Circle(200,200,50,Color.CYAN);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(600,400));
        //Background
        JPanel background = new JPanel( new BorderLayout());
        JPanel sliders= new JPanel();
        JSlider r1= new JSlider(JSlider.VERTICAL);
        JSlider g1= new JSlider(JSlider.VERTICAL);
        JSlider b1= new JSlider(JSlider.VERTICAL);
        r1.setMaximum(255);
        g1.setMaximum(255);
        b1.setMaximum(255);
        sliders.add(r1);
        sliders.add(g1);
        sliders.add(b1);
        r1.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                frame.getContentPane().setBackground(new Color(r1.getValue(),g1.getValue(),b1.getValue()));
            }
        });
        g1.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                frame.getContentPane().setBackground(new Color(r1.getValue(),g1.getValue(),b1.getValue()));
            }
        });
        b1.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                frame.getContentPane().setBackground(new Color(r1.getValue(),g1.getValue(),b1.getValue()));
            }
        });

        JLabel backText = new JLabel("Background");
        JTextArea hexOfBackground= new JTextArea();

        background.add(backText,BorderLayout.NORTH);
        background.add(sliders,BorderLayout.CENTER);
        background.add(hexOfBackground,BorderLayout.SOUTH);

        //Foreground
        JPanel foreground = new JPanel(new BorderLayout());
        JPanel foregroundSliders = new JPanel();
        JSlider r2= new JSlider(JSlider.VERTICAL);
        JSlider g2= new JSlider(JSlider.VERTICAL);
        JSlider b2= new JSlider(JSlider.VERTICAL);
        r2.setValue(200);
        g2.setValue(200);
        b2.setValue(200);
        r2.setMaximum(255);
        g2.setMaximum(255);
        b2.setMaximum(255);

        foregroundSliders.add(r2);
        foregroundSliders.add(g2);
        foregroundSliders.add(b2);
        JLabel foreText = new JLabel("Foreground");

        JTextArea hexOfCircle = new JTextArea();

        r2.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
              circle.setColor(new Color(r2.getValue(),g2.getValue(),b2.getValue()));
              frame.repaint();
            }
        });
        g2.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                circle.setColor(new Color(r2.getValue(),g2.getValue(),b2.getValue()));
                frame.repaint();
            }
        });
        b2.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                circle.setColor(new Color(r2.getValue(),g2.getValue(),b2.getValue()));
                frame.repaint();
            }
        });

        foreground.add(foreText,BorderLayout.NORTH);
        foreground.add(foregroundSliders,BorderLayout.CENTER);
        foreground.add(hexOfCircle,BorderLayout.SOUTH);
        //Center

        JPanel circles = new JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                setBackground(new Color(r1.getValue(), g1.getValue(), b1.getValue()));
                circle.setColor(new Color(r2.getValue(), g2.getValue(), b2.getValue()));
                String hexBackground = String.format("#%02X%02X%02X", r1.getValue(), g1.getValue(), b1.getValue());
                hexOfBackground.setText(hexBackground);
                String hex = String.format("#%02X%02X%02X", r2.getValue(), g2.getValue(), b2.getValue());
                hexOfCircle.setText(hex);
                circle.drawCircle(g);
            }
        };


        frame.add(foreground,BorderLayout.WEST);
        frame.add(circles);
        frame.add(background,BorderLayout.EAST);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}

