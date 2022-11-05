package Hochschule;

public class Schueler extends Lehrnender{

    private String klasse;

    public Schueler(String name, int alter, String schule) {
        super(name, alter, schule);
    }

    public void zurSchuleGehen(){
        System.out.println("Ich gehe zur Schule");
    }
    public void zurueckNachHause(){
        System.out.println("Ich gehe nach Hause");
    }



}
