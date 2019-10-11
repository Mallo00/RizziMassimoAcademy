package it.nextre.academy.prove.ordini.utente;


import it.nextre.academy.esercizi.randomData.DummyData;
import it.nextre.academy.myUtil.Alphabet;
import it.nextre.academy.myUtil.MyInput;
import it.nextre.academy.myUtil.MyOutput;
import it.nextre.academy.prove.ordini.AziendaSpedizioni;
import it.nextre.academy.prove.ordini.Prodotto;
import it.nextre.academy.verifiche.correzione06_10.esCarteCredito.CarteCredito;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;


public class Utente {

    private String nome;
    private String cognome;
    private List<CartaCredito> portafoglio;
    private String indirizzo;
    private List<Ordine> ordini;
    private List<Prodotto> carrello;
    private List<Ordine> dbOrdini;

    public Utente(String nome, String cognome, String indirizzo) {
        this.nome = nome;
        this.cognome = cognome;
        portafoglio = new ArrayList<>();
        this.indirizzo = indirizzo;
        //contiene l'id chiave dell'ordine e l'ordine di riferimento
        ordini = new ArrayList<>();
        carrello = new ArrayList<>();
        dbOrdini = new ArrayList<>();
    }

    public void run() {
        int scelta = -1;
        Menu:
        while (scelta != 0) {
            scelta = -1;
            while (scelta < 0 || scelta > 6) {
                System.out.println("Cosa vuoi fare?");
                System.out.println("1) Aggiungi prodotto al carrello");
                System.out.println("2) Rimuovi prodotto dal carrello");
                System.out.println("3) Aggiungi metodo di pagamento");
                System.out.println("4) Effettua ordine");
                System.out.println("5) Vedi storico transazioni");
                System.out.println("6) Vedi portafoglio");
                System.out.println("0) Chiudi programma");
                scelta = MyInput.leggiInteroPositivo();
                if (scelta < 0 || scelta > 6) {
                    System.out.println("Input non valido");
                }
            }
            switch (scelta) {
                case 1:
                    aggiunta();
                    break;
                case 2:
                    rimozione();
                    break;
                case 3:
                    addPaymentMethod();
                    break;
                case 4:
                    effettuaOrdine();
                    break;

                case 5:
                    printTransazioni();
                    break;
                case 6:
                    visualizzaPortafoglio();
                    break;

                case 0:
                    System.out.println("Arrivederci!");
                    break Menu;
            }
        }

    }

    private void printTransazioni() {
        dbOrdini.forEach(System.out::println);
    }


    private void visualizzaPortafoglio() {
        portafoglio.forEach(System.out::println);
    }

    private void rimozione() {
        if (!carrello.isEmpty()) {
            boolean rimuoviDalCarrello;
            do {
                System.out.println("Rimuovi un prodotto dal carrello?");
                rimuoviDalCarrello = MyInput.carattSiONo() == 's';
                if (rimuoviDalCarrello) rimuoviDalCarrello();
            } while (rimuoviDalCarrello && !carrello.isEmpty());
        }
        if (!carrello.isEmpty()) effettuaOrdine();
        else System.out.println("Carrello vuoto, arrivederci!");
    }

    private void aggiunta() {
        boolean aggiungiALCartello = false;
        System.out.println("Ciao " + nome + ", vuoi aggiungere un articolo al tuo carrello?");
        aggiungiALCartello = MyInput.carattSiONo() == 's';
        while (aggiungiALCartello) {
            aggiungiALCartello();
            System.out.println("Continui con gli acquisti?");
            aggiungiALCartello = MyInput.carattSiONo() == 's';
        }
    }


    public String getNome() {
        return nome;
    }

    public void operazioniCarrello() {
        boolean aggiungiALCartello = false;
        System.out.println("Ciao " + nome + ", vuoi aggiungere un articolo al tuo carrello?");
        aggiungiALCartello = MyInput.carattSiONo() == 's';
        while (aggiungiALCartello) {
            aggiungiALCartello();
            System.out.println("Continui con gli acquisti?");
            aggiungiALCartello = MyInput.carattSiONo() == 's';
        }
        if (!carrello.isEmpty()) {
            boolean rimuoviDalCarrello;
            do {
                System.out.println("Rimuovi un prodotto dal carrello?");
                rimuoviDalCarrello = MyInput.carattSiONo() == 's';
                if (rimuoviDalCarrello) rimuoviDalCarrello();
            } while (rimuoviDalCarrello && !carrello.isEmpty());
        }
        if (!carrello.isEmpty()) effettuaOrdine();
        else System.out.println("Carrello vuoto, arrivederci!");

    }// fine operazioniCarrello

    private void rimuoviDalCarrello() {
        int prodottoDaRimuovere = 0;
        while (prodottoDaRimuovere < 1 || prodottoDaRimuovere > carrello.size()) {
            for (int i = 0; i < carrello.size(); i++) {
                System.out.println(i + 1 + ") " + carrello.get(i));
            }
            System.out.println("Quale prodotto vuoi rimuovere?");
            prodottoDaRimuovere = MyInput.leggiInteroPositivo();
            if (prodottoDaRimuovere < 1 || prodottoDaRimuovere > carrello.size()) {
                System.out.println("Input non valido.");
            }
        }
        carrello.remove(prodottoDaRimuovere - 1);
        System.out.println("Prodotto rimosso correttamente.");
    }

    private void aggiungiALCartello() {
        System.out.println("Cosa vuoi acquistare?");
        String ordine = MyInput.leggiRiga();
        boolean presente = AziendaSpedizioni.getInstance()
                .getCatalogo()
                .stream()
                .map(Prodotto::getNomeP)
                .anyMatch(n -> n.contains(ordine));

        if (presente) {
            Prodotto scelto = AziendaSpedizioni.getInstance()
                    .getCatalogo()
                    .stream()
                    .filter(p -> p.getNomeP().equals(ordine))
                    .findFirst()
                    .get();
            carrello.add(scelto);
        } else {
            System.out.println("il prodotto desiderato non è in catalogo");
        }
        System.out.println("Il carrello è: " + carrello.toString());
    }


    public void effettuaOrdine() {
        System.out.println("Carrello: ");
        carrello.forEach(System.out::println);
        double tot = carrello
                .stream()
                .mapToDouble(Prodotto::getCosto)
                .sum();
        System.out.println("Vuoi procedere al pagamento?");
        boolean pagato = false;
        if (MyInput.carattSiONo() == 's') {
            pagato = pagamento(tot);
        }

        if (pagato) {
            System.out.println("Pagamento andato a buon fine!");
            stampaOrdine();
        } else {
            System.out.println("Pagamento in sospeso.");
        }
    }//fine effettuaordine

    private void stampaOrdine() {
        System.out.println(ordini.get(ordini.size() - 1).toString());
    }

    private boolean pagamento(double tot) {
        System.out.println("Costo totale: " + MyOutput.formattaDouble(tot));
        if (portafoglio.isEmpty()) {
            System.out.println("Inserire metodo di pagamento");
            addPaymentMethod();
        }
        int cartascelta = 0;
        boolean riprova = false;
        boolean paga = false;
        do {
            while (cartascelta < 1 || cartascelta > portafoglio.size()) {
                System.out.println("Seleziona il metodo di pagamento: ");
                for (int i = 0; i < portafoglio.size(); i++) {
                    System.out.println(i + 1 + ") " + portafoglio.get(i).getNumCarta());
                }
                cartascelta = MyInput.leggiInteroPositivo();
                if (cartascelta < 1 || cartascelta > portafoglio.size()) {
                    System.out.println("Input non valido, riprova");
                }
            }
            boolean addcarta = false;
            if (portafoglio.get(cartascelta - 1).getCredito() < tot) {
                System.out.println("Credito insufficiente sulla carta selezionata");
                System.out.println("Vuoi scegliere/aggiungere un'altra carta?");
                riprova = MyInput.carattSiONo() == 's';
                if (riprova) {
                    System.out.println("Vuoi aggiungere un'altra carta?");
                    addcarta = MyInput.carattSiONo() == 's';
                }
            } else {
                paga = true;
            }
            if (addcarta) {
                System.out.println("Inserire metodo di pagamento");
                addPaymentMethod();
            }
        } while (riprova);

        if (paga) {
            portafoglio.get(cartascelta - 1).paga(tot);
            ordini.add(new Ordine(carrello, this));
            return true;
        } else {
            System.out.println("Arrivederci!");
            return false;
        }
    }

    private void addPaymentMethod() {
        String numCarta = "";
        boolean valida = false;
        do {
            valida = true;
            System.out.println("Inserisci il numero della tua carta di credito");
            numCarta = MyInput.leggiRiga();
            if (numCarta.length() != 16) {
                System.out.println("Carta non valida");
                valida = false;
            } else {
                for (int i = 0; i < numCarta.length(); i++) {
                    if (!Alphabet.numbers().contains("" + numCarta.charAt(i))) {
                        System.out.println("Input in carta non valido: " + numCarta.charAt(i));
                        valida = false;
                    }
                }
            }
        } while (!valida);
        portafoglio.add(new CartaCredito(numCarta, 500));
        System.out.println("Carta aggiunta correttamente");
    }

    private class Ordine {

        private AtomicInteger idOrdine = new AtomicInteger(1);
        private LocalDate date;
        private Utente intestatario;
        private List<Prodotto> carrello;

        {
            idOrdine.getAndIncrement();
        }

        @Override
        public String toString() {
            return "Ordine{" +
                    "idOrdine='" + idOrdine + '\'' +
                    ", date=" + date +
                    ", intestatario=" + intestatario +
                    ", carrello=" + carrello +
                    '}';
        }

        Ordine(List<Prodotto> carrello, Utente intestatario) {
            this.carrello = carrello;
            date = LocalDate.now();
            this.intestatario = intestatario;
            dbOrdini.add(this);
        }

    }//end class

    class CartaCredito {
        private String numCarta;
        private double credito;

        @Override
        public String toString() {
            return "CartaCredito{" +
                    "numCarta='" + numCarta + '\'' +
                    ", credito=" + MyOutput.formattaDouble(credito) +
                    '}';
        }

        public double getCredito() {
            return credito;
        }

        public CartaCredito(String numCarta, double credito) {
            this.numCarta = numCarta;
            this.credito = credito;
        }

        public void paga(double tot) {
            this.credito -= tot;
        }

        public String getNumCarta() {
            return numCarta;
        }
    }//end carta

}//end class


