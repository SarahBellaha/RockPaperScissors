import java.util.Scanner;

public class Game {
    public static void getMove(Player currentPlayer) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(currentPlayer.getName() + " fait un choix entre :");
        System.out.println(" Pierre, Feuille ou Ciseaux. ");
        String chosenMove = scanner.nextLine();
        currentPlayer.setCurrentMove(chosenMove);
    }

    public static String launchGame(Player player1, Player player2) {
        int rounds = 0;
        String winner = "";
        while(rounds < 3) {
            getMove(player1);
            getMove(player2);

            Moves moveP1 = new Moves (player1.getCurrentMove());

            String winnerOfTheRound = moveP1.getResult(player2.getCurrentMove());

            switch(winnerOfTheRound){
                case "win" -> player1.setPoints(player1.getPoints()+1);
                case "lose" -> player2.setPoints(player2.getPoints()+1);
            }

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
