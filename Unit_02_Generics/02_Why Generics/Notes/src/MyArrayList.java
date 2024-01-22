import java.lang.reflect.Array;

public class MyArrayList<T> {

    T[] array;

    public MyArrayList() {
        this.array = (T[])Array.newInstance(new Class<T>(), 0);
    }

    public void add(T toAdd) {
        int oldLength = array.length;
        T[] newArray = (T[]) Array.newInstance(new Class<T>(), oldLength + 1);
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        newArray[newArray.length - 1] = toAdd;
        this.array = newArray;
    }

    public void remove(int index) {
        // Do checks for index so its not negative or larger than the size of the array
        // Also check if array is not of length 0
        int oldLength = array.length;
        T[] newArray = (T[]) Array.newInstance(new Class<T>(), oldLength - 1);
        for (int i = 0; i < array.length; i++) {
            if (i != index) {
                newArray[i] = array[i];
            }
        }
    }

}
