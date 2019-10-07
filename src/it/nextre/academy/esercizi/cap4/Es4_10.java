package it.nextre.academy.esercizi.cap4;

import it.nextre.academy.myUtil.MyInput;
import it.nextre.academy.myUtil.MyOutput;

public class Es4_10 {
    public static void main(String[] args) {
        System.out.println("Inserisci una parola e io l'invertirò");
        String s= MyInput.leggiRiga();
        s+= MyOutput.invertiStringa(s);
        System.out.println("Sososososo: "+s);
    }
}//end class