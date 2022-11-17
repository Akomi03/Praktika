import java.time.LocalDate;

public class Aufgabe {
    LocalDate now = LocalDate.now();
    private String titel;
    private String beschreibung;
    private char zustand;
    private LocalDate faelligAm;
    private final String erstelltAm;
    private final int iD;

    public Aufgabe(String pTitel,String pBeschreibung ,String pFaelligAm, int pID) {
        titel = pTitel;
        beschreibung = pBeschreibung;
        faelligAm = LocalDate.parse(pFaelligAm);
        iD = pID;
        erstelltAm = now.toString();
        zustand = 'a';
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String pTitel) {
        titel = pTitel;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String pBeschreibung) {
        beschreibung = pBeschreibung;
    }

    public String getZustandprint() {
        if (zustand == 'a') {
            return "offen";
        } else if (zustand == 'b') {
            return "in Bearbeitung";
        } else if (zustand == 'c') {
            return "erledigt";
        } else {
            return "Fehler";
        }
    }

    public char getZustand() {
        return zustand;
    }

    public void setZustand(char pZustand) {
        zustand = pZustand;
    }


    public LocalDate getFaelligAm() {
        return faelligAm;
    }

    public void setFaelligAm(String pFaelligAm) {
        faelligAm = LocalDate.parse(pFaelligAm);
    }

    public String getErstelltAm() {
        return erstelltAm;
    }

    public int getiD() {
        return iD;
    }
}
