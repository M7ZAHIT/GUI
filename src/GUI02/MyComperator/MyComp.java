package GUI02.MyComperator;

import java.util.Arrays;
import java.util.Comparator;

 class MyComp implements Comparator<Integer>  {
    public static final int
            BY_VAL=0, BY_VAL_REV=1,
            BY_NUM_OF_DIVS=2, BY_SUM_OF_DIGS=3;
    private int order;

     public MyComp(int number) {
         order = number;
     }

     @Override
     public int compare(Integer o1, Integer o2) {
         switch (order){
             case BY_VAL:
                 return o1-o2;
             case BY_VAL_REV:
                 return o2-o1;
             case BY_NUM_OF_DIVS:
                 return numberOfDivisors(o1)-numberOfDivisors(o2);
             case BY_SUM_OF_DIGS:
                 return sumOfDigits(o1)-sumOfDigits(o2);
         }
       return 0;
     }
     private int numberOfDivisors(int number){
         int counter =0;
         for (int i = 1; i <number ; i++) {
             if(number%i==0){
                 counter++;
             }
         }
         return counter;
     }
     private int sumOfDigits(int number){
         int sum=0;
         while (number>0){
             sum+=number%10;
             number/=10;
         }
         return sum;
     }
 }
class Compars {
    public static void main(String[] args) {
        Integer[] a = {1,5,33,12,98,15};
        printTable("Original    ", a);

        Arrays.sort(a,new MyComp(MyComp.BY_VAL));
        printTable("ByVal       ", a);

        Arrays.sort(a,new MyComp(MyComp.BY_VAL_REV));
        printTable("ByValRev    ", a);

        Arrays.sort(a,new MyComp(MyComp.BY_NUM_OF_DIVS));
        printTable("ByNumOfDivs ", a);

        Arrays.sort(a,new MyComp(MyComp.BY_SUM_OF_DIGS));
        printTable("BySumOfDigs ", a);
    }

    static void printTable(String mess, Integer[] a) {
        System.out.print(mess + "[ ");
        for (int d : a) System.out.print(d + " ");
        System.out.print("]\n");
    }
}
