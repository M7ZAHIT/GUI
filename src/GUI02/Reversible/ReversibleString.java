package GUI02.Reversible;

public class ReversibleString implements Reversible {
    String val;

    public ReversibleString(String val) {
        this.val = val;
    }

    @Override
    public Reversible reverse() {
        char[] res = val.toCharArray();

        int startIndex = 0;
        int endIndex = res.length -1;
        char tmp;

        for (;endIndex>startIndex;startIndex++,endIndex--){
            tmp = res[startIndex];
            res[startIndex] = res[endIndex];
            res[endIndex] = tmp;

        }
        val = new String(res);
        return this;
    }

    @Override
    public String toString() {
        return val ;
    }
}
