package GUI11.OwnList;

import javax.swing.*;
import java.awt.*;

public class List {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(()->myOwnDatabase());
    }
    public static void myOwnDatabase(){
        JFrame f = new JFrame("LIST");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        MyType type = new MyType();
        JList<String > list = new JList<>(type);
        JScrollPane scroll = new JScrollPane(list);
        scroll.setPreferredSize(new Dimension(200,150));

        JTextField input = new JTextField();

        input.addActionListener(i->{
            String text =  input.getText();
            if (text.startsWith("add")){
                type.add(text.split("\\s+")[1]);
            }else if (text.startsWith("del")){
                type.remove(text.split("\\s+")[1]);
            }else if (text.startsWith("quit")){
                System.exit(0);
            }else {
                JOptionPane.showMessageDialog(input,"Illegal Operation","ERROR",JOptionPane.ERROR_MESSAGE);

            }
        });


         f.add(input,BorderLayout.SOUTH);
         f.add(scroll,BorderLayout.CENTER); // CENTER by default
         f.pack();
         f.setLocationRelativeTo(null);
         f.setVisible(true);
    }
}
