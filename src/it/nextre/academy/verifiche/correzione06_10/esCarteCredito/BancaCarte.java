package it.nextre.academy.verifiche.correzione06_10.esCarteCredito;

import it.nextre.academy.basi.inizializzatori.B;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class BancaCarte {

    private static BancaCarte instance = null;
    private List<CarteCredito> carte;
    private static List<String> categorie;
    private static List<String> shops;

    public static List<String> getCategorie() {
        return categorie;
    }

    public static List<String> getShops() {
        return shops;
    }

    private BancaCarte() {
        carte = new ArrayList<>();
        categorie = new ArrayList<>();
        shops = new ArrayList<>();
    }

    public static synchronized BancaCarte getInstance() {
        if (instance == null) {
            instance = new BancaCarte();
        }
        return instance;
    }

    public void creaCarta(Utente u) {
        Calendar cal=Calendar.getInstance();
        Date oggi=cal.getTime();

        CarteCredito c = new CarteCredito(u.compilaCarta(), cal);
        if (!categorie.contains(c)) {
            addCarta(c);
        } else System.out.println("La carta esiste già.");
    }

    private void addCarta(CarteCredito c) {
        carte.add(c);
    }


}//end class
