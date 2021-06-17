package GUI05.HailStoneSeqence;

import org.jetbrains.annotations.NotNull;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Hailstone implements Iterable<Integer>,Iterator<Integer>{
    int val;

    public Hailstone(int val) {
        this.val = val;
    }

    @NotNull
    @Override
    public Iterator<Integer> iterator() {
        return this;
    }

    @Override
    public boolean hasNext() {
       return val != 1;
    }

    @Override
    public Integer next() {
        if (!hasNext()) throw new NoSuchElementException();
        if (val % 2 == 0){
            val /=2;
        }else {
            val = 3*val +1;
        }
        return val;
    }
}
