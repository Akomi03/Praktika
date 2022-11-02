import java.math.BigInteger;
import java.util.Scanner;

public class Iban {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger bLZ;
        BigInteger kontonummer;
        System.out.println("Bitte Bankleitzahl eingeben:");
        while (true) {

            try {
                String sBLZ = (sc.nextLine());
                if (sBLZ.length() == 8) {
                    bLZ = new BigInteger(sBLZ);
                    break;
                } else {
                    System.out.println("Keine Gueltige BLZ");
                }

            } catch (Exception e) {
                System.out.println("Keine Gueltige BLZ");
            }
        }
        System.out.println("Bitte Kontonummer eingeben: ");
        while (true) {
            try {
                kontonummer = new BigInteger(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Keine Gueltige Kontonummer");
            }
        }

        BigInteger withoutHash = bLZ.multiply(BigInteger.valueOf(10).pow(10)).add(kontonummer);
        BigInteger berechnungFinal = withoutHash.multiply(BigInteger.valueOf(10).pow(6)).add(BigInteger.valueOf(131400));

        var ergebnis = BigInteger.valueOf(98).subtract(berechnungFinal.mod(BigInteger.valueOf(97)));
        BigInteger iBAN = ergebnis.multiply(BigInteger.valueOf(10).pow(18)).add(withoutHash);
        if (ergebnis.toString().length() == 1) {
            System.out.println("Ihre IBAN lautet: DE0" + iBAN);
        } else {
            System.out.println("Ihre IBAN lautet: DE" + iBAN);
        }


    }
}

