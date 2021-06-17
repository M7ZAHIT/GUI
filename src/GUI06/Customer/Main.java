package GUI06.Customer;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, List<Purchase>> map = new HashMap<>();
        try (BufferedReader br = Files.newBufferedReader(Paths.get("D:/Ders Belgeleri/2nd semester/2021/GUI/Database.txt"))){
            String line;
            while ((line=br.readLine())!= null){
                String[]str = line.split(" ");
                Purchase purchase = new Purchase(str[1],Integer.parseInt(str[2]));
                if (!map.containsKey(str[0])){
                    map.put(str[0],new ArrayList<Purchase>());
                }
                map.get(str[0]).add(purchase);
            }
        }
        catch (IOException e) {

        }
        for ( Map.Entry<String,List<Purchase>> entry : map.entrySet()) {
            int numberOfPurchases =  entry.getValue().size();

            Set<Purchase> set = new HashSet<>(entry.getValue());

            Set<String> tmp = new HashSet<>();
            int price=0;
            for (Purchase p : entry.getValue()) {
                price+=p.getPrice();
                tmp.add(p.getName());
            }
            int count = tmp.size();


            System.out.println(entry.getKey()+" "+ numberOfPurchases+" "+count+" "+price);
        }




    }
}
