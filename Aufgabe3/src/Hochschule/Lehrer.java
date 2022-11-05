package Hochschule;

public class Lehrer extends Lehrender {
    private String schule;

    public Lehrer(String name, int alter, String fach) {
        super(name, alter, fach);
    }

    public void unterrichten() {
        System.out.println("Ich unterrichte");
    }

    public void korrigieren() {
        System.out.println("Ich korrigiere");
    }

    public String getSchule() {
        return schule;
    }
}
