package Vererbung;

public class Main {
    public static void main(String[] args) {
        Busfahrer b = new Busfahrer("Dieter","König");
        b.print();
        System.out.println(b instanceof Person);
    }
}
