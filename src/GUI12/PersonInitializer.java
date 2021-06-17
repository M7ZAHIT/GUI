package GUI12;

import javax.swing.*;
import java.awt.*;

public class PersonInitializer  {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(PersonInitializer::createPerson);
    }

    public static void createPerson(){
        JFrame  frame = new JFrame("Person Initializer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        //Showing the data
        MyModel model = new MyModel();
        JList<Person> people = new JList<>(model);
        JScrollPane pane = new JScrollPane(people);
        pane.setPreferredSize(new Dimension(200,150));
        //Setting Height

        JSlider height = new JSlider(100,200);
        height.setMinorTickSpacing(5);
        height.setMajorTickSpacing(20);
        height.setPaintLabels(true);
        int h = height.getValue();

        //Setting Weight

        JSlider weight = new JSlider(40,150);
        weight.setMinorTickSpacing(5);
        weight.setMajorTickSpacing(20);
        weight.setPaintLabels(true);
        int w= weight.getValue();

        JLabel jName = new JLabel("name");
        JTextField name = new JTextField();
        JLabel jSize = new JLabel("Size");
        JComboBox<Size> size = new JComboBox<>(Size.values());
        JButton add = new JButton("Add Person");
        JButton exit = new JButton("Exit");

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel,BoxLayout.X_AXIS));

        panel.add(jName);
        panel.add(name);
        panel.add(jSize);
        panel.add(size);
        panel.add(add);
        panel.add(exit);

        JPanel sliders = new JPanel(new GridLayout(3,1,10,10));
        sliders.add(height);
        sliders.add(weight);
        sliders.add(panel);




        frame.add(pane,BorderLayout.CENTER);
        frame.add(sliders,BorderLayout.SOUTH);




        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
