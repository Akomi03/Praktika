package Notizbuch;

import java.time.LocalDate;

public class Notiz {
    private String notiz;
    private String titel;
    private LocalDate faelligkeit;

    public Notiz(String pNotiz, String pTitel, LocalDate pFaelligkeit) {
        notiz = pNotiz;
        titel = pTitel;
        faelligkeit = pFaelligkeit;
    }

    public Notiz(String pNotiz, String pTitel) {
        notiz = pNotiz;
        titel = pTitel;
    }

    public String getNotiz() {
        return notiz;
    }

    public void setNotiz(String pNotiz) {
        notiz = pNotiz;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String pTitel) {
        titel = pTitel;
    }

    public LocalDate getFaelligkeit() {
        return faelligkeit;
    }

    public void setFaelligkeit(LocalDate pFaelligkeit) {
        faelligkeit = pFaelligkeit;
    }
}
