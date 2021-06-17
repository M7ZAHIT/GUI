package GUI03.Filter;

public interface SFilter {
    boolean test(String val);
    public static String[] filter(String[] arr,SFilter filt ){
        int count = 0;
        for (int i = 0; i < arr.length ; i++) {
            if (filt.test(arr[i])){
                count++;
            }
        }
        String[] tmp = new String[count];
        for (int i = 0,j=0; i < arr.length ; i++) {
            if (filt.test(arr[i])){
                tmp[j++]=arr[i];
            }
        }
        return tmp;
    }
}
