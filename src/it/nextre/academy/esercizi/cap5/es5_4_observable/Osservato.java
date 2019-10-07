package it.nextre.academy.esercizi.cap5.es5_4_observable;

import java.util.ArrayList;
import java.util.List;

public interface Osservato {
    List<Giocatori> giocatori = new ArrayList<>();
    public void registraGiocatore(Giocatori g);
    public void rimuoviGiocatore(Giocatori g);
    public void aggiornaGiocatori();
}//end class
