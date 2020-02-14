import java.util.Random;
import java.util.Scanner;

/*
Loran van den Akker - 9-2-2020 - Inleiding Programmeren.
 */

public class TicTacToe {

    public static void main(String[] args) {

        runGame();
    }

    public static void runGame() {

        Scanner scanner = new Scanner(System.in);

        // print het speelbord met de bijbehorende getallen. De volgorde van het keyboardNumPad is aangehouden.
        PrintGameBoard.printGameBoardWithNumbers();

        // Laat de applicatie draaien zolang er nog geen uitslag is en vraagt de gebruiker voor een getal tussen de 1 en 9.
        while (PlayAgain.isPlayingAgain == true) {

            System.out.println("Enter a number between [1 - 9] to place a [X] ");

            // Zorgt dat de gebruiker alleen een getal kan invoeren.
            while (!scanner.hasNextInt()) {
                System.out.println("Enter a number between [1 - 9] to place a [X] ");
                scanner.next();
            }

            // Vraagt de gebruiker voor een getal.
            int playerChoice = scanner.nextInt();
            // zorgt dat de gebruiker niet meerdere malen een zelfde positie kan selecteren.
            while (CheckWinner.playerChoices.contains(playerChoice) || CheckWinner.computerChoices.contains(playerChoice)) {
                System.out.println("position taken! Enter a different position.");
                // zorgt dat de applicatie niet in een eindeloze loop blijft hangen wanneer de gebruiker hetzelfde getal kiest
                playerChoice = scanner.nextInt();
            }

            // Checkt of de input van de gebruiker tussen de 1 en 9 valt. Zo ja, dan kan de onderstaande code worden uitgevoerd.
            if (playerChoice >= 1 && playerChoice <= 9) {

                // De player plaats een X op de geselecteerde positie.
                PlaceMove.placeMove(PrintGameBoard.gameBoard, playerChoice, "player1");

                //  Checkt of er aan 1 van de winnende eisen word voldaan.
                if (CheckWinner.checkWinner().length() > 0) {
                    // Laat de geplaatste X op het speelbord zien.
                    PrintGameBoard.printGameBoard(PrintGameBoard.gameBoard);
                    // als er aan een van de eisen word voldaan word een bijbehorende String als output gereturned naar de console.
                    System.out.println(CheckWinner.checkWinner());
                    // Bij win, verlies of gelijkspel wordt er gevraagd of je nog een keer wilt spelen of dat je wilt stoppen.
                    PlayAgain.playAgain();
                    break;
                }

                // gebruik de java library methode random en instantieer een nieuw object genaamd random.
                Random random = new Random();
                // Laat de computer een random getal tussen de 1 en 9 kiezen. De + 1 is vanwege de Array die van af 0 begint met tellen.
                int computerChoice = random.nextInt(9) + 1;
                // zorgt dat de computer niet meerdere malen een zelfde positie kan selecteren.
                while (CheckWinner.playerChoices.contains(computerChoice) || CheckWinner.computerChoices.contains(computerChoice)) {
                    computerChoice = random.nextInt(9) + 1;
                }

                // plaats een O op de geselecteerde positie.
                PlaceMove.placeMove(PrintGameBoard.gameBoard, computerChoice, "computer");

                // print het speelbord samen met de gespeelde zetten.

                PrintGameBoard.printGameBoard(PrintGameBoard.gameBoard);


                //  Checkt of er aan 1 van de winnende eisen wordt voldaan.
                if (CheckWinner.checkWinner().length() > 0) {
                    // Laat de geplaatste X op het speelbord zien.
                    PrintGameBoard.printGameBoard(PrintGameBoard.gameBoard);
                    // als er aan een van de eisen word voldaan word een bijbehorende String als output gereturned naar de console.
                    System.out.println(CheckWinner.checkWinner());
                    // Bij win, verlies of gelijkspel wordt er gevraagd of je nog een keer wilt spelen of dat je wilt stoppen.
                    PlayAgain.playAgain();
                    break;
                }
            }
        }
    }
}




