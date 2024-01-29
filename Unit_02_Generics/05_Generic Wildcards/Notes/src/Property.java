import java.util.Arrays;
import java.util.List;

public class Property<T extends Comparable<T>> implements Inequality<T> {
  
    private T t;

    public Property(T t) {
        this.t = t;
    }

    public Property() {
        
        this.t = null;
    }

    public T get() {
        return this.t;
    }

    public void set(T t) {
        this.t = t;
    }

    @Override
    public boolean isGreaterThan(T other) {
        if (t.compareTo(other) == 1){
            return true;
        } else{
            return false;
        }
    }

    @Override
    public boolean isLessThan(T other) {
        if (t.compareTo(other) == -1) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean isEqual(T other) {
        return false; //TODO:  Fix this by actually implementing the code
    }

    public static <T> List<T> fromArrayToList(T[] a){
        return Arrays.stream(a).toList();
        
    }

}
