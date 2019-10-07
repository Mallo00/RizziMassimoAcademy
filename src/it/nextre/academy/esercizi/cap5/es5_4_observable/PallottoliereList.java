package it.nextre.academy.esercizi.cap5.es5_4_observable;

import it.nextre.academy.myUtil.GenericList;

import java.util.Random;

public class PallottoliereList {
    //bisogna rendere privte il costruttore di singleton così da non rendere possibile aprire nuove istanze
    private static PallottoliereList instance = null;
    private GenericList<Integer> db;
    private Random r = new Random();

    private PallottoliereList() {
        //nulla per ora
        db = new GenericList<Integer>();
    }

    //sync previene l'accesso contemporaneo
    public synchronized static PallottoliereList getInstance() {
        //per accedere a una variabile di istaza da un contesto statico:
        if (instance == null) {
            instance = new PallottoliereList();
        }
        return instance;
    }

    public void caricaList(int dim) {
        for (int j = 0; j < dim; j++) {
            db.addSingolo((j + 1));
        }
    }

    public GenericList<Integer> getDb() {
        return db;
    }

    /**
     * @return l'elemento random estratto dalla lista
     */
    public int estrai() {
        int num = (1 + r.nextInt(90));
        if (db.removeObject(num)) {
            return num;
        }
        return estrai();

    }

    public void reset() {
        db.getLista().clear();
    }
}//end class
