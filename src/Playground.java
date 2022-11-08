import java.util.Scanner;

public class Playground {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Joueur 1: ");
        Player playerOne = new Player(scanner.nextLine());

        System.out.println("Joueur 2: ");
        Player playerTwo = new Player(scanner.nextLine());

        System.out.println(Game.launchGame(playerOne, playerTwo));

    }
}
