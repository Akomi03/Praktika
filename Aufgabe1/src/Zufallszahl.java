import java.util.Random;
import java.util.Scanner;

public class Zufallszahl {
    Scanner sc = new Scanner(System.in);
    int zufallszahl;
    int versuche;
    Random rn = new Random();

    public void raten(){
        zufallszahl=rn.nextInt(sc.nextInt());
        System.out.println(zufallszahl);
    }

}
