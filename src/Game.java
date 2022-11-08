import java.util.Scanner;

public class Game {
    public static void getMove(Player currentPlayer) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(currentPlayer.getName() + " fait un choix entre :");
        System.out.println(" 1 (Pierre), 2 (Feuille) ou 3 (Ciseaux). ");
        int chosenMove = scanner.nextInt();
        currentPlayer.setCurrentMove(chosenMove);
    }

    public static String launchGame(Player player1, Player player2) {
        int rounds = 0;
        String winner = "";
        while(rounds < 3) {
            getMove(player1);
            getMove(player2);

            Moves moveP1 = new Moves (player1.getCurrentMove());

            int updateScore = moveP1.getResult(player2.getCurrentMove());

            player1.setPoints(updateScore);

            System.out.println(player1.getName() + " :" + player1.getPoints());
            System.out.println(player2.getName() + " :" + player2.getPoints());
            rounds++;
        }

        if(player1.getPoints() > player2.getPoints()){
            winner = player1.getName() + " wins !";
        } else if(player2.getPoints() > player1.getPoints()) {
            winner = player2.getName() + " wins !";
        } else {
            winner = "Les Joueurs sont à égalité !";
        }

        return winner;
    }
}
