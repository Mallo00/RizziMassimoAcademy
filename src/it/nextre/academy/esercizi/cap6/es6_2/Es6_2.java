package it.nextre.academy.esercizi.cap6.es6_2;

import it.nextre.academy.myUtil.DummyData;

import java.util.Random;

public class Es6_2 {
    public static void main(String[] args) {
        Random r = new Random();
        Videoteca v = new Videoteca("Sassolino SRL");
        System.out.println(v.toString());

        for (int i = 0; i < 10; i++) {
            v.addCliente(new Cliente(DummyData.getNome()));
        }
        for (int i = 0; i < 100; i++) {
            v.addProdotto(new CD(DummyData.getNome(), i));
        }
        for (int i = 0; i < v.getClienti().size(); i++) {
            v.rent((Noleggiabili) (v.getProdotti().get(r.nextInt(v.getProdotti().size()))), v.getClienti().get(i));
        }

    }
}//end class