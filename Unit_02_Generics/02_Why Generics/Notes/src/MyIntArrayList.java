public class MyIntArrayList {
    
    int[] array;

    public MyIntArrayList(){
        this.array = new int[0];
    }

    public void add(int toAdd){
        int oldLength = array.length;
        int[] newArray = new int[oldLength + 1];
        for(int i = 0; i < array.length; i++){
            newArray[i] = array[i];
        }
        newArray[newArray.length - 1] = toAdd;
        this.array = newArray;
    }

    public void remove(int index){
        //Do checks for index so its not negative or larger than the size of the array
        //Also check if array is not of length 0
        int oldLength = array.length;
        int[] newArray = new int[oldLength - 1];
        for (int i = 0; i < array.length; i++) {
            if(i != index){
                newArray[i] = array[i];
            }
        }
    }

}
