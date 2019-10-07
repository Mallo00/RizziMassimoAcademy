package it.nextre.academy.designpattern.observablePattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainObservable {
    public static void main(String[] args) {
        EstrattoreRandomico esr = new EstrattoreRandomico();
        Random r = new Random();
        List<Player> giocatori = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Player tmp = new Player("Giocatore" + (i + 1), r.nextInt(90) + 1);
            giocatori.add(tmp);
            esr.addSubscriberObservable(tmp);
        }
        Integer tmp;
        while ((tmp = esr.estrai()) != null) {
            System.out.println("Estratto: " + tmp);
            for (Player p : giocatori) {
                if (p.haVinto()) {
                    esr.removeSubscriberObservable(p);
                }
            }
        }

    }
}//end class
