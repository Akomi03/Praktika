package A6;

import java.util.Scanner;

public class Aufgabe6 {
    public static void main(String[] args) {
        int auswahl;
        int laenge;
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Wählen Sie zwischen Rechteck (1), Pyramide (2), Raute (3), Programm beenden (4): ");
            auswahl = scanner.nextInt();


            switch (auswahl) {
                case 1 -> {
                    boolean temp = true;
                    System.out.println("Wählen Sie die Größe \nBitte geben sie eine ungerade Zahl ein:");
                    laenge = scanner.nextInt();
                    while(temp) {
                        if (laenge % 2 == 1) {
                            temp = false;
                            rechteck(laenge);
                        }else{
                            System.out.println("Bitte geben sie eine ungerade Zahl ein");
                            laenge=scanner.nextInt();
                        }
                    }
                }
                case 2 -> {
                    System.out.println("Wählen Sie die Größe: ");
                    laenge = scanner.nextInt();
                    pyramide(laenge);
                }
                case 3 -> {
                    System.out.println("Wählen Sie die Größe: ");
                    laenge = scanner.nextInt();
                    raute(laenge);
                }
                case 4 -> System.exit(0);
                default -> System.out.println("Ungültige Eingabe bei der Auswahl der Form");
            }
        }
    }
    public static void rechteck(int laenge){
        for (int i = 0; i < laenge; i++) {
            if (i % 2 == 0) {
                System.out.print("+");
            } else System.out.print(" ");

            for (int j = 0; j < laenge + 1; j++) {
                if ((j + i) % 2 == 0) {
                    System.out.print(" ");
                } else System.out.print("+");
            }
            System.out.println();
        }
    }
    public static void pyramide(int laenge){

        int c = 1;
        for (int i = 0; i < laenge; i++) {
            for(int j = 0;j < laenge - (i+1);j++){
                System.out.print(" ");
            }
            for(int k = 0; k < c; k++){
                System.out.print("+");
            }
            c+=2;
            System.out.println();
        }
    }
    public static void raute(int laenge){
        int c = 1;
        for (int i = 0; i < laenge; i++) {
            for(int j = 0;j < laenge - (i+1);j++){
                System.out.print(" ");
            }
            for(int k = 0; k < c; k++){
                System.out.print("+");
            }
            c+=2;
            if (i == laenge - 1){
                System.out.println();
                c-=2;
                for (i = 0; i < laenge; i++) {
                    c-=2;
                    for(int j = laenge;j > laenge -(i+1);j--){
                        System.out.print(" ");
                    }
                    for(int k = 0; k < c; k++){
                        System.out.print("+");
                    }
                    System.out.println();
                }
            }
            System.out.println();
        }
    }
}
