import java.util.Scanner;

// Base class for players
class Player {
    Scanner sc = new Scanner(System.in);

    public int guessNumber() {
        System.out.println("Player guess the number ");
        return sc.nextInt();
    }
}

// Derived classes for individual players
class Player1 extends Player {
}

class Player2 extends Player {
}

class Player3 extends Player {
}

// Interface for Guesser
interface GuesserInterface {
    int guessNumber();
}

// Guesser class implementing GuesserInterface
class Guesser implements GuesserInterface {
    Scanner sc = new Scanner(System.in);

    @Override
    public int guessNumber() {
        System.out.println("Guesser guess the number ");
        return sc.nextInt();
    }
}

class Umpire {
    int guesserNum;
    Player1 p1;
    Player2 p2;
    Player3 p3;

    public void collectFromGuesser(GuesserInterface guesser) {
        guesserNum = guesser.guessNumber();
    }

    public void collectFromPlayers(Player p1, Player p2, Player p3) {
        this.p1 = (Player1) p1;
        this.p2 = (Player2) p2;
        this.p3 = (Player3) p3;
    }

    public void declareResult() {
        System.out.println("Number guessed by guesser is ->" + guesserNum);
        int p1Guess = p1.guessNumber();
        int p2Guess = p2.guessNumber();
        int p3Guess = p3.guessNumber();

        System.out.println("Number guessed by Player 1 is ->" + p1Guess);
        System.out.println("Number guessed by Player 2 is ->" + p2Guess);
        System.out.println("Number guessed by Player 3 is ->" + p3Guess);

        if (guesserNum == p1Guess && guesserNum == p2Guess && guesserNum == p3Guess) {
            System.out.println("All Players won ");
        } else if (guesserNum == p1Guess) {
            if (guesserNum == p2Guess) {
                System.out.println("Player 1 & 2 won");
            } else if (guesserNum == p3Guess) {
                System.out.println("Player 1 & 3 won");
            } else {
                System.out.println("Player 1 won");
            }
        } else if (guesserNum == p2Guess) {
            if (guesserNum == p3Guess) {
                System.out.println("Player 2 & 3 won");
            } else {
                System.out.println("Player 2 won");
            }
        } else if (guesserNum == p3Guess) {
            System.out.println("Player 3 won");
        } else {
            System.out.println("Game lost by every player");
        }
    }
}

public class GuesserGame {
    public static void main(String[] args) {
        Umpire umpire = new Umpire();
        Guesser guesser = new Guesser();
        Player1 player1 = new Player1();
        Player2 player2 = new Player2();
        Player3 player3 = new Player3();

        umpire.collectFromGuesser(guesser);
        umpire.collectFromPlayers(player1, player2, player3);
        umpire.declareResult();
    }
}
