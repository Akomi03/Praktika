package VererbungBusfahrer;

public class Busfahrer extends Person {
    public Busfahrer(String pVorname, String pNachname) {
       super(pVorname, pNachname);
    }
    public void print(){
        System.out.println(getVorname()+" "+getNachname());
    }
}
