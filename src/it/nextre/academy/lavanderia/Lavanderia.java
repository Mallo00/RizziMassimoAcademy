package it.nextre.academy.lavanderia;

import it.nextre.academy.esercizi.randomData.DummyData;

import java.util.List;

public class Lavanderia {
    public void lava(List<Capo> capi){
        for (Capo tmp:capi) {
            if (!tmp.isPulito()){
                tmp.setPulito(true);
                tmp.setPrezzo(5);
            }
        }
    }
}//end class
