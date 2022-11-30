package Kontaktdaten;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Kontaktbuch kontaktbuch = new Kontaktbuch();
        Scanner sc = new Scanner(System.in);

        // Testdaten
        kontaktbuch.addKontakt("Max", "Mustermann", "Musterstraße 1", "01.01.2000", "0123456789", "maxmustermann@gmail.com");
        kontaktbuch.addKontakt("Jonas", "Müller", "Musterstraße 2", "02.02.2000", "0123456789", "jonasmü@gmail.com");
        kontaktbuch.addKontakt("Martin", "Macher", "Musterstraße 3", "03.03.2000", "0123456789", "martinma@gmial.com");

        System.out.println("Willkommen im Kontaktbuch!");
        while (true) {
            System.out.println("Was möchten Sie tun?");
            System.out.println("1: Kontakt hinzufügen");
            System.out.println("2: Kontakt löschen");
            System.out.println("3: Kontakt anzeigen");
            System.out.println("4: Kontakt bearbeiten");
            System.out.println("5: Alle Kontakte anzeigen");
            System.out.println("6: Programm beenden");

            try {
                String auswahl = sc.next();
                switch (auswahl) {
                    case "1" -> {
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
                        System.out.println("Kontakt hinzugefügt!");
                        Thread.sleep(2000);
                    }
                    case "2" -> {
                        System.out.println("Welchen Kontakt wollen Sie löschen?");
                        kontaktbuch.printKontakte();
                        System.out.println("Geben Sie die ID des Kontakts ein, den Sie löschen wollen: ");
                        int iD = sc.nextInt();
                        kontaktbuch.removeKontakt(iD);
                        System.out.println("Kontakt gelöscht!");
                        Thread.sleep(2000);
                    }
                    case "3" -> {
                        System.out.println("Welchen Kontakt wollen Sie anzeigen?");
                        kontaktbuch.printKontakte();
                        System.out.println("Geben Sie die ID des Kontakts ein, den Sie anzeigen wollen: ");
                        int iD = sc.nextInt();
                        kontaktbuch.viewKontakt(iD);
                        Thread.sleep(2000);
                    }
                    case "4" -> {
                        System.out.println("Welchen Kontakt wollen Sie bearbeiten?");
                        kontaktbuch.printKontakte();
                        System.out.println("Bitte geben Sie die ID des Kontakts ein, den Sie bearbeiten wollen: ");
                        int iD = sc.nextInt();
                        kontaktbuch.changeKontakt(iD);
                        System.out.println("Kontakt bearbeitet!");
                        Thread.sleep(2000);
                    }
                    case "5" -> {
                        kontaktbuch.printKontakte();
                        System.out.println("Drücken Sie Enter, um fortzufahren...");
                        System.in.read();
                    }
                    case "6" -> {
                        System.out.println("Programm beendet!");
                        System.exit(0);
                    }
                    default -> {
                        System.out.println("Bitte geben Sie eine Zahl zwischen 1 und 6 ein!");
                        Thread.sleep(2000);
                    }
                }
            } catch (Exception e) {
                System.out.println("Fehler: " + e.getMessage());
                System.exit(0);
            }

            System.out.println();
            System.out.println("------------------------------------------------");
            System.out.println();
        }
    }
}
