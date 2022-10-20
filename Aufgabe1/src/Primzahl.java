import java.util.Scanner;

public class Primzahl {
    public void primzahlen(){
        Scanner sc = new Scanner(System.in);
        boolean prim = false;
        System.out.println("----------------");
        System.out.println("Bitte geben sie die zuprüfendne Zahl ein: ");
        long priminput = sc.nextLong();
        for (int i = 2; i < priminput; i++) {
            if (priminput % i == 0) {
                boolean primteiler =true;
                for (int b = 2; b < i; b++) {
                    if (i % b == 0) {
                        primteiler = false;
                        break;

                    }
                }
                if (primteiler) {
                    System.out.println(i+" ist ein Primteiler");

                }
                prim = true;
            }
        }
        if (prim == false) {
            System.out.println(priminput + " ist eine Primzahl.");
        } else {
            System.out.println(priminput + " ist keine Primzahl.");
        }
    }
}
