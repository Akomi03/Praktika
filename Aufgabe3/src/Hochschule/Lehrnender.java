package Hochschule;

public class Lehrnender extends Person {

    private String schule;

    public Lehrnender(String name, int alter, String schule) {
        super(name, alter);
        this.schule = schule;
    }

    public void lernen() {
        System.out.println("Ich lerne");
    }

    public String getSchule() {
        return schule;
    }
}
