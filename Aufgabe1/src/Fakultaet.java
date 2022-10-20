import java.util.Scanner;

public class Fakultaet {
    public void rechnen(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Hier bitte eine Zahl eingeben: ");
        var input = sc.nextInt();
        long ergebnis = 1;
        for (int zaehler = 1; zaehler <= input; zaehler = zaehler + 1) {
            ergebnis = ergebnis * zaehler;
        }
        System.out.println("Die Fakultät von " + input + " lautet " + ergebnis);
    }
}

