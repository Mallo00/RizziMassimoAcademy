package it.nextre.academy.esercizi.cap5.Es5_6;

import it.nextre.academy.myUtil.DummyData;

public class Figlio extends Padre {
    protected Figlio(int eta) {
        super(eta, DummyData.getNome());
    }
}//end class
