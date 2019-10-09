package it.nextre.academy.esercizi.cap5.es5_4_observable;
//vedi pag 103

import it.nextre.academy.myUtil.MyOutput;

import java.util.ArrayList;
import java.util.Random;

public class Es5_4_observable {

    private static final int TABELLA = 90;
    static Random r = new Random();

    public static void main(String[] args) {
        /**
         *  ottengo la lista di tutti i giocatori
         */
        Giocatori[] g = generaGiocatori();
        /**
         *  Monto il pallottoliere
         */
        PallottoliereList p = PallottoliereList.getInstance();
        /**
         * incarico l'estrattore di estrarre i numeri dal pallottoliere
         */
        EstrattoreG e = new EstrattoreG();
        /**
         * metto i numeri nel pallottoliere
          */
        p.caricaList(TABELLA);
        /**
         *   si aprono le iscrizioni
         */
        iscrizione(g, e);
        /**
         * si gioca
         */
        gioco(e, p);

    }

    private static void gioco(EstrattoreG e, PallottoliereList p) {
        ArrayList<Giocatori> winners = new ArrayList<>();
        Gioco: while (p.getDb().getLista().size() > 0) {
            //System.out.println("Giochiamo?");
            // MyInput.carattSiONo();
            e.estrai();
            System.out.println("Numeri estratti fin'ora: " + e.getEstratti());
            // System.out.println("Continuiamo a giocare?");
            // MyInput.carattSiONo();
            for (int i = 0; i < e.getGiocatori().size(); i++) {
                if (r.nextInt(100) == 99) {
                    System.out.println(e.getGiocatori().get(i).getNome() + ": non c'ho piu voglia!");
                    e.rimuoviGiocatore(e.getGiocatori().get(i));
                }
            }
            for (int i = 0; i < e.getGiocatori().size(); i++) {
                if (e.getGiocatori().get(i).isVinto()){
                    winners.add(e.getGiocatori().get(i));
                }
            }
            if (winners.size()>0){
                System.out.println("I vincitori sono: ");
                for (Giocatori g:winners) {
                    System.out.println(g.getNome());
                    MyOutput.stampaMatriceInt(g.getSchedina());
                }
                break Gioco;
            }
        }


    }//fine gioco

    private static void iscrizione(Giocatori[] g, EstrattoreG e) {
        for (int i = 0; i < g.length; i++) {
            if (r.nextInt(100) < 70) {
                System.out.println(g[i].getNome() + ": io gioco!");
                e.registraGiocatore(g[i]);
            }
        }
    }

    private static Giocatori[] generaGiocatori() {
        Giocatori[] g = new Giocatori[100];
        for (int i = 0; i < g.length; i++) {
            g[i] = new Giocatori("Giocatore" + i);
        }
        return g;

    }
}//end class
