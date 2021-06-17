package Project01;

import java.util.ArrayList;
import java.util.List;

public class ZeroTwo {
    public static void main(String[] args) throws InterruptedException {
        int counter = 0;
        while (counter<10) {
            int i=0;
            int next = i+1;
            if (next==threadList().size()){i=0;}
            System.out.print("Resuming "+threadList().get(i).name+", suspending "+threadList().get(next).name+" ");
                for (int j = 0; j < 5; j++) {
                   for (i = 0; i < threadList().size(); i+=1){
                        threadList().get(i).start();
                        if (counter == 9) {
                            threadList().get(i).interrupt();
                            System.out.println(threadList().get(i).name + " exited");
                        }
                   }
                }
            counter++;
            System.out.println();
        }
    }
    //Creating 5 Thread
    public static List<myThread> threadList(){
        myThread t1 = new myThread("a");
        myThread t2 = new myThread("b");
        myThread t3 = new myThread("c");
        myThread t4 = new myThread("d");
        myThread t5 = new myThread("e");
        List<myThread> threads = new ArrayList<>();
        threads.add(t1);
        threads.add(t2);
        threads.add(t3);
        threads.add(t4);
        threads.add(t5);
        return threads;

    }
}
// myThread which extends Thread
class myThread extends Thread{
    public String name;

    //Setting Thread name via constructor
    public  myThread(String name) {
        this.name = name;
    }



    //run method to print name of the Thread
    @Override
    public synchronized void run() {
        System.out.print(name);
    }
    //to suspend a method make it sleep
    public synchronized void sleep(int milliseconds){
        try {
            Thread.sleep(milliseconds);
        }catch (InterruptedException ex) {

        };
    }
}
