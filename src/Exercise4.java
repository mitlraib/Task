import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter three numbers:");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double AnderTheRoot = b * b - 4.0 * a * c;
        if (AnderTheRoot > 0.0)//2 solutions
        {
            double x1 = (-b + Math.pow(AnderTheRoot, 0.5)) / (2.0 * a);
            double x2 = (-b - Math.pow(AnderTheRoot, 0.5)) / (2.0 * a);
            System.out.println("The solution is: " + x1 + " and " + x2);
        }// end of if


        else if (AnderTheRoot == 0.0)// 1 solution
        {
            double x1 = -b / (2.0 * a);
            System.out.println("There is only one solution, your answer is: " + x1);
        }// end else if


        else // no solution
        {
            System.out.println("Root is not real, no solution.");
        }
    }
}






