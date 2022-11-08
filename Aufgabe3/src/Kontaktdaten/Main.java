package Kontaktdaten;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Kontaktbuch kontaktbuch = new Kontaktbuch();
        Scanner sc = new Scanner(System.in);
        System.out.println("Wilkommen im Kontaktbuch!");
        while (true) {
            System.out.println("Was m�chten Sie tun?");
            System.out.println("1: Kontakt hinzuf�gen");
            System.out.println("2: Kontakt l�schen");
            System.out.println("3: Kontakt anzeigen");
            System.out.println("4: Kontakt bearbeiten");
            System.out.println("5: Alle Kontakte anzeigen");
            System.out.println("6: Programm beenden");
            int auswahl = sc.nextInt();
            try {
                switch(auswahl){
                    case 1 -> {
                        sc.nextLine();
                        System.out.println("Vorname: ");
                        String vorname = sc.nextLine();
                        System.out.println("Nachname: ");
                        String nachname = sc.nextLine();
                        System.out.println("Adresse: ");
                        String adresse = sc.nextLine();
                        System.out.println("Geburtsdatum: ");
                        String geburtsdatum = sc.nextLine();
                        System.out.println("Telefonnummer: ");
                        String telefonnummer = sc.nextLine();
                        System.out.println("E-Mail: ");
                        String email = sc.nextLine();
                        kontaktbuch.addKontakt(vorname, nachname, adresse, geburtsdatum, telefonnummer, email);
                        System.out.println("Kontakt hinzugef�gt!");
                    }
                    case 2 -> {
                        System.out.println("Welchen Kontakt wollen Sie l�schen?");
                        kontaktbuch.printKontakte();
                        int iD = sc.nextInt();
                        kontaktbuch.removeKontakt(iD);
                    }
                    case 3 -> {
                        System.out.println("Welchen Kontakt wollen Sie anzeigen?");
                        kontaktbuch.printKontakte();
                        int iD = sc.nextInt();
                        kontaktbuch.viewKontakt(iD);
                    }
                    case 4 -> {
                        System.out.println("Welchen Kontakt wollen Sie bearbeiten?");
                        kontaktbuch.printKontakte();
                        System.out.println("Bitte geben Sie die ID des Kontakts ein, den Sie bearbeiten wollen: ");
                        int iD = sc.nextInt();
                        kontaktbuch.changeKontakt(iD);
                    }
                    case 5 -> kontaktbuch.printKontakte();
                    case 6 -> System.exit(0);
                }
            } catch (Exception e) {
                System.out.println("Falsche Eingabe!");
            }


        }
    }
}