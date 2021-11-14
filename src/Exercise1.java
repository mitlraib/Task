import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        int userInput = scanner.nextInt();

        if (userInput < 0) {
            userInput = -userInput;
        }
        System.out.println("The absolute value of your number is " + userInput);
        // not sure "absolute" is the right term to use, but that is what I have right now...


    }
}
