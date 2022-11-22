package Kalender;

import java.util.Scanner;

public class Main {
    public static Scanner sc =  new Scanner(System.in);
    public static Kalender kalender = new Kalender(31, 24);
    public static boolean main = true;

    public static void main(String[] args) {

        while (main) {
            printmeneu();
            checkmenueu();
        }
    }
    public static void printmeneu(){
        System.out.println("");
        System.out.println("1 : Termin hizufügen");
        System.out.println("2 : Termin anzeigen");
        System.out.println("3 : Tag anzeigen");
        System.out.println("4 : Monat anzeigen");
        System.out.println("5 : Programm beenden");
        System.out.println("");
    }
    public static void checkmenueu(){
        String menue = sc.next();
        switch (menue){
            case "1"->{
                System.out.println("Bitte geben sie den Tag an");
                int tag = sc.nextInt();
                System.out.println("Bitte geben sie die Stunde an für den Termin");
                int hour = sc.nextInt();
                sc.nextLine();
                System.out.println("Bitte geben sie den Termin an");
                String termin = sc.nextLine();
                kalender.addTermin(tag,hour,termin);}
            case "2"->{
                System.out.println("Bitte geben sie den Tag an");
                int tag = sc.nextInt();
                System.out.println("Bitte geben sie die Stunde an für den Termin");
                int hour = sc.nextInt();
                kalender.checkingforTermin(tag,hour);}
            case "3"->{
                System.out.println("Bitte geben sie den Tag an");
                int tag = sc.nextInt();
                kalender.checkingforTermin(tag);}
            case "4"-> {
                kalender.printMonat();}
            case "5"->{
                main = false;
            }
        }
    }
}
