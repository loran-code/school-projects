/*
Loran van den Akker - 9-2-2020 - Inleiding Programmeren.
 */

public class PrintGameBoard {

    // instantieer een globaal speelbord
    public static char[][] gameBoard =
                   {{'┌', '─', '─', '─', '─', '─', '┐'},
                    {'│', ' ', '│', ' ', '│', ' ', '│'},
                    {'│', '─', '│', '─', '│', '─', '│'},
                    {'│', ' ', '│', ' ', '│', ' ', '│'},
                    {'│', '─', '│', '─', '│', '─', '│'},
                    {'│', ' ', '│', ' ', '│', ' ', '│'},
                    {'└', '─', '─', '─', '─', '─', '┘'}};

        // print het speelbord met nummers
        public static void printGameBoardWithNumbers() {

        char[][] gameBoardWithNumbers =
                {{'┌', '─', '─', '─', '─', '─', '┐'},
                 {'│', '7', '│', '8', '│', '9', '│'},
                 {'│', '─', '│', '─', '│', '─', '│'},
                 {'│', '4', '│', '5', '│', '6', '│'},
                 {'│', '─', '│', '─', '│', '─', '│'},
                 {'│', '1', '│', '2', '│', '3', '│'},
                 {'└', '─', '─', '─', '─', '─', '┘'}};

        for (char[] row : gameBoardWithNumbers) {
            for (char collum : row) {
                System.out.print(collum);
            }
            System.out.println();
        }
    }

    // print een leeg speelbord
    public static void printGameBoard(char[][] gameBoard) {

        for (char[] row : gameBoard) {
            for (char collum : row) {
                System.out.print(collum);
            }
            System.out.println();
        }
    }

    // methode om het speelbord weer leeg te maken voor een nieuwe ronde
    public static void resetGameBoard() {

            gameBoard = new char[][]
                       {{'┌', '─', '─', '─', '─', '─', '┐'},
                        {'│', ' ', '│', ' ', '│', ' ', '│'},
                        {'│', '─', '│', '─', '│', '─', '│'},
                        {'│', ' ', '│', ' ', '│', ' ', '│'},
                        {'│', '─', '│', '─', '│', '─', '│'},
                        {'│', ' ', '│', ' ', '│', ' ', '│'},
                        {'└', '─', '─', '─', '─', '─', '┘'}};
    }
}
