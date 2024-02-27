public class NumberProperty<T extends Number> {

    public static <T extends Number> NumberProperty<T> of(T t) {
        return new NumberProperty<>(t);
    }

    private T t;

    private NumberProperty(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public void set(T t){
        this.t = t;
    }

    @Override
    public String toString() {
        // if (t instanceof Integer) {
        //     return Integer.toString((int) t);
        // } else if (t instanceof Double) {
        //     return Double.toString((double) t);
        // }else{
        //     return "¯\\_(ツ)_/¯";
        // }
        return Double.toString(t.doubleValue());

    }

}
