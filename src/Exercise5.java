import java.util.Scanner;

public class Exercise5 {

    public static double wage(int rank, double hours, double TargetDays) {
// wage calculate
        double basicWage;
        if (rank == 0) {
            basicWage = 50;
        } else {
            basicWage = 200;
        }

        // if hours == 0 then throw 0 wage regardless the target days
        if (hours == 0) {
            return 0;
        } else {
            return basicWage * hours + (TargetDays * 250);
        }
    }// end of function


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // declare my parameters
        int rank, targetDays;
        double hours;
        int newWorker;

// do while loop on new worker
        do {
            System.out.println("New Employee");
            System.out.println("please enter a rank (0 or 1) ");

            do {
                rank = scanner.nextInt();
                if (rank != 0 && rank != 1) {
                    System.out.println("Invalid rank try again!");
                }

            } while (rank != 0 && rank != 1);

            System.out.println("please enter The number of hours the employee worked this month ");

            do {
                hours = scanner.nextDouble();
                if (hours < 0) {
                    System.out.println("Invalid hours try again!");
                }
            } while (hours < 0);

            System.out.println("please enter The number of days the employee was up to target this month ");

            do {
                targetDays = scanner.nextInt();
                if (targetDays < 0) {
                    System.out.println("Invalid input try again!");
                }
            } while (targetDays < 0);


            double wage = wage(rank, hours, targetDays);
            System.out.println("The worker's wage: " + wage);

            // repeat the loop if the user is willing to calculate another worker's salary
            System.out.println("Insert another worker? [1 = yes] [0 = no]");

            newWorker = scanner.nextInt();

        } while (newWorker == 1);

        System.out.println("GOODBYE!");

    }
}