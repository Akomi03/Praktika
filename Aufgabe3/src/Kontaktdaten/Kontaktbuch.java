package Kontaktdaten;

import java.util.ArrayList;
import java.util.Scanner;

public class Kontaktbuch {
    Scanner sc = new Scanner(System.in);
    ArrayList<Kontakt> kontakte = new ArrayList<>();

    public void addKontakt(String vorname, String nachname, String adresse, String geburtsdatum, String telefonnummer, String email) {
        int iD =0;
        for(int i =0; i<kontakte.size(); i++){
            if(kontakte.get(i).getiD() != i){
                iD = i;
                break;
            }else{
                iD = kontakte.size();
            }
        }
        Kontakt kontakt = new Kontakt(iD, vorname, nachname, adresse, geburtsdatum, telefonnummer, email);
        kontakte.add(kontakt);
        sortbyID();
    }


    public void removeKontakt(int iD) {
        kontakte.remove(iD);
    }

    public void printKontakte() {
        for (Kontakt kontakt : kontakte) {
            System.out.println(kontakt.iD+": "+kontakt.getVorname() + " " + kontakt.getNachname());
        }
        sortbyID();
    }

    public void viewKontakt(int pID) {
        for (Kontakt kontakt : kontakte) {
            if (kontakt.iD == pID) {
                System.out.println(kontakt.iD+": "+kontakt.getVorname() + " " + kontakt.getNachname());
                System.out.println("Adresse: "+kontakt.getAdresse());
                System.out.println("Geburtsdatum: "+kontakt.getGeburtsdatum());
                System.out.println("Telefonnummer: "+kontakt.getTelefonnummer());
                System.out.println("E-Mail: "+kontakt.getEmail());
            }
        }
    }
    public void changeKontakt(int pID) {
        for (Kontakt kontakt : kontakte) {
            if(kontakt.iD == pID) {
                System.out.println("Was möchten Sie ändern?");
                System.out.println("1. Vorname");
                System.out.println("2. Nachname");
                System.out.println("3. Adresse");
                System.out.println("4. Geburtsdatum");
                System.out.println("5. Telefonnummer");
                System.out.println("6. E-Mail");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1 -> {
                        System.out.println("Neuer Vorname: ");
                        String vorname = sc.next();
                        kontakt.setVorname(vorname);
                    }
                    case 2 -> {
                        System.out.println("Neuer Nachname: ");
                        String nachname = sc.next();
                        kontakt.setNachname(nachname);
                    }
                    case 3 -> {
                        System.out.println("Neue Adresse: ");
                        String adresse = sc.next();
                        kontakt.setAdresse(adresse);
                    }
                    case 4 -> {
                        System.out.println("Neues Geburtsdatum: ");
                        String geburtsdatum = sc.next();
                        kontakt.setGeburtsdatum(geburtsdatum);
                    }
                    case 5 -> {
                        System.out.println("Neue Telefonnummer: ");
                        String telefonnummer = sc.next();
                        kontakt.setTelefonnummer(telefonnummer);
                    }
                    case 6 -> {
                        System.out.println("Neue E-Mail: ");
                        String email = sc.next();
                        kontakt.setEmail(email);
                    }
                }
            }
        }
    }
    private void sortbyID(){
        for(int i = 0; i<kontakte.size(); i++){
            for(int j = 0; j<kontakte.size(); j++){
                if(kontakte.get(i).getiD() < kontakte.get(j).getiD()){
                    Kontakt temp = kontakte.get(i);
                    kontakte.set(i, kontakte.get(j));
                    kontakte.set(j, temp);
                }
            }
        }
    }
}
