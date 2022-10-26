import java.util.Scanner;

public class Ceasar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wort:");
        String zV = sc.next().toLowerCase();
        System.out.println("Key:");
        int key = sc.nextInt()%25;
        System.out.println("1: Verschlüsseln oder 2: Entschlüsseln");
        int wahl = sc.nextInt();
        switch (wahl) {
            case 1 -> drehen(zV, key);
            case 2 -> drehen(zV, key * (-1));
            default -> System.out.println("Ungültige eingabe");
        }
    }

    public static void drehen(String wort, int key) {
        StringBuilder newword= new StringBuilder();
        for(int i=0;i<wort.length();i++){
            int a = (int)wort.charAt(i)-96;
            a=a+key;
            if(a<=0){
                a=26+a;
            }
            a=a%26;
            a=a+96;
            newword.append((char) a);
        }
        System.out.println(newword);
    }
}
