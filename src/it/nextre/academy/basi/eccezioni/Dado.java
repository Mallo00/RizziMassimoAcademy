package it.nextre.academy.basi.eccezioni;

import java.util.Random;

public class Dado {
    private int valore = 0;
    private int min, max;
    Random r;

    public Dado() {
        this.r = new Random();
        this.min = 1;
        this.max = 6;
    }

    public Dado(int min, int max) {
        this();
        if (max <= min || min >= max) {
            //||max<0) {
            throw new IllegalParamException("Numero di facce non valido");//potrebbe non accadere mai
        }
        this.min = min;
        this.max = max;
    }

    public int tira() throws InvalidTiroException {
        if (r.nextDouble() < 0.3) {
            throw new  InvalidTiroException();
        }
        return this.min + r.nextInt(max + 1 - min);
    }

    public boolean getFaccia() {
        return false;
    }
}//end class
