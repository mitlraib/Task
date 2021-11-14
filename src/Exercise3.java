import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter three numbers:");
        double userInput1 = scanner.nextDouble();
        double userInput2 = scanner.nextDouble();
        double userInput3 = scanner.nextDouble();


        double max = Math.max(userInput1, Math.max(userInput2, userInput3));
        double min = Math.min(userInput1, Math.min(userInput2, userInput3));
        double mid = userInput1 + userInput2 + userInput3 - max - min;
        System.out.println("The three numbers in order are: " + min + "  " + mid + "  " + max);


    }

}
