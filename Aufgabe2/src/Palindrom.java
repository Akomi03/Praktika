import java.util.Scanner;

public class Palindrom {
    String[] woerter;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte einen String an Wörten eingeben die überprüft werden sollen");
        new Palindrom(sc.nextLine());


    }
    public Palindrom(String input){
        einlesen(input);
        testen();
    }
    public void einlesen(String input) {
        woerter = input.split(" ");

    }

    public void testen() {
        for (String pS : woerter) {
            char[] charword = pS.toLowerCase().toCharArray();
            char[] palindrom = new char[charword.length];
            for (int j = 0; j < charword.length; j++) {
                palindrom[palindrom.length - 1 - j] = charword[j];
            }
            String output = new String(palindrom);
            if (pS.toLowerCase().equals(output)) {
                System.out.println(pS + " ist ein Palindrom");
            } else {
                System.out.println(pS + " ist kein Palindrom");
            }

        }

    }

}
