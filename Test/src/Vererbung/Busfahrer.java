package Vererbung;

public class Busfahrer extends Person {
    public Busfahrer(String pVorname, String pNachname) {
        setVorname(pVorname);
        setNachname(pNachname);
    }
    public void print(){
        System.out.println(getVorname()+" "+getNachname());
    }
}
