public class Vehicle {

    private String make;
    private String model;

    public Vehicle(String make, String model){
        this.make = make;
        this.model = model;
    }

    public String getMake(){
        return make;
    }

    public void setMake(String make){
        this.make = make.replaceAll(" ", "");
        this.make = make;
    }
    
}
