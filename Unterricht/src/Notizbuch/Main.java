package Notizbuch;

public class Main {
    public static void main(String[] args) {
        Notizbuch n = new Notizbuch("Test");
        n.add("Hallo","Ich sage hallo");
        n.add("Hallo2","Ich sage hallo2");
        n.delete("Hallo");
        n.list();
    }
}
