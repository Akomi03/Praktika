import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        boolean game = true;
        Scanner sc = new Scanner(System.in);
        char player = 'X';
        char[][] field = new char[3][3];
        int turn = 0;
        System.out.println("Willkommen zu einer neue Runde Tik Tak Toe");
        printfield(field);
        while (game) {
            if (turn%2==0){player ='X';}
            else {player='Z';}
            System.out.println("Der Spieler mit dem Symbol "+ player+ " ist am Zug");
            System.out.println("Bitte wählen sie ein Spalte aus");
            var xinput =sc.nextInt();
            System.out.println("Bitte wählen sie ein Zeile aus");
            var yinput =sc.nextInt();
            setfield(field,xinput,yinput,player);
            printfield(field);
            if (checkfield(field,player)==false){game=false;
                System.out.println("Das Spiel ist vorbei der Gewinner ist Spieler "+player+" !" );}
            turn++;
            if (turn>=9){game=false;
                System.out.println("Das Spiel ist vorbei keiner hat gewonnen");}
        }
    }
    public static void setfield(char[][]field,int xinput,int yinput,char player){
        if (field[yinput-1][xinput-1]== 0){field[yinput-1][xinput-1] = player;}
        else{ System.out.println("Ungültige eingabe Starten sie das Spiel neu!!!");
            System.exit(1); }
    }
    public static void printfield(char[][] field) {
        System.out.println(field[0][0]+" | "+field[0][1]+" | "+field[0][2]+"  1");
        System.out.println("-   -   -");
        System.out.println(field[1][0]+" | "+field[1][1]+" | "+field[1][2]+"  2");
        System.out.println("-   -   -");
        System.out.println(field[2][0]+" | "+field[2][1]+" | "+field[2][2]+"  3");
        System.out.println("1   2   3");

    }

    public static boolean checkfield(char[][] field,char player) {
        for (int i = 0; i <= 2; i++) {
            int win = 0;
            for (int o = 0; o <= 2; o++) {
                if (field[i][o] == player) {
                    win ++;
                }
                if (win== 3){return false;}
            }
        }
        for (int i = 0; i <= 2; i++) {
            int win = 0;
            for (int o = 0; o <= 2; o++) {
                if (field[o][i] == player) {
                    win ++;
                }
                if (win== 3){return false;}
            }
        }
        if ((field[0][0] == player && field[1][1] == player && field[2][2] == player)) {
            return false;
        }
        if ((field[0][2] == player && field[1][1] == player && field[2][0] == player)) {
            return false;
        }
        return true;
    }
}
