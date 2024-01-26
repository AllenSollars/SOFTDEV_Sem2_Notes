import java.util.function.Function;

public class App {
    public static void main(String[] args) throws Exception {

        Integer[] numbers = new Integer[]{1, 2, 3};
        Function<Integer, String> intToStringMapper = (number) -> {
            return number.toString();
        };

        MyArrayList<String> strings =  MyArrayList.fromArrayToList(numbers, intToStringMapper);
        
    }
}
