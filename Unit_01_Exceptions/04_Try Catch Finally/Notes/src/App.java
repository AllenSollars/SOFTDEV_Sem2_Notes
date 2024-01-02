import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the fibonacci number you wish to determine: ");
        String number = input.next();
        processFib(number);
    }

    public static void processFib(String number) {
        int fibNumber = 1;
        try {
            fibNumber = Integer.parseInt(number);
        } catch (NumberFormatException ex) {
            System.out.println("Did not enter a proper number");
            System.out.println("Using default value of 1 for fibonacci number");
        } finally {
            int fibValue = getFib(fibNumber);
            System.out.println(String.format("The %sth fibonacci number is %s.", fibNumber, fibValue));
        }
    }

    public static int getFib(int fibNumber) {
        if (fibNumber == 1) {
            return 0;
        }
        if (fibNumber == 2) {
            return 1;
        }
        return getFib(fibNumber - 1) + getFib(fibNumber - 2);
    }

}
