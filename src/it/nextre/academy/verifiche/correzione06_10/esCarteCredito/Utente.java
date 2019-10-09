package it.nextre.academy.verifiche.correzione06_10.esCarteCredito;

import it.nextre.academy.myUtil.MyInput;

import java.util.List;

public class Utente {
    private String name;
    private List<CarteCredito> portafoglio;

    public Utente(String name, List<CarteCredito> portafoglio) {
        this.name = name;
        this.portafoglio = portafoglio;
    }

    public CarteCredito compilaCarta(){
        System.out.println("Inserisci la categoria della carta");
        String cat= MyInput.leggiRiga();
        System.out.println("inserisci lo shop dedicato");
        String shop=MyInput.leggiRiga();
        System.out.println("inserisci il numero di carta");
        int n=MyInput.leggiInteroPositivo();
        return new CarteCredito(n, shop, cat, this);
    }

    public void addCarta(CarteCredito c){
        if (!portafoglio.contains(c)){
            portafoglio.add(c);
        }else System.out.println("La carta è già nel portafoglio.");
    }



}//end class
