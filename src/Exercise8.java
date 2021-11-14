import java.util.Scanner;

public class Exercise8 {

    public static int getValidNumber() {

        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("Enter a valid number between 5 to 20: ");
        do {
            num = input.nextInt();
            if (num < 5 || num > 20) {
                System.out.print("Invalid number try again! ");
            }
        } while (num < 5 || num > 20);

        System.out.println("Congrats! you have chose a valid number");
        return num;
    }

    public static void print(int number) {
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int number = getValidNumber();
        print(number);
    }
}