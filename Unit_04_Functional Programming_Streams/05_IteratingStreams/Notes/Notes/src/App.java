import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class App {
    public static void main(String[] args) throws Exception {
        // List<Integer> ints = IntStream
        // .rangeClosed(0, 3)
        // .boxed()
        // .toList();

        // ints.stream().forEach((i) -> System.out.println(i));
        // ints.stream().forEachOrdered((i) -> System.out.println(i));

        // IntStream
        // .rangeClosed(0, 3)
        // .boxed()
        // .forEach((i) -> System.out.println(i+3));

        List<Integer> myList = List.of(1, 1, 3, 4);
        // List<Integer> myList2 = myList.stream().map((i) -> i + 1).toList();
        // System.out.println(myList);
        // System.out.println(myList2);

        // List<Integer> myList2WitForLoop = new ArrayList<>();
        // for(var item : myList){
        //     myList2WitForLoop.add(item);
        // }

        // myList.stream().forEach((i) -> System.out.println(i));
        // myList2.stream().forEach((i) -> System.out.println(i));

        // var thingy = myList.stream().distinct().toList();
        // System.out.println(thingy);

        var myIterator = myList.stream().iterator();
        System.out.println(myIterator.next());
        System.out.println(myIterator.next());
        System.out.println(myIterator.next());

        myList.stream().

    }
}
