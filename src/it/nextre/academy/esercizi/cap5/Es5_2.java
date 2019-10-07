package it.nextre.academy.esercizi.cap5;

import it.nextre.academy.myUtil.Criptaggio;
import it.nextre.academy.myUtil.MyInput;

public class Es5_2 {
    public static void main(String[] args) {

        primaVers();
        mappeVers();

    }

    private static void mappeVers() {
        System.out.println("inserire la frase da criptare");
        String frase= MyInput.leggiRiga().trim();
        System.out.println("inserire la chiave");

    }

    private static void primaVers() {
        System.out.println("inserire la frase da criptare");
        String frase= MyInput.leggiRiga().trim();
        System.out.println("inserire la chiave");
        int ch=MyInput.leggiInteroPositivo();
        frase= Criptaggio.criptaCesareVero(frase, ch);
        System.out.println(frase);
        System.out.println(Criptaggio.decriptaCesare(frase,ch));
    }

}//end class
