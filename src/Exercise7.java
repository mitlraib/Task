import java.util.Scanner;

public class Exercise7 {

    public static boolean isValidHourSelected(int hour) {

        if (hour < 0 || hour > 23) {
            System.out.println("Invalid hour!");
            return false;
        }
        return true;
    }

    public static boolean isInRange(int earliest, int latest, int open, int close) {
        return earliest >= open && latest <= close;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("which day do you want to come?(1-7) ");
        //declare parameters
        int day = scanner.nextInt();
        int earliest, latest;

        switch (day) {
            case 1:
            case 2:
            case 4:
            case 5:
                System.out.println("please state the earliest hour you can come");
                earliest = scanner.nextInt();
                if (!isValidHourSelected(earliest)) {
                    break;
                }
                System.out.println("please state the latest hour you can come ");
                latest = scanner.nextInt();
                if (!isValidHourSelected(latest)) {
                    break;
                }

                if (earliest > latest) {
                    System.out.println("Invalid!");
                    break;
                }

                if (isInRange(earliest, latest, 9, 17)) {
                    System.out.println("The appointment scheduled successfully!");
                } else {
                    System.out.println("Our opening hours are: 09:00-17:00, you have to insert both of your hours in that range");
                }

                break;

            case 3:
                System.out.println("please state the earliest hour you can come");
                earliest = scanner.nextInt();
                if (!isValidHourSelected(earliest)) {
                    break;
                }
                System.out.println("please state the latest hour you can come ");
                latest = scanner.nextInt();
                if (!isValidHourSelected(latest)) {
                    break;
                }

                if (earliest > latest) {
                    System.out.println("Invalid1");
                    break;
                }

                if (isInRange(earliest, latest, 8, 12)) {
                    System.out.println("The appointment scheduled successfully!");
                } else {
                    System.out.println("Our opening hours are: 08:00-12:00, you have to insert both of your hours in that range");
                }

                break;
            case 6:
            case 7:
                System.out.println("Sorry, we are close on the weekends...");
                break;
            default:
                System.out.println("Invalid day selected!");
                break;
        }

    }
}
