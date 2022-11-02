import java.util.Scanner;

public class AsciiRechner {
    public static void main(String[] args) {
        System.out.println("Bitte geben Sie einen Namen ein: ");
        Scanner sc = new Scanner(System.in);
        var input = sc.nextLine();
        char[] datenbank = input.toCharArray();

        int ergebnis = 0;

        for (int i = 0; i < input.length(); i = i + 1) {
            ergebnis = ergebnis + datenbank[i];
        }

        System.out.println("Die Summe der ASCII-Codes lautet: " + ergebnis);

        for (int i = 0; i < input.length(); i = i + 1) {
            System.out.println("Der ASCII-Code für " + datenbank[i] + " lautet " + (int) (datenbank[i]));
        }
    }
}
