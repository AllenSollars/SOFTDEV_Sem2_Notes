public class MyDoubleArrayList {
    
    double[] array;

    public MyDoubleArrayList(){
        this.array = new double[0];
    }

    public void add(double toAdd){
        int oldLength = array.length;
        double[] newArray = new double[oldLength + 1];
        for(int i = 0; i < array.length; i++){
            newArray[i] = array[i];
        }
        newArray[newArray.length - 1] = toAdd;
        this.array = newArray;
    }

    public void remove(double index){
        //Do checks for index so its not negative or larger than the size of the array
        //Also check if array is not of length 0
        int oldLength = array.length;
        double[] newArray = new double[oldLength - 1];
        for (int i = 0; i < array.length; i++) {
            if(i != index){
                newArray[i] = array[i];
            }
        }
    }

}
