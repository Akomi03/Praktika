import java.util.Random;
import java.util.Scanner;

public class Zufallszahl {
    Scanner sc = new Scanner(System.in);
    int zufallszahl;
    int versuche;
    Random rn = new Random();

    public void raten() {
        System.out.println("In welchen Spektrum wollen sie raten?");
        zufallszahl = rn.nextInt(sc.nextInt());
        while (true) {
            versuche++;
            System.out.println("Jetzt rate eine Zahl:");
            int guess = sc.nextInt();
            if (guess==zufallszahl){
                System.out.println("Richtig geraten in "+versuche+" Versuchen");
                break;
            }else if(guess<zufallszahl){
                System.out.println("Zu niedrig!");
            }else if(guess>zufallszahl){
                System.out.println("Zu hoch");
            }

        }
    }

}
