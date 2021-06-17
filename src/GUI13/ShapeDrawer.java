package GUI13;

import javax.swing.*;
import java.awt.*;

public class ShapeDrawer {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(ShapeDrawer::application);
    }
    public static void application(){
        JFrame frame = new JFrame("Rectangles and Ellipses");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JComboBox<Color> color = new JComboBox();
        JComboBox<Shape> shape = new JComboBox();
        JComboBox<Appearance> filledOrContour = new JComboBox();
        JPanel panel = new JPanel();
        

        frame.add(panel,BorderLayout.NORTH);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}
