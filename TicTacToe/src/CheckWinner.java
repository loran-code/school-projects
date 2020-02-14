/*
Loran van den Akker - 9-2-2020 - Inleiding Programmeren.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CheckWinner {

    // arraylists voor de zetten van de player en de computer
    public static ArrayList<Integer> playerChoices = new ArrayList<>();
    public static ArrayList<Integer> computerChoices = new ArrayList<>();

    // arraylist voor de winnende condities
    public static List<List> winnerConditions = new ArrayList<>();

    public static String checkWinner() {

        List topRow = Arrays.asList(1, 2, 3);
        List middleRow = Arrays.asList(4, 5, 6);
        List downRow = Arrays.asList(7, 8, 9);
        List leftCollum = Arrays.asList(1, 4, 7);
        List middleCollum = Arrays.asList(2, 5, 8);
        List topCollum = Arrays.asList(3, 6, 9);
        List leftDiagonal = Arrays.asList(1, 5, 9);
        List rightDiagonal = Arrays.asList(3, 5, 7);

        winnerConditions.add(topRow);
        winnerConditions.add(middleRow);
        winnerConditions.add(downRow);
        winnerConditions.add(leftCollum);
        winnerConditions.add(middleCollum);
        winnerConditions.add(topCollum);
        winnerConditions.add(leftDiagonal);
        winnerConditions.add(rightDiagonal);

        // aan de hand van de uitkomst krijg je 1 van de 3 mogelijkheden.
        for (List L : winnerConditions) {
            if (playerChoices.containsAll(L)) {
                return "__   __            _                                           _ \n" +
                        "\\ \\ / /           | |                                         | |\n" +
                        " \\ V /___  _   _  | |__   __ ___   _____  __      _____  _ __ | |\n" +
                        "  \\ // _ \\| | | | | '_ \\ / _` \\ \\ / / _ \\ \\ \\ /\\ / / _ \\| '_ \\| |\n" +
                        "  | | (_) | |_| | | | | | (_| |\\ V /  __/  \\ V  V / (_) | | | |_|\n" +
                        "  \\_/\\___/ \\__,_| |_| |_|\\__,_| \\_/ \\___|   \\_/\\_/ \\___/|_| |_(_)";

            } else if (computerChoices.containsAll(L)) {
                return " ______ __                                           _              _                                     _ \n" +
                        "|_   _| |                                          | |            | |                                   | |\n" +
                        "  | | | |__   ___    ___ ___  _ __ ___  _ __  _   _| |_ ___ _ __  | |__   __ _ ___  __      _____  _ __ | |\n" +
                        "  | | | '_ \\ / _ \\  / __/ _ \\| '_ ` _ \\| '_ \\| | | | __/ _ \\ '__| | '_ \\ / _` / __| \\ \\ /\\ / / _ \\| '_ \\| |\n" +
                        "  | | | | | |  __/ | (_| (_) | | | | | | |_) | |_| | ||  __/ |    | | | | (_| \\__ \\  \\ V  V / (_) | | | |_|\n" +
                        "  \\_/ |_| |_|\\___|  \\___\\___/|_| |_| |_| .__/ \\__,_|\\__\\___|_|    |_| |_|\\__,_|___/   \\_/\\_/ \\___/|_| |_(_)\n" +
                        "                                       | |                                                                 \n" +
                        "                                       |_|                                                                 ";

            }

            if (playerChoices.size() + computerChoices.size() == 9) {
                return " _____ _   _                   _                    _ \n" +
                        "|_   _| | ( )                 | |                  | |\n" +
                        "  | | | |_|/ ___    __ _    __| |_ __ __ ___      _| |\n" +
                        "  | | | __| / __|  / _` |  / _` | '__/ _` \\ \\ /\\ / / |\n" +
                        " _| |_| |_  \\__ \\ | (_| | | (_| | | | (_| |\\ V  V /|_|\n" +
                        " \\___/ \\__| |___/  \\__,_|  \\__,_|_|  \\__,_| \\_/\\_/ (_)";
            }
        }
        return "";
    }
}
