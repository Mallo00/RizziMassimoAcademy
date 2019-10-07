package it.nextre.academy.designpattern;

import it.nextre.academy.myUtil.ListaI;

import java.util.Random;

public class Pallottoliere {
    //bisogna rendere privte il costruttore di singleton così da non rendere possibile aprire nuove istanze
    private static Pallottoliere instance = null;
    private ListaI db;
    private Random r=new Random();
    private Pallottoliere() {
        //nulla per ora
        db=new ListaI();
    }

    //sync previene l'accesso contemporaneo
    public synchronized static Pallottoliere getInstance() {
        //per accedere a una variabile di istaza da un contesto statico:
        if (instance == null) {
            instance = new Pallottoliere();
        }
        return instance;
    }

    public int estrai(){
        int num = (1+r.nextInt(90));
        if (!db.contains(num)){
            db.add(num);
            return num;
        }
        return estrai();
    }
    public void reset() {
        db.clear();
    }
}//end class
