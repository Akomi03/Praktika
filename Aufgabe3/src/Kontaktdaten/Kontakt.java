package Kontaktdaten;

public class Kontakt {
    public final int iD;
    private String vorname;
    private String nachname;
    private String adresse;
    private String geburtsdatum;
    private String telefonnummer;
    private String email;

    public Kontakt(int iD, String vorname, String nachname, String adresse, String geburtsdatum, String telefonnummer, String email) {
        this.iD = iD;
        this.vorname = vorname;
        this.nachname = nachname;
        this.adresse = adresse;
        this.geburtsdatum = geburtsdatum;
        this.telefonnummer = telefonnummer;
        this.email = email;
    }

    public int getID() {
        return iD;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String pVorname) {
        vorname = pVorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String pNachname) {
        nachname = pNachname;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String pAdresse) {
        adresse = pAdresse;
    }

    public String getGeburtsdatum() {
        return geburtsdatum;
    }

    public void setGeburtsdatum(String pGeburtsdatum) {
        geburtsdatum = pGeburtsdatum;
    }

    public String getTelefonnummer() {
        return telefonnummer;
    }

    public void setTelefonnummer(String pTelefonnummer) {
        telefonnummer = pTelefonnummer;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String pEmail) {
        email = pEmail;
    }
}
