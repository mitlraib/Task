import java.util.Scanner;

public class Exercise9 {

    public static boolean isDivisibleBy(int number1, int number2) {
        return number1 % number2 == 0;
    }

    public static boolean isPrimeNumber(int number) {
        if (number == 2) {
            return true;
        }
        if (number == 1 || number % 2 == 0) {
            return false;
        }
        for (int i = 3; i < number; i += 2) {
            if (isDivisibleBy(number, i)) {
                return false;
            }
        }
        return true;
    }


    public static int setPositiveNumber() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive number ");
        int pNum;
        do {
            pNum = input.nextInt();
            if (pNum <= 0) {
                System.out.print("Invalid number try again! ");
            }
        } while (pNum <= 0);

        System.out.println("Congrats! you have chose a valid number");
        return pNum;
    }


    public static void main(String[] args) {

        int number = setPositiveNumber();

        for (int i = 2; i <= number; i++) {
            if (isPrimeNumber(i)) {
                System.out.print(i + " ");
            }
        }

    }
}




