import java.util.ArrayList;
import java.util.Scanner;

public class Aufgabenbuch {
    private final ArrayList<Aufgabe> aufgaben = new ArrayList<>();
    private final Scanner sc = new Scanner(System.in);


    public void addAufgabe(String titel,String beschreibung ,String faelligAm) {
        sortbyiD();
        int iD = 0;
        for (int i = 0; i < aufgaben.size(); i++) {
            if (aufgaben.get(i).getiD() != i) {
                iD = i;
                break;
            } else {
                iD = aufgaben.size();
            }
        }
        Aufgabe aufgabe = new Aufgabe(titel,beschreibung ,faelligAm, iD);
        aufgaben.add(aufgabe);

    }

    public void removeAufgabe(int pID) {
        aufgaben.remove(pID);
    }

    public void printAufgaben() {
        sortbyzustand();
        int countA = 0;
        int countB = 0;
        int countC = 0;
        for (Aufgabe aufgabe : aufgaben) {

            if (aufgabe.getZustand() == 'a') {
                countA++;
            } else if (aufgabe.getZustand() == 'b') {
                countB++;
            } else if (aufgabe.getZustand() == 'c') {
                countC++;
            }

        }
        System.out.println("Offene Aufgaben: " + countA);
        for (Aufgabe aufgabe : aufgaben) {
            if (aufgabe.getZustand() == 'a') {
                System.out.println(aufgabe.getiD() + ": " + aufgabe.getTitel() + " " + aufgabe.getFaelligAm());
            }
        }
        System.out.println("In Bearbeitung: " + countB);
        for (Aufgabe aufgabe : aufgaben) {
            if (aufgabe.getZustand() == 'b') {
                System.out.println(aufgabe.getiD() + ": " + aufgabe.getTitel() + " " + aufgabe.getFaelligAm());
            }
        }
        System.out.println("Erledigte Aufgaben: " + countC);
        for (Aufgabe aufgabe : aufgaben) {
            if (aufgabe.getZustand() == 'c') {
                System.out.println(aufgabe.getiD() + ": " + aufgabe.getTitel() + " " + aufgabe.getFaelligAm());
            }
        }
    }

    public void viewAufgabe(int pID) {
        System.out.println("Titel: " + aufgaben.get(pID).getTitel());
        System.out.println("Beschreibung: " + aufgaben.get(pID).getBeschreibung());
        System.out.println("Zustand: " + aufgaben.get(pID).getZustandprint());
        System.out.println("Erstellt am: " + aufgaben.get(pID).getErstelltAm());
        System.out.println("Fällig am: " + aufgaben.get(pID).getFaelligAm());

    }

    public void editAufgabe(int pID) {
        viewAufgabe(pID);
        System.out.println("Was möchten Sie ändern?");
        System.out.println("1. Titel");
        System.out.println("2. Beschreibung");
        System.out.println("3. Fällig am");
        System.out.println("4. Nichts");
        String input = sc.next();
        sc.nextLine();
        switch (input) {
            case "1":
                System.out.println("Neuer Titel: ");
                aufgaben.get(pID).setTitel(sc.nextLine());
                break;
            case "2":
                System.out.println("Neue Beschreibung: ");
                aufgaben.get(pID).setBeschreibung(sc.nextLine());
                break;
            case "3":
                System.out.println("Neues Fällig am: ");
                aufgaben.get(pID).setFaelligAm(sc.nextLine());
                break;
            case "4":
                break;
            default:
                System.out.println("Fehler");
                break;
        }
    }

    public void changeZustand(int iD) {
        System.out.println("Zustand: " + aufgaben.get(iD).getZustandprint());
        System.out.println("Was möchten Sie ändern?");
        System.out.println("1. Faellig");
        System.out.println("2. in Bearbeitung");
        System.out.println("3. Erledigt");
        System.out.println("4. Nichts");
        String input = sc.next();
        sc.nextLine();
        switch (input) {
            case "1":
                aufgaben.get(iD).setZustand('a');
                break;
            case "2":
                aufgaben.get(iD).setZustand('b');
                break;
            case "3":
                aufgaben.get(iD).setZustand('c');
                break;
            case "4":
                break;
            default:
                System.out.println("Fehler");
                break;
        }
    }

    private void sortbyiD() {
        for (int i = 0; i < aufgaben.size(); i++) {
            for (int j = 0; j < aufgaben.size(); j++) {
                if (aufgaben.get(i).getiD() < aufgaben.get(j).getiD()) {
                    Aufgabe temp = aufgaben.get(i);
                    aufgaben.set(i, aufgaben.get(j));
                    aufgaben.set(j, temp);
                }
            }
        }
    }

    private void sortbyzustand() {
        sortbyDate();
        for (int i = 0; i < aufgaben.size(); i++) {
            for (int j = 0; j < aufgaben.size(); j++) {
                if (aufgaben.get(i).getZustand() < aufgaben.get(j).getZustand()) {
                    Aufgabe temp = aufgaben.get(i);
                    aufgaben.set(i, aufgaben.get(j));
                    aufgaben.set(j, temp);
                }
            }
        }
    }
    private void sortbyDate(){
        sortbyiD();
        for (int i = 0; i < aufgaben.size(); i++) {
            for (int j = 0; j < aufgaben.size(); j++) {
                if (aufgaben.get(i).getFaelligAm().compareTo(aufgaben.get(j).getFaelligAm()) < 0) {
                    Aufgabe temp = aufgaben.get(i);
                    aufgaben.set(i, aufgaben.get(j));
                    aufgaben.set(j, temp);
                }
            }
        }
    }
}
