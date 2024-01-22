public class StringProperty {

    private String t;

    public StringProperty(String t){
        this.t = t;
    }

    public StringProperty(){
        this.t = null;
    }

    public String get(){
        return t;
    }

    public void set(String t){
        this.t = t;
    }    
}
