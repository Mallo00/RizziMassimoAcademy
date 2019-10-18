package it.nextre.academy.myUtil.dummyObj;

import it.nextre.academy.esercizi.cap15.Alloggio;
import it.nextre.academy.esercizi.cap15.Location;
import it.nextre.academy.esercizi.cap15.TipoStruttura;
import it.nextre.academy.myUtil.DummyData;

import java.util.Random;

public class DummyAlloggio {
    private final static Random r = new Random();

    public static Alloggio getAlloggioRandom() {
        return new Alloggio(DummyData.getNome(), (short) (r.nextInt(5) + 1), Location.values()[r.nextInt(Location.values().length)], DummyData.getRandomDouble(30, 200), TipoStruttura.values()[r.nextInt(TipoStruttura.values().length)], r.nextBoolean(), r.nextBoolean(), DummyData.getRandomDouble(10, 1000));
    }
}//end class
