package it.nextre.academy.esercizi.cap5.es5_4;

import it.nextre.academy.esercizi.cap5.es5_4_observable.Giocatori;
import it.nextre.academy.esercizi.cap5.es5_4_observable.PallottoliereList;

import java.util.ArrayList;

public class Es5_4 {

    private static final int TABELLA = 90;

    public static void main(String[] args) {
        Giocatori[] g = new Giocatori[100];
        PallottoliereList p = PallottoliereList.getInstance();
        ArrayList<Integer> estratti = new ArrayList<>();
        p.caricaList(TABELLA);
        for (int i = 0; i < g.length; i++) {
            g[i] = new Giocatori("" + i);
        }
        boolean vincita = false;
        int i = 0;
        ArrayList<Giocatori> winners = new ArrayList<>();
        while (p.getDb().getLista().size() > 0) {
            System.out.println("Fino ad ora sono stati estratti: " + estratti);
            estratti.add(p.estrai());
            System.out.println("è stato estratto il numero " + estratti.get(estratti.size() - 1));
            for (int j = 0; j < g.length; j++) {
                if (g[j].controlla(estratti.get(estratti.size() - 1) )){
                    winners.add(g[j]);
                    vincita=true;
                }
            }
            if (vincita) {
                break;
            }
        }
        System.out.println("il vincitore è: ");
        for (int j = 0; j < winners.size(); j++) {
            System.out.println(winners.get(j));
        }
    }
}//end class
