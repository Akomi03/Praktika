import java.util.Scanner;

public class Fleache {
   private double laenge;
    private double breite;
    private double hoehe;
    private  double radius;
    private  double ergebnis;
    private  double pi = Math.PI;
    private  Scanner sc = new Scanner(System.in);
    public void flaechenberechnung() {

        System.out.print("Wäklen Sie zwischen 0 - Kreis 1 - Dreieck 2 - Viereck: ");
        int nummer = sc.nextInt();
        switch (nummer) {

            case 0:
            {
                kreis();
                break;
            }

            case 1:
            {
                dreieck();
                break;
            }

            case 2:
            {
                viereck();
                break;

            }
            default :
            {
                System.out.println("Die eingegebene Nummer ist ungültig");
                break;
            }

        }

    }

    private void kreis() {
        System.out.print("Geben Sie den Radius des Kreises in cm  ein: ");
        radius = sc.nextInt();
        ergebnis = (radius * radius) * pi;
        System.out.println("Die Kreisfläche ist: " + ergebnis + " cm² groß");
    }

    private void dreieck() {

        System.out.print("Geben Sie die Grundlänge des Dreiecks in cm ein: ");
        laenge = sc.nextInt();
        System.out.print("Geben Sie die Höhe des Dreirecks in cm ein: ");
        hoehe = sc.nextInt();
        ergebnis = (laenge * hoehe) / 2;
        System.out.println("Die Dreiecksfläche ist: " + ergebnis + " cm² groß");
    }

    private void viereck() {
        System.out.print("Geben Sie die Länge des Vierecks in cm ein: ");
        laenge = sc.nextInt();
        System.out.print("Geben Sie die Breite des Vierecks in cm ein: ");
        breite = sc.nextInt();
        ergebnis = laenge * breite;
        System.out.println("Die Vierecksfläche ist: " + ergebnis + " cm² groß");
    }
}
