package GUI09;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Visual {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(()->visualize());
    }
    public static void visualize(){
        JFrame frame = new JFrame("Little Box");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Text Area
        JPanel textArea = new JPanel(new GridLayout(1,1));
        JTextArea text = new JTextArea();
        textArea.add(text);
        text.append("This is a text area to visualize :>");

        //To Change Text Area
        ActionListener lis = e->{
            String s = ((JButton)e.getSource()).getText() + " clicked";
            text.setText(s);
        };

       //Buttons
        JPanel buttons = new JPanel(new GridLayout(3,3));
        for (int i = 1; i <10 ; i++) {
            JButton b = new JButton("B"+i);
            buttons.add(b);
            b.addActionListener(lis);
        }

        // Text Fields
        JPanel textFields = new JPanel(new GridLayout(3,1));
        for (int i = 0; i <3 ; i++) {
            JTextField textField = new JTextField("Text Field "+i);
            textFields.add(textField);
        }

        frame.add(textFields,BorderLayout.NORTH);
        frame.add(buttons,BorderLayout.EAST);
        frame.add(textArea,BorderLayout.WEST);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
