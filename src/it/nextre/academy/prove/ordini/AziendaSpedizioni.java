package it.nextre.academy.prove.ordini;

import it.nextre.academy.myUtil.DummyData;
import it.nextre.academy.prove.ordini.utente.Utente;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AziendaSpedizioni {
    private List<Utente> utenti;
    private Set<Prodotto> catalogo;
    private static AziendaSpedizioni instance;

    private AziendaSpedizioni() {
        catalogo = new HashSet<>();
        utenti = new ArrayList<>();
    }

    public static AziendaSpedizioni getInstance() {
        if (instance == null) {
            instance = new AziendaSpedizioni();
        }
        return instance;
    }

    public Set<Prodotto> getCatalogo() {
        return catalogo;
    }

    public void stampaCatalogo() {
        catalogo.forEach(System.out::println);
    }

    public void creaUtenti(int nClienti) {
        for (int i = 0; i < nClienti; i++) {
            utenti.add(new Utente(DummyData.getNome(), DummyData.getCognome(), DummyData.getCitta()));
        }
    }

    public void creaProdotti(int nProdotti) {
        while (catalogo.size() < nProdotti) {
            catalogo.add(new Prodotto("", DummyData.getRandomDouble(5, 100)));
        }
    }

    public List<Utente> getUtenti() {
        return utenti;
    }

    public void acquisto(Utente u) {
        u.run();
    }
}//end class
