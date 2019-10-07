package it.nextre.academy.supermercato;

public class Cellulare extends Prodotto {
    private double displayInches;
    private int ramAmount;
    private double storage;
    private String os;
    private String modello;

    Cellulare(String nome, String barCode, double displayInches, int ramAmount, double storage, String os, String modello, String barcode, double prezzo, double peso) {
        super(nome, barCode, prezzo, peso);
        this.displayInches = displayInches;
        this.ramAmount = ramAmount;
        this.storage = storage;
        this.os = os;
        this.modello = modello;
    }

    @Override
    public String toString() {
        return "";
    }
}//end class
