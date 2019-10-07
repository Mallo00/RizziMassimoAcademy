package it.nextre.academy.esercizi.cancello;

import java.util.HashMap;
import java.util.Map;

public class Cancello {
    String modello;
    StatiChiusura stato;
    Map<StatiChiusura, String> statiChiusuraStringMap;

    Cancello(String modello) {
        this.modello = modello;
        stato = StatiChiusura.CHIUSO;
        statiChiusuraStringMap = new HashMap<>();
        statiChiusuraStringMap.put(StatiChiusura.CHIUSO,           "|###################|");
        statiChiusuraStringMap.put(StatiChiusura.APERTO,           "|                   |");
        statiChiusuraStringMap.put(StatiChiusura.META,             "|##########         |");
        statiChiusuraStringMap.put(StatiChiusura.APERT0_UN_QUARTO, "|##############     |");
        statiChiusuraStringMap.put(StatiChiusura.CHIUSO_UN_QUARTO, "|#####              |");
    }

    public StatiChiusura getStato() {
        return stato;
    }

    public StatiChiusura[] getOperations() {
        StatiChiusura[] op = StatiChiusura.values();
        return op;
    }

    public void setStato(StatiChiusura stato) {
        this.stato = stato;
    }


    public void muoviti(StatiChiusura s) {
        System.out.println("--------------------------");
        String apertura = "";
        System.out.println("Mossa selezionata: " + s + " Stato attuale: " + getStato());
        if (s == getStato()) {
            try {
                System.out.println();
                throw new GateMoveException();
            } catch (GateMoveException e) {
                System.err.println(e+"\n");
//                System.out.println("\n--------------------------");
                return;
            }
        }
        /*
        switch (s) {
            case CHIUSO:
                System.out.println("Mi chiudo");
                stato = StatiChiusura.CHIUSO;
                break;
            case APERTO:
                System.out.println("Mi apro");
                stato = StatiChiusura.APERTO;
                break;
            case META:
                System.out.println("Mi apro a META");
                stato = StatiChiusura.META;
                break;
            case APERT0_UN_QUARTO:
                System.out.println("Mi apro UN QUARTO");
                stato = StatiChiusura.APERT0_UN_QUARTO;
                break;
            case CHIUSO_UN_QUARTO:
                System.out.println("Mi CHIUDO UN QUARTO");
                stato = StatiChiusura.CHIUSO_UN_QUARTO;
                break;
        }//end switch

         */
        stato=s;
        stampaStato();
    }

    private void stampaStato() {
        System.out.println(statiChiusuraStringMap.get(getStato()));
    }

}//end class
