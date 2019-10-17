package it.nextre.academy.esercizi.ripassi.verifica.strategy;

import it.nextre.academy.myUtil.dummyObj.Umano;
public class CriterioUnder18 implements Filtrabile{
    @Override
    public boolean filtra(Umano umano) {
        return umano.getEta()<18;
    }
}//end class
