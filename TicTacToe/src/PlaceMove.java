/*
Loran van den Akker - 9-2-2020 - Inleiding Programmeren.
 */

public class PlaceMove {

    public static void placeMove(char[][] gameBoard, int move, String user) {

        // initialiseer een waarde aan char zodat het gebruikt kan worden in de if, else if en de switch statements.
        char sign = ' ';

        // aan de hand van welke speler aan de beurt is word de waarde aan sign aangepast naar een X of een O.
        if (user.equals("player1")) {
            sign = 'X';
            CheckWinner.playerChoices.add(move);
        } else if (user.equals("computer")) {
            sign = 'O';
            CheckWinner.computerChoices.add(move);
        }

        // 9 opties mogelijk waarbij elke optie de getallen in de arrays [?] [?] de locatie van de case in de array aangeven.
        switch (move) {
            case 9:
                PrintGameBoard.gameBoard[1][5] = sign;
                break;
            case 8:
                PrintGameBoard.gameBoard[1][3] = sign;
                break;
            case 7:
                PrintGameBoard.gameBoard[1][1] = sign;
                break;
            case 6:
                PrintGameBoard.gameBoard[3][5] = sign;
                break;
            case 5:
                PrintGameBoard.gameBoard[3][3] = sign;
                break;
            case 4:
                PrintGameBoard.gameBoard[3][1] = sign;
                break;
            case 3:
                PrintGameBoard.gameBoard[5][5] = sign;
                break;
            case 2:
                PrintGameBoard.gameBoard[5][3] = sign;
                break;
            case 1:
                PrintGameBoard.gameBoard[5][1] = sign;
                break;
            default:
                break;
        }
    }
}

