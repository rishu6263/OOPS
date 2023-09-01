import java.util.Random;
import java.util.Scanner;

class Guesser{
Scanner sc=new Scanner(System.in);
    public int gessNum()
    {
//       Random random=new Random();
        System.out.println("Guesser guess the number ");
        int n=sc.nextInt();
        return n;
    }
}
class Player{
//  Random random=new Random();
Scanner sc=new Scanner(System.in);
    public int guessP1() {
        System.out.println("Player 1 guess the number ");
    int p1=sc.nextInt();
    return p1;
    }

    public int guessP2() {
        System.out.println("Player 2 guess the number ");
        int p2=sc.nextInt();
        return p2;
    }

    public int guessP3() {
        System.out.println("Player 3 guess the number ");
        int p3=sc.nextInt();
        return p3;
    }
}
class Umpire{
int guesserNum;
int P1;
int P2;
int P3;
    public void collectFromGuesser()
    {
        Guesser guesser=new Guesser();
        guesserNum=guesser.gessNum();


    }

    public void collectFromPlayer() {
        Player player=new Player();
        P1=player.guessP1();
        P2=player.guessP2();
        P3=player.guessP3();

    }

    public void declrResult() {
        System.out.println("Number guessed by guesser is ->"+guesserNum);
        System.out.println("Number guessed by Player 1 is ->"+P1);
        System.out.println("Number guessed by Player 2 is ->"+P2);
        System.out.println("Number guessed by Player 3 is ->"+P3);
        if(guesserNum==P1 && guesserNum==P2 && guesserNum==P3){
            System.out.println("All Players won ");
        }
       else  if(guesserNum==P1){
            if(guesserNum==P2){
                System.out.println("Player 1 & 2 won");
            }
            else if(guesserNum==P3){
                System.out.println("Player 1 & 3 won");
            }
            else{
                System.out.println("Player 1 won");
            }
        }
       else if(guesserNum==P2){
            if(guesserNum==P3){
                System.out.println("Player 2 & 3 won");
            }
            else{
                System.out.println("Player 2 won");
            }
        }
        else if(guesserNum==P3){

                System.out.println("Player 3 won");
        }
        else{
            System.out.println("Game lost by every player");
        }
    }
}

public class GuesserGame {
    public static void main(String[] args) {
    Umpire obj=new Umpire();
    obj.collectFromGuesser();
    obj.collectFromPlayer();
    obj.declrResult();
    }
}
