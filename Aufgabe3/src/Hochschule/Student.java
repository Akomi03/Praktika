package Hochschule;

public class Student extends Lehrnender {

    private String studiengang;

    public Student(String name, int alter, String schule) {
        super(name, alter, schule);
    }


    public void pruefungSchreiben(){
        System.out.println("Ich schreibe eine Prüfung");
    }



}
