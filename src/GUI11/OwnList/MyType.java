package GUI11.OwnList;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;

public class MyType  extends AbstractListModel<String> {
    ArrayList<String > data = new ArrayList<>();

    MyType(){

        data.add("Alice");
        data.add("Kyrie");
        data.add("Micheal");
    }
    public void add(String s){
        if (data.contains(s)){
            JOptionPane.showMessageDialog(
                    null,s+" exist","ERROR",JOptionPane.ERROR_MESSAGE );
            return;
        }
        data.add(s);
        Collections.sort(data);
        fireIntervalAdded(this,0,data.size());
    }

    public void remove(String s){
        if (!data.contains(s)){
            JOptionPane.showMessageDialog(
                    null,"No "+s+" in the list","ERROR",
                    JOptionPane.ERROR_MESSAGE
            );
            return;
        }
        data.remove(s);
        fireIntervalAdded(this,0,data.size());
    }

    @Override
    public int getSize() {
        return data.size();
    }

    @Override
    public String getElementAt(int index) {
        return data.get(index);
    }
}
