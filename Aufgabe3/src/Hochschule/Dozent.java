package Hochschule;

public class Dozent extends Lehrender {

   private String uni;

    public Dozent(String name, int alter, String fach) {
        super(name, alter, fach);
    }

    public void vorlesungHalten(){
        System.out.println("Ich halte eine Vorlesung");
    }

    public String getUni() {
        return uni;
    }
}

