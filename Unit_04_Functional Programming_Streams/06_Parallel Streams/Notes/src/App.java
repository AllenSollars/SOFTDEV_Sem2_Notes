import java.util.List;
import java.util.stream.IntStream;

public class App {
    public static void main(String[] args) throws Exception {
        System.setProperty("java.util.concurrent.ForkJoinPool.common.parallelism", "4");
        List<Integer> myInts = IntStream.rangeClosed(1, 1000).boxed().toList();
        double startMillis = System.currentTimeMillis();
        List<Double> newDoubles = myInts.stream().map((i) -> (double)2*i).toList();
        double endMillis = System.currentTimeMillis();
        double difference = endMillis - startMillis;
        System.out.println(difference);
    }
}
