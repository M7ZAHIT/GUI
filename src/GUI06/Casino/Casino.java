package GUI06.Casino;
import org.jetbrains.annotations.NotNull;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Casino implements Iterable<Integer>,Iterator<Integer>{
    int val;
    int count;

    @NotNull
    @Override
    public Iterator<Integer> iterator() {
        return this;
    }

    @Override
    public boolean hasNext() {
        return count !=3;
    }

    @Override
    public Integer next() {
        if (!hasNext())throw new NoSuchElementException();
        int number =(int) (Math.random()*2);
        if (number == val){
            count++;
        }else {
            val= number;
            count =1;
        }
        return number;
    }
}
