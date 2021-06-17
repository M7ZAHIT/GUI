package GUI02.Reversible;

public class ReversibleDouble implements Reversible{
    double val;

    public ReversibleDouble(double val) {
        this.val = val;
    }

    @Override
    public Reversible reverse() {
        val = 1/val;
        return this;
    }

    @Override
    public String toString() {
        return"" + val;
    }
}
