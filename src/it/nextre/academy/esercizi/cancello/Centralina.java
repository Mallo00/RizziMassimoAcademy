package it.nextre.academy.esercizi.cancello;

import java.util.ArrayList;
import java.util.Random;

public class Centralina {
    public static void main(String[] args) {
        //istanza che avrà gli stati della classe statichiusura
        Cancello c = new Cancello("Cancello");
        Random r = new Random();
        //lista delle azioni da eseguire randomicamente
        ArrayList<StatiChiusura> azioni = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            azioni.add(c.getOperations()[r.nextInt(c.getOperations().length)]);
        }
        azioni.forEach(c::muoviti);
    }

}//end class
