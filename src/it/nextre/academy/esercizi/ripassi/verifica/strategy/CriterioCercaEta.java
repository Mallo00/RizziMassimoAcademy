package it.nextre.academy.esercizi.ripassi.verifica.strategy;

import it.nextre.academy.myUtil.dummyObj.Umano;
public class CriterioCercaEta implements Filtrabile {


    private int soglia;

    public CriterioCercaEta( int soglia) {
        this.soglia = soglia;
    }

    @Override
    public boolean filtra(Umano umano) {
        return umano.getEta()==soglia;
    }
}//end class
