import java.util.concurrent.CompletableFuture;

public class App {
    public static void main(String[] args) throws Exception {
        CompletableFuture<String> future = CompletableFuture.supplyAsync(
            () -> "Hello"
        );

        // CompletableFuture<String> newFuture = future.thenApply(s -> s + " World");
        CompletableFuture<Void> newFuture = future.thenAccept(s -> {
            System.out.println(s + " World");
        });

        newFuture.get();

        

    }
}
