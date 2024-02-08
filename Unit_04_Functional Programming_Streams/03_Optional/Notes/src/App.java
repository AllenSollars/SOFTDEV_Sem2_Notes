import java.util.Optional;

public class App {
    public static void main(String[] args) throws Exception {

        Optional<Integer> optInt = Optional.of(3);
        Optional<String> result = optInt.flatMap((i) -> Optional.of(i.toString()));

    }
}
