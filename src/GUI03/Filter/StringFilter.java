package GUI03.Filter;

import java.util.Arrays;

public class StringFilter {
    public static void main(String[] args) {
        String[] arr = {"Alice", "Sue", "Janet", "Bea"};
        System.out.println(Arrays.toString(arr));

        String[] a1 = SFilter.filter(arr, new LenFilter(4));
        System.out.println(Arrays.toString(a1));

        String[] a2 = SFilter.filter(arr, new SFilter() {
            @Override
            public boolean test(String val) {
                char tmp = val.charAt(0);
                return tmp >= 'A' && tmp <'D';
            }
        });
        System.out.println(Arrays.toString(a2));

        String[] a3 = SFilter.filter(arr,s -> {
            char tmp = s.charAt(0);
            return tmp >'H' && tmp <='Z';
        });
        System.out.println(Arrays.toString(a3));
    }
}
