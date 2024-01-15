public class App {
    public static void main(String[] args) throws Exception {
        Vehicle vehicle = new Vehicle("Chevy", "Camaro");
        Vehicle newVehicle = changeMake(vehicle);
        System.out.println(vehicle.getMake());
        System.out.println(newVehicle.getMake());

        int number = 4;
        int newNumber = addTwo(number);
        System.out.println(number);
        System.out.println(newNumber);


        
        try{
            int myNum = 0;
            int myNum2 = 3;
            int myNum3 = myNum2 / myNum;
        }catch(Exception ex){

        }
    }

    public static Vehicle changeMake(Vehicle vehicle) {
        vehicle.setMake("Ford");
        return vehicle;
    }

    public static int addTwo(int number) {
        number = number + 2;
        return number;
    }
}
