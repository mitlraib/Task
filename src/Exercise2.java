import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter two numbers:");
        int userInput = scanner.nextInt();
        int userInput2 = scanner.nextInt();
        int sum = userInput + userInput2;
        if (sum % 2 == 0) {
            System.out.println("The sum of the two numbers you entered is even");
        }// end if
        else {
            System.out.println("The sum of the two numbers you entered is uneven");
        }// end else
    }
}
