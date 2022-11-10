package VererbungBusfahrer;

public class Person {
    private String vorname;
    private String nachname;

    public Person(String pVorname, String pNachname) {
        vorname = pVorname;
        nachname = pNachname;
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
}
