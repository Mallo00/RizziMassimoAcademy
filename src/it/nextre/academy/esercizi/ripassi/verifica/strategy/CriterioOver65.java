package it.nextre.academy.esercizi.ripassi.verifica.strategy;

import it.nextre.academy.myUtil.dummyObj.Umano;
public class CriterioOver65 implements Filtrabile{
    @Override
    public boolean filtra(Umano umano) {
        return umano.getEta()>=65;
    }
}//end class
