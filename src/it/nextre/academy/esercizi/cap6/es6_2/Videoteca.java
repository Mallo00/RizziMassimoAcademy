package it.nextre.academy.esercizi.cap6.es6_2;

import java.util.ArrayList;
import java.util.List;

public class Videoteca {
    private List<Prodotto> prodotti;
    private List<Cliente> clienti;
    private String name;

    Videoteca(String name) {
        this.name = name;
        prodotti = new ArrayList<>();
        clienti = new ArrayList<>();
    }
//rendere void
    public void rent(Noleggiabili n, Cliente c) {
        if (prodotti.contains(n)) {
            if (!((Prodotto) n).isRent()) {
                n.noleggia(c);
                c.addNoleggio((Prodotto) n);
                System.out.println("Noleggio effettuato!");
            } else {
                System.out.println("Il prodotto è già in noleggio presso un'altro cliente");
            }
        } else{
            System.out.println("Non possediamo il prodotto cercato!");
        }
    }

    public List<Prodotto> getProdotti() {
        return prodotti;
    }

    public List<Cliente> getClienti() {
        return clienti;
    }

    public void addCliente(Cliente c) {
        for (int i = 0; i < clienti.size(); i++) {
            if (clienti.get(i).getName().equals(c.getName())) {
                //System.err.println("Nome utente " + c.getName() + " già registrato");
                return;
            }
        }
        clienti.add(c);
        System.out.println("Cliente " + c.getName() + " registrato");
    }

    public void addProdotto(Prodotto p) {
        prodotti.add(p);
        //System.out.println("Prodotto " + p.getName() + " aggiunto");
    }

    @Override
    public String toString() {
        return "Videoteca{" +
                "prodotti=" + prodotti +
                ", clienti=" + clienti +
                ", name='" + name + '\'' +
                '}';
    }
}//end class
