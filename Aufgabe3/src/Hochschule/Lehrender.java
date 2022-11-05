package Hochschule;

public class Lehrender extends Person {

    private String fach;

    public Lehrender(String name, int alter, String fach){
        super(name, alter);
        this.fach = fach;
    }

    public void pruefungStellen(){
        System.out.println("Ich stelle eine Prüfung");
    }

    public String getFach() {
        return fach;
    }
}
