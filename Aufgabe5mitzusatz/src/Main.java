import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {


        Aufgabenbuch aufgabenbuch = new Aufgabenbuch();
        Scanner sc = new Scanner(System.in);
        aufgabenbuch.addAufgabe("Aufgabe1hhhhhhhh", "Beschreibung1", "2020-12-12");
        aufgabenbuch.addAufgabe("Aufgabe2hsfgh", "Beschreibung2", "2020-12-12");
        aufgabenbuch.addAufgabe("Aufgabe3", "Beschreibung3", "2020-12-12");
        aufgabenbuch.init();

        aufgabenbuch.kanban();
        System.out.println("Willkommen im Aufgabenbuch!");
        while (true) {
            System.out.println("Was m�chten Sie tun?");
            System.out.println("1. Aufgabe hinzuf�gen");
            System.out.println("2. Aufgabe l�schen");
            System.out.println("3. Aufgaben anzeigen");
            System.out.println("4. Aufgabe anzeigen");
            System.out.println("5. Aufgabe bearbeiten");
            System.out.println("6. Zustand �ndern");
            System.out.println("7. Programm beenden");

            String input = sc.next();
            switch (input) {
                case "1" -> {
                    sc.nextLine();
                    System.out.println("Titel: ");
                    String titel = sc.nextLine();
                    System.out.println("Beschreibung: ");
                    String beschreibung = sc.nextLine();
                    System.out.println("F�lligkeitsdatum: ");
                    System.out.println("Benutzen sie bitte das Format yyyy-mm-dd");
                    String faelligkeitsdatum = sc.nextLine();
                    try {
                        aufgabenbuch.addAufgabe(titel, beschreibung, faelligkeitsdatum);
                        System.out.println("Aufgabe hinzugef�gt!");
                    } catch (Exception e) {
                        System.out.println("Kein g�ltiges Datum eingegeben!");
                        System.out.println("Aufgabe konnte nicht hinzugef�gt werden!");
                    }

                    Thread.sleep(2000);
                }
                case "2" -> {
                    System.out.println("Welche Aufgabe wollen Sie l�schen?");
                    aufgabenbuch.printAufgaben();
                    System.out.println("Geben Sie die ID der Aufgabe ein, die Sie l�schen wollen: ");
                    int iD = sc.nextInt();
                    aufgabenbuch.removeAufgabe(iD);
                    System.out.println("Aufgabe gel�scht!");
                    Thread.sleep(2000);
                }
                case "3" -> {
                    aufgabenbuch.kanban();
                    Thread.sleep(2000);
                }
                case "4" -> {
                    System.out.println("Welche Aufgabe wollen Sie anzeigen?");
                    aufgabenbuch.printAufgaben();
                    System.out.println("Geben Sie die ID der Aufgabe ein, die Sie anzeigen wollen: ");
                    int iD = sc.nextInt();
                    aufgabenbuch.viewAufgabe(iD);
                    Thread.sleep(2000);
                }
                case "5" -> {
                    System.out.println("Welche Aufgabe wollen Sie bearbeiten?");
                    aufgabenbuch.printAufgaben();
                    System.out.println("Geben Sie die ID der Aufgabe ein, die Sie bearbeiten wollen: ");
                    int iD = sc.nextInt();
                    try {
                        aufgabenbuch.editAufgabe(iD);
                        System.out.println("Aufgabe bearbeitet!");
                    } catch (Exception e) {
                        System.out.println("Kein g�ltiges Datum eingegeben!");
                        System.out.println("Aufgabe konnte nicht bearbeitet werden!");
                    }
                    Thread.sleep(2000);

                }
                case "6" -> {
                    System.out.println("Welchen Zustand wollen Sie �ndern?");
                    aufgabenbuch.printAufgaben();
                    System.out.println("Geben Sie die ID der Aufgabe ein, dessen Zustand ge�ndert werden soll: ");
                    int iD = sc.nextInt();
                    aufgabenbuch.changeZustand(iD);
                    System.out.println("Zustand ge�ndert!");
                    Thread.sleep(2000);
                }
                case "7" -> {
                    System.out.println("Auf Wiedersehen!");
                    System.exit(0);
                }
                default -> System.out.println("Falsche Eingabe!");
            }
            System.out.println();
            System.out.println("------------------------------------------------");
            System.out.println();
        }
    }
}