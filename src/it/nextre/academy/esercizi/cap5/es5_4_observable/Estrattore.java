package it.nextre.academy.esercizi.cap5.es5_4_observable;


import java.util.ArrayList;
import java.util.List;

public class Estrattore implements Osservato {
    private List<Giocatori> giocatori;
    private List<Integer> estratti;
    private PallottoliereList p;

    public Estrattore() {
        giocatori = new ArrayList<>();
        estratti = new ArrayList<>();
        p=PallottoliereList.getInstance();
    }

    @Override
    public void registraGiocatore(Giocatori g) {
        giocatori.add(g);
    }

    @Override
    public void rimuoviGiocatore(Giocatori g) {
        if (giocatori.indexOf(g) > 0)
            giocatori.remove(g);
    }

    @Override
    public void aggiornaGiocatori() {
        System.out.println("Ho estratto il numero: "+estratti.get(estratti.size()-1));
        for (Giocatori g : giocatori) {
            g.update(estratti.get(estratti.size() - 1));
        }
    }

    public void comunicaEstrazione() {
        aggiornaGiocatori();
    }

    public List<Integer> getEstratti() {
        return estratti;
    }

    public void estrai(){
        estratti.add(p.estrai());
        comunicaEstrazione();
    }

    public List<Giocatori> getGiocatori() {
        return giocatori;
    }

}//end class
