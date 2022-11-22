package Kalender;

import java.util.ArrayList;
import java.util.Scanner;

public class Kalender {
    public int day;
    public int hour;
    public String termin;
    String[][] kalender = new String[31][24];
    Scanner sc = new Scanner(System.in);

    public void addTermin(int day, int hour, String termin) {
        kalender[day - 1][hour] = termin;
    }

    public void checkingforTermin(int day, int hour) {
        if (kalender[day - 1][hour] == null) {
            System.out.println("Kein Termin vorhanden.");
        } else {
            System.out.println("Termin : " + kalender[day - 1][hour]);
        }
    }

    public void checkingforTermin(int day) {
        for (int i = 0; i < 24; i++) {
            if (kalender[day - 1][i] == null){
                System.out.println("Es liegen für Stunde "+i+" keine Termine vor.");}
            else {System.out.println("Stunde "+i+": " + kalender[day - 1][i]);}
        }
    }

    public void printMonat() {
        for (int i = 0; i < 31; i++) {
            boolean termin = false;
            for (int o = 0; o < 24; o++) {
                if (kalender[i][o] != null) {
                    termin = true;
                }
            }
            if (termin == true) {
                System.out.println(i + 1 + ": Tag : Es liegen Termine für den Tag vor");
            } else System.out.println(i + 1 + ": Tag : ___");
        }
    }

    public Kalender(int day, int hour) {
        this.day = day;
        this.hour = hour;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }
}
