package it.nextre.academy.supermercato;

import it.nextre.academy.myUtil.ListaS;

import java.util.Random;

public class BarCodeGenerator {
    private ListaS codes;
    private Random r;
    static private BarCodeGenerator instance = null;

    private BarCodeGenerator() {
        codes = new ListaS();
        r=new Random();
    }

    public static BarCodeGenerator getInstance() {
        if (instance == null)
            instance = new BarCodeGenerator();
        return instance;
    }

    public String newCode(){
        String tmp="";
        int lunghezza=r.nextBoolean()?13:21;
        //nb: su numeri piccoli si avrà una duratadi esecuzione maggiore
        do{
            for (int i = 0; i < lunghezza; i++) {
                tmp+=r.nextInt(10);
            }
        }while (codes.contains(tmp));
        codes.add(tmp);
        return tmp;
    }

}//end class
