import java.util.Scanner;

public class Zufallszahl {
    Scanner sc = new Scanner(System.in);
    int zufallszahl;
    int versuche;

    public void raten(){
        zufallszahl=(int)Math.random()*sc.nextInt()+1;
        System.out.println(zufallszahl);
    }
}
