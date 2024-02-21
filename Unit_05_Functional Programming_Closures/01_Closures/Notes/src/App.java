import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class App {
    public static void main(String[] args) throws Exception {

        // Function<Integer, Integer> add5 = (integer) -> integer + 5;

        // System.out.println(add5.apply(2));
        // System.out.println(add5.apply(2));

        // int startValue = 15;
        // Function<Integer, Integer> addStartValueToInteger = (integer) -> {
        //     return integer + startValue;
        // };

        // int startValue2 = 15;
        // Function<Integer, Integer> add5ToStartValue2 = (integer) -> {
        //     startValue2 += integer;
        //     return startValue2;
        // };


        // //THIS BE OUR CLOSURE
        IntegerProperty startProperty = IntegerProperty.of(15);
        Function<IntegerProperty, IntegerProperty> addToStartProperty = (integer) -> {
            startProperty.plus(integer);
            return startProperty;
        };

        // Function<Integer, IntegerProperty> DivStartPropertyByInt = (integer) -> {
        //     startProperty.set(startProperty.get() / integer);
        //     return startProperty;
        // };

        // System.out.println(addIntToStartProperty.apply(5).get());
        // System.out.println(addIntToStartProperty.apply(5).get());

        // Supplier<IntegerProperty> getStartProperty = () -> startProperty;
        // Consumer<Integer> setStartProperty = (integer) -> startProperty.set(integer);

        
        startProperty.plus(IntegerProperty.of(5)).plus(IntegerProperty.of(5));
        System.out.println(startProperty);

    }
}
