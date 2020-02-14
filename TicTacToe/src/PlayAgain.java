/*
Loran van den Akker - 9-2-2020 - Inleiding Programmeren.
 */

import java.util.Scanner;

public class PlayAgain {

    public static boolean isPlayingAgain = true;

    public static void playAgain() {

        Scanner scanner = new Scanner(System.in);

        // While loop zorgt ervoor dat je in de loop blijft tot de juiste keuzes door de gebruiker zijn gemaakt.
        while (isPlayingAgain) {
            System.out.println("\nPlay another game? [Y] / [N]");

            // scanner.hasNext methode zorgt ervoor dat je alleen kan kiezen uit een String/char als gebruikers invoer.
            while (scanner.hasNext()) {

                String playingAgainResponse = scanner.next();

                // vraagt om gebruikers invoer en zet het om naar kleine letters.
                // Als de gebruiker y of Y invoert zal de onderstaande code worden uitgevoerd.
                if (playingAgainResponse.equalsIgnoreCase("y")) {
                    // wist de keuzes(arrays) van beide spelers
                    CheckWinner.playerChoices.clear();
                    CheckWinner.computerChoices.clear();
                    // print het gameboard opnieuw en leeg uit
                    PrintGameBoard.resetGameBoard();
                    // begint het spel opnieuw
                    TicTacToe.runGame();

                } else if (playingAgainResponse.equalsIgnoreCase("n")) {
                    // als de gebruiker N of n kiest dan krijgt de gebruiker een goodbye bericht
                    // en de applicatie zal stoppen
                    isPlayingAgain = false;
                    System.out.println(" _____                 _ _                _ \n" +
                            "|  __ \\               | | |              | |\n" +
                            "| |  \\/ ___   ___   __| | |__  _   _  ___| |\n" +
                            "| | __ / _ \\ / _ \\ / _` | '_ \\| | | |/ _ \\ |\n" +
                            "| |_\\ \\ (_) | (_) | (_| | |_) | |_| |  __/_|\n" +
                            " \\____/\\___/ \\___/ \\__,_|_.__/ \\__, |\\___(_)\n" +
                            "                                __/ |       \n" +
                            "                               |___/        ");
                    break;
                }
                break;
            }
        }
    }
}
