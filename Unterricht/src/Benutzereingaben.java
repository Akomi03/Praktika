import java.util.Scanner;

public class Benutzereingaben {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Enter some numbers : ");
        var words = scanner.nextLine();
        var tokenScanner = new Scanner(words);
        var wordNum = 1;
        while (tokenScanner.hasNext()) {
            try {
                System.out.printf("Word %d = %s\n", wordNum++, tokenScanner.nextInt());
            }catch (Exception e){
                System.out.println("Kein Integer");
                tokenScanner.next();
            }
        }
    }
}
