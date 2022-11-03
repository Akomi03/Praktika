package Notizbuch;

import java.time.LocalDate;
import java.util.ArrayList;

public class Notizbuch {
    private final String name;
    ArrayList<Notiz> buch = new ArrayList<>();

    public Notizbuch(String pName) {
        name = pName;
    }

    public void add(String pTitel, String pNotiz) {
        buch.add(new Notiz(pNotiz, pTitel));
    }

    public void add(String pTitel, String pNotiz, LocalDate pDate) {
        buch.add(new Notiz(pNotiz, pTitel, pDate));
    }

    public void list() {
        Notiz[] b = new Notiz[buch.size()];
        for (int i = 0; i < buch.size(); i++) {
            b[i] = buch.get(i);
        }
        for (Notiz arr : b) {
            if (arr.getFaelligkeit() != null) {
                System.out.println(arr.getTitel() + " | " + arr.getFaelligkeit());
            } else {
                System.out.println(arr.getTitel() + " | kein Datum Vorhanden");
            }
            System.out.println();
        }
    }

    public void view(String pTitel) {
        String titel = "";
        int i = 0;
        while (!titel.equals(pTitel)) {
            if (i >= buch.size()) {
                System.out.println("Keine Notiz vorhanden");
                return;
            }
            titel = buch.get(i).getTitel();
            i++;
        }
        System.out.println(buch.get(i - 1).getTitel() + " | " + buch.get(i - 1).getNotiz());

    }

    public void delete(String pTitel) {
        String titel = "";
        int i = 0;
        while (!titel.equals(pTitel)) {
            if (i >= buch.size()) {
                System.out.println("Keine Notiz vorhanden");
                return;
            }
            titel = buch.get(i).getTitel();
            i++;
        }
        System.out.println("Notiz mit Titel " + pTitel + " erfolgreich geloescht");
        buch.remove(i - 1);

    }

    public void edit(String pTitel, String pNew) {
        String titel = "";
        int i = 0;
        while (!titel.equals(pTitel)) {
            if (i >= buch.size()) {
                System.out.println("Keine Notiz vorhanden");
                return;
            }
            titel = buch.get(i).getTitel();
            i++;
        }
        buch.get(i - 1).setNotiz(pNew);
        System.out.println(buch.get(i - 1).getTitel() + " | " + buch.get(i - 1).getNotiz());

    }


    public String getName() {
        return name;
    }

}
