public class NumberProperty<T extends Number> {
    
    private T t;

    public NumberProperty(T t){
        this.t = t;
    }

    public NumberProperty(){
        this.t = null;
    }

    public T get() {
        return t;
    }

    public void set(T t) {
        this.t = t;
    }

}
