import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Ass01_RockPaperScissors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String playerA, playerB, playAgain;

        do {
            //Get Player A move
            while (true) {
                System.out.print("Player A, enter move (Rock/Paper/Scissors): ");
                playerA = in.nextLine().trim();
                if (playerA.equalsIgnoreCase("Rock") || playerA.equalsIgnoreCase("Paper") || playerA.equalsIgnoreCase("Scissors")) {
                    break;
                } else {
                    System.out.println("Invalid input.  Enter Rock, Paper, or Scissors.");
                }
            }

            // Get Player B move
            while (true) {
                System.out.print("PlayerB, enter move (Rock, Paper, Scissors): ");
                playerB = in.nextLine().trim();
                if (playerB.equalsIgnoreCase("Rock") || playerB.equalsIgnoreCase("Paper") || playerB.equalsIgnoreCase("Scissors")) {
                    break;
                } else {
                    System.out.println("Invalid input! Enter Rock, Paper, or Scissors.");
                }
            }

            // Display result
            if (playerA.equalsIgnoreCase(playerB)) {
                System.out.println(playerA + " vs " + playerB + "You tied!");

            } else if (playerA.equalsIgnoreCase("Rock") && playerB.equalsIgnoreCase("Scissors")) {
                System.out.println("Rock breaks Scissors, Player A wins!");

            } else if (playerA.equalsIgnoreCase("Scissors") && playerB.equalsIgnoreCase("Rock")) {
                System.out.println("Rock breaks Scissors, Player B wins!");

            } else if ((playerA.equalsIgnoreCase("Paper") && playerB.equalsIgnoreCase("Rock"))) {
                System.out.println("Paper covers Rock, Player A Wins!");

            } else if ((playerA.equalsIgnoreCase("Rock") && playerB.equalsIgnoreCase("Paper"))) {
                System.out.println("Paper covers Rock, Player B Wins!");

            } else if ((playerA.equalsIgnoreCase("Scissors") && playerB.equalsIgnoreCase("Paper"))) {
                System.out.println("Scissors cuts Paper, Player A wins!");

            } else if (playerA.equalsIgnoreCase("Paper") && playerB.equalsIgnoreCase("Scissors")) {
                System.out.println("Scissors cuts Paper, Player B wins!");
            }

            // Play again?
            while (true) {
                System.out.print("Play again? (Y/N): ");
                playAgain = in.nextLine().trim();
                if (playAgain.equalsIgnoreCase("Y") || playAgain.equalsIgnoreCase("N")) {
                    break;
                } else {
                    System.out.println("Invalid input! Enter Y or N.");
                }
            }

        } while (playAgain.equalsIgnoreCase("Y"));

        System.out.println("Thank you for playing");
        in.close();
    }
}