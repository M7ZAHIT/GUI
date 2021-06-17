package GUI06.Customer;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Purchase {
   private String name;
   private int price;

    public Purchase(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return
                "name = " + name +", price=" + price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
