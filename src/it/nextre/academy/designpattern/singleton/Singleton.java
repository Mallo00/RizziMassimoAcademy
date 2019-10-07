package it.nextre.academy.designpattern.singleton;

public class Singleton {
    //bisogna rendere privte il costruttore di singleton così da non rendere possibile aprire nuove istanze
    private static Singleton instance = null;

    private Singleton() {
        //nulla per ora
    }

    //sync previene l'accesso contemporaneo
    public synchronized static Singleton getInstance() {
        //per accedere a una variabile di istaza da un contesto statico:
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

}//end class
