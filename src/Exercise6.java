import java.util.Scanner;

public class Exercise6 {

    public static void series(int a1, int d, int n) {
        System.out.println("The series is: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a1 + " ");
            a1 += d;
        }
    }


    public static void main(String[] args) {

        int n, d, a1;
        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter The first number of the series ");
        a1 = scanner.nextInt();
        System.out.println("please enter The distance (between two numbers) of the series ");
        d = scanner.nextInt();

//n has to be positive
        System.out.println("Enter the number of elements ");
        do {
            n = scanner.nextInt();
            if (n <= 0) {
                System.out.println("please give positive number of elements (n>1) ");
            }
        } while (n <= 0);

// call the function
        series(a1, d, n);
    }
}
