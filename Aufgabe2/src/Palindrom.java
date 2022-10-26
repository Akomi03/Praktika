import java.util.Locale;
import java.util.Scanner;

public class Palindrom {
    String[] woerter;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Palindrom p = new Palindrom(sc.nextLine());


    }
    public Palindrom(String input){
        einlesen(input);
        testen();
    }
    public void einlesen(String input) {
        woerter = input.split(" ");

    }

    public void testen() {
        for (int i = 0; i < woerter.length; i++) {
            char[] charword = woerter[i].toLowerCase().toCharArray();
            char[] palindrom = new char[charword.length];
            for (int j = 0; j<charword.length;j++){
                palindrom[palindrom.length-1-j]=charword[j];
            }
            String output = new String(palindrom);
            if (woerter[i].toLowerCase().equals(output)){
                System.out.println(woerter[i]+" ist ein Palindrom");
            }else{
                System.out.println(woerter[i]+" ist kein Palindrom");
            }

        }

    }

}
