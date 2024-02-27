public class App {
    public static void main(String[] args) throws Exception {

        NumberProperty<Integer> myNumProp = NumberProperty.of(3);
        NumberProperty<Double> myNumProp2 = NumberProperty.of(3.1415);
        NumberProperty<Long> myLongProp = NumberProperty.of(234234234223423423l);
        System.out.println(myNumProp);
        System.out.println(myNumProp2);
        System.out.println(myLongProp);

    }
}
