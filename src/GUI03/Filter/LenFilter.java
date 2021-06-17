package GUI03.Filter;

public class LenFilter implements SFilter {
    int minLen;

    public LenFilter(int minLen) {
        this.minLen = minLen;
    }

    @Override
    public boolean test(String val) {
        return val.length() >= minLen;
    }
}
