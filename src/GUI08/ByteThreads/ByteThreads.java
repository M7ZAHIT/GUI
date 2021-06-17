package GUI08.ByteThreads;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ByteThreads extends Thread {
    final static String iFileName = "artificial.jpg";
    int countAll = 0; // non-static
    int counter = 256; // non-static
    public static void main(String[] args) {
        new ByteThreads().start();

    }
    ByteThreads() {
        for (int i = 0; i < 256; ++i)
            new Thread(new ByteReader(i, this)).start();
    }
    @Override
    public void run() {
        while (true){
            try{
                Thread.sleep(100);
            }catch (InterruptedException e){

            }
            if (counter == 0){
                try{
                    System.out.println("countAll : "+countAll+"\nFiles.size : "+Files.size(Paths.get(iFileName)) );
                    return;
                }catch (IOException ex){

                }
            }
        }
    }
}
