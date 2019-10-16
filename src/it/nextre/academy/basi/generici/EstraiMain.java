package it.nextre.academy.basi.generici;

import it.nextre.academy.esercizi.cap5.Auto;
import it.nextre.academy.myUtil.DummyData;
import it.nextre.academy.myUtil.GenericList;

import java.util.Random;

public class EstraiMain {

    public static void main(String[] args) {
        Random r = new Random();
        GenericList e = new GenericList();

        while (e.getLista().size() < 5) {
            e.addSingolo(DummyData.getCognome());
        }

        System.out.println("Lista completa: "+e.getLista());

        System.out.println("Ho rimosso: "+e.rimuoviCasuale());
        Auto a=new Auto("Utilitaria");
        while (e.getLista().size() < 5) {
            e.addSingolo(a=new Auto("Utilitaria"));
        }
        System.out.println(e.getLista());
        System.out.println(e.getLista().get(e.getLista().size()-1));
        /*
        System.out.println(e.addDoppione(4));
        System.out.println(e.addDoppione(5,0));
        System.out.println(e.getLista());
        System.out.println(e.addSingolo(3));
        System.out.println(e.addSingolo(3));
        System.out.println(e.addSingolo(5,0));
        System.out.println(e.getLista());
        System.out.println(e.removeIndex(1));
        System.out.println(e.getLista());
        System.out.println(e.removeObject(4));
        System.out.println(e.getLista());
        //rimuovo un elemento casuale==> per conoscerlo devo prima gettare l'elemento della posizione estratta
        e.elem=e.getLista().get(r.nextInt(e.getLista().size()));
        System.out.println(e.elem+"sasesisoci");
        System.out.println(e.removeObject(e.elem));
        System.out.println(e.getLista());
        e.addDoppione("sasso");

         */
    }
}//end class
