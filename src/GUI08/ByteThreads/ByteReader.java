package GUI08.ByteThreads;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ByteReader implements Runnable {
    int m;
    ByteThreads bt;

    public ByteReader(int n, ByteThreads bt) {
        this.m = n;
        this.bt = bt;
    }

    @Override
    public void run() {
        try(InputStream is = Files.newInputStream(Paths.get(ByteThreads.iFileName))){
            int n;
            while ((n=is.read())!= -1){
                if (m == n){
                   synchronized (bt){
                       bt.countAll++;
                   }
                }
            }
            synchronized (bt) {
                bt.counter--;
            }
            System.out.println("Thread for "+m +" completed with count = "+bt.countAll);
        }catch (IOException e){

        }

    }
}
