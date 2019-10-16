package it.nextre.academy.esercizi.cap6.es6_1;

import it.nextre.academy.myUtil.DummyData;
import it.nextre.academy.myUtil.MyInput;

public class Es6_1 {
    public static void main(String[] args) {
        System.out.println("Inserisci il nome della band");
        Band band = new Band(MyInput.leggiRiga().trim());
        System.out.print("Specifica il genere della band: ");
        band.setGenere(MyInput.leggiRiga());
        while (MyInput.carattSiONo() == 's') {
            band.addMembro(new Musicista(DummyData.getNome()));
            System.out.println(band.toString());
        }
        System.out.println("Inserisci il ruolo da assegnare ad ogni cantante");
        for (int i = 0; i < band.getMembri().size(); i++) {
            System.out.println(band.getMembri().get(i).toString());
            band.getMembri().get(i).setRuolo(MyInput.leggiRiga());
        }
    }
}//end class
