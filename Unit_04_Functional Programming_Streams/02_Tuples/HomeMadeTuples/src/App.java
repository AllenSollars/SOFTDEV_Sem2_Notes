public class App {
    public static void main(String[] args) throws Exception {

        Pair<Integer, String> myTuple = new Pair<>(3, "Three");
        System.out.println(myTuple.getFirst());
        System.out.println(myTuple.getSecond());
        Triple<Integer, String, Double> myTriple = new Triple<Integer,String,Double>(3, "PI", 3.14)
    }
}
