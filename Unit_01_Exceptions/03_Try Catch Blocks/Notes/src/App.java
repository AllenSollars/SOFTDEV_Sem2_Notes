import java.util.Date;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the fibonacci number you wish to determine: ");
        String number = input.next();
        int fibNumber;
        try {
            fibNumber = Integer.parseInt(number);
        } catch (NumberFormatException ex) {
            System.out.println("Did not enter a proper number");
            System.out.println("Using default value of 1 for fibonacci number");
            fibNumber = 1;
        }
        for (int i = 1; i <= fibNumber; i++) {
            long startTime = new Date().getTime();
            long fibValue = getFib(i);
            long endTime = new Date().getTime();
            double deltaTime = endTime - startTime;
            deltaTime /= 1000.0;
            System.out.println(String.format("The %sth fibonacci number is %s:  It took %s seconds.", i, fibValue, deltaTime));
        }

    }

    public static long getFib(int fibNumber) {
        if (fibNumber == 1) {
            return 0L;
        }
        if (fibNumber == 2) {
            return 1L;
        }
        return getFib(fibNumber - 1) + getFib(fibNumber - 2);
    }

}
