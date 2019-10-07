package it.nextre.academy.esercizi.cap8;

import it.nextre.academy.myUtil.eccezioni.DivisionePerZeroException;

public class Es8_2 {
    public static void main(String[] args) {
        int dividendo = 5;
        int divisore = 0;
        try {
            if (divisore==0) throw new DivisionePerZeroException();//posso scegliere se catturarla o meno con un catch.
            System.out.println(dividendo/divisore);
        }/*catch (DivisionePerZeroException e){
            System.err.println("Diviso per zero");
        }
        */
        catch (ArithmeticException e) {
            System.out.println("Esecuzione terminata");
        }
    }
}//end class
