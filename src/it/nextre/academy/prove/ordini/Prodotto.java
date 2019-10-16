package it.nextre.academy.prove.ordini;

import it.nextre.academy.myUtil.MyFormatter;
import it.nextre.academy.myUtil.MyOutput;

public class Prodotto {
    private String nomeP;
    private double costo;

    public Prodotto(String nomeP, double costo) {
        this.nomeP = nomeP;
        this.costo = costo;
    }

    @Override
    public String toString() {
        return "Prodotto{" +
                "nomeP='" + nomeP + '\'' +
                ", costo=" + MyFormatter.formattaDouble(costo) +
                '}';
    }

    public String getNomeP() {
        return nomeP;
    }

    public double getCosto() {
        return costo;
    }
}//end class
