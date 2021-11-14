import java.util.Random;
import java.util.Scanner;

public class Exercise10 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("I picked a number, try guessing it");
        Random rand = new Random();
        int userInput;
        // Generate random integers in range 0 to 1000
        int randNumber = rand.nextInt(1001);

        // even number symbolize player 1's turn
        int countTurns = 1;
        int turn;
        int numOfGuesses;
        boolean finish = false;


        while (!finish) {

            if (countTurns % 2 != 0) {
                turn = 1;
            } else {
                turn = 2;
            }
            System.out.print("player " + turn + ": try guss the number ");
            userInput = input.nextInt();
            countTurns++;

            if (userInput == randNumber) {
                finish = true;
                if (turn == 1) {
                    numOfGuesses = countTurns / 2;
                } else {
                    numOfGuesses = countTurns / 2;
                }
                System.out.println("Player " + turn + " won in " + numOfGuesses);
            } else {
                if (userInput < randNumber) {
                    System.out.println("Guessed wrong! (HINT: guess HIGHER!");
                } else {
                    System.out.println("Guessed wrong! (HINT: guess LOWER!");
                }
            }
        }
    }
}