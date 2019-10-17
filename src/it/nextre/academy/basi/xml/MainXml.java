package it.nextre.academy.basi.xml;
//  todo completare esportazione in xml di PersonaDaEsportare


import it.nextre.academy.myUtil.DummyData;
import it.nextre.academy.myUtil.dummyObj.Lavoro;

import java.util.ArrayList;
import java.util.List;

public class MainXml {
    public static void main(String[] args) {
        creaPersone();

    }

    private static void creaPersone() {
        List<PersonaDaEsportare> persone=new ArrayList<>();
        while (persone.size()<10){
            persone.add(new PersonaDaEsportare(DummyData.getNome(), DummyData.getCognome(), Lavoro.ATTORE));
        }
    }
}//end class
