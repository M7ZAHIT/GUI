package GUI11.FileView;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class FileViewer {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(()-> directoryView());
    }
    public static void directoryView(){
        JFrame frame = new JFrame("File Viewer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTextArea text = new JTextArea(20,50);
        JButton selectFile = new JButton("Select File");
        JButton close = new JButton("Close");
        JPanel panel = new JPanel();
        panel.add(selectFile);
        panel.add(close);
        JScrollPane scroll = new JScrollPane(text,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

        selectFile.addActionListener(i->{
            File dir = new File(System.getProperty("user.home"));
            JFileChooser chooser = new JFileChooser(dir);
            chooser.setFileFilter(new FileNameExtensionFilter("Text File","txt"));
            int result = chooser.showOpenDialog(null);
            if (result == JFileChooser.APPROVE_OPTION){
                File f = chooser.getSelectedFile();
                try {
                    BufferedReader input = new BufferedReader(new InputStreamReader(
                            new FileInputStream(f)));
                    text.read(input, "READING FILE :-)");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println("Operation is CANCELLED :(");
            }
        });


        frame.add(scroll,BorderLayout.CENTER);
        frame.add(panel,BorderLayout.SOUTH);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
