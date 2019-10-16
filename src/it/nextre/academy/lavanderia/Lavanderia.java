package it.nextre.academy.lavanderia;

import it.nextre.academy.myUtil.DummyData;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Random;

public class Lavanderia {
    Random r=new Random();
    public void lava(List<Capo> capi){
        for (Capo tmp:capi) {
            if (r.nextInt(4)==0) continue;//ho il 25% di saltare il lavaggio del capo
            if (!tmp.isPulito()){
                tmp.setPulito(true);
                tmp.setPrezzo(DummyData.getRandomDouble(3,5));
                tmp.setDataLavaggio(LocalDateTime.now());
            }
        }
    }

    public double getSommaPrezzi(Cliente c){
        return c.getCapiLavatiPerPrezzo().stream()
                .mapToDouble(Capo::getPrezzo)//prendo l'oggetto e ne strapolo un valore
                .reduce(0, Double::sum);//identity (punto di partenza) e membro che sarà tornato, accumulator (operazione da effettuare)
        //      .sum() uguale alla reduce ma più semplice
        //      .reduce(0, (a(elemento da tornare),b(elemento in ingresso))->a+1)
        //      .count() uguale a sopra ma più semplice
    }


}//end class
