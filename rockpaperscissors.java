
import java.util.Scanner;

/**
 *
 * @author NicDisimile disiminj@mail.uc.edu 
 */
public class rockpaperscissors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declarations
        String playerAMove = "";
        String playerBMove = "";
        String continueGame = "";
        String trash = "";
       boolean retry = true;
        Scanner in = new Scanner(System.in);

        do {

            System.out.println("Player A please make your move [R,P,S]");
            if (in.hasNextLine()) {
                do {

                    playerAMove = in.nextLine();
                    switch (playerAMove) {

                        case "r":
                        case "R":
                            playerAMove = "Rock";
                            break;
                        case "p":
                        case "P":
                            playerAMove = "Paper";
                            break;
                        case "s":
                        case "S":
                            playerAMove = "Scissors";
                            break;
                        default:
                            playerAMove = "Bad";
                            System.out.println("Bad Move.Please make your move [R,P,S]");
                    }
                } while (playerAMove == "Bad");

            }
            System.out.println("Player B please make your move [R,P,S]");
            if (in.hasNextLine()) {
                do {

                    playerBMove = in.nextLine();
                    switch (playerBMove) {

                        case "r":
                        case "R":
                            playerBMove = "Rock";
                            break;
                        case "p":
                        case "P":
                            playerBMove = "Paper";
                            break;
                        case "s":
                        case "S":
                            playerBMove = "Scissors";
                            break;
                        default:
                            playerBMove = "Bad";
                            System.out.println("Bad Move.Please make your move [R,P,S]");
                    }
                } while (playerBMove == "Bad");
                // if playerAMove==R and playerBMove==S
            }
            if ((playerAMove.equalsIgnoreCase("Rock")) && (playerBMove.equalsIgnoreCase("Scissors"))) {
                System.out.println("Rock crushes scissors. Player A wins.");
            } // if playerAMove == P and playerBMove== R
            else if ((playerAMove.equalsIgnoreCase("Paper")) && (playerBMove.equalsIgnoreCase("Rock"))) {
                System.out.println("Paper covers rock. Player A wins.");
            } // if playerAMove == S and playerBMove == P
            else if ((playerAMove.equalsIgnoreCase("Scissors")) && (playerBMove.equalsIgnoreCase("Paper"))) {
                System.out.println("Scissors cuts paper. Player A wins.");
            } // if playerBMove==R and playerBMove==S
            else if ((playerBMove.equalsIgnoreCase("Rock")) && (playerAMove.equalsIgnoreCase("Scissors"))) {
                System.out.println("Rock crushes scissors. Player B wins.");
            } // if playerBMove == P and playerBMove== R
            else if ((playerBMove.equalsIgnoreCase("Paper")) && (playerAMove.equalsIgnoreCase("Rock"))) {
                System.out.println("Paper covers rock. Player B wins.");
            } // if playerAMove == S and playerBMove == P
            else if ((playerBMove.equalsIgnoreCase("Scissors")) && (playerAMove.equalsIgnoreCase("Paper"))) {
                System.out.println("Scissors cuts paper. Player B wins.");
            } // if playerAmove == playerBMove
            else if (playerAMove == playerBMove) {
                System.out.println("Draw. Game over.");
            }
            System.out.println("Would you like to play again [Yes/No]");
            if (in.hasNextLine()) {
            continueGame = in.nextLine();
            }
                
        } while (continueGame.equalsIgnoreCase("yes"));
           
          if (continueGame.equalsIgnoreCase("no"))
          { 
              System.out.println("Thanks for playing.");
          }
    } 

}

