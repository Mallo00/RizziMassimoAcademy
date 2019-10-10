package it.nextre.academy.basi.stream.dado;

import java.util.Random;
import java.util.function.IntSupplier;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public class Dado {
    private int valore = 0;
    private int min, max;
    private int faccia;
    Random r;

    public Dado() {
        this.r = new Random();
        this.min = 1;
        this.max = 6;
    }

    public Dado(boolean tirato)  {
        this.r = new Random();
        this.min = 1;
        this.max = 6;
        if (tirato)faccia=r.nextInt(max-min+1)+min;
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

    public int tira()  {
        return this.min + r.nextInt(max + 1 - min);
    }

    public IntStream getTiriStream()  {
        //come parametro ho un supplier, una funzione lambda che mi restituisce interi
        return IntStream.generate(() -> r.nextInt(max-min+1)+min);
    }
    public Supplier<Integer> getTiriSupplier()  {
        //come parametro ho un supplier, una funzione lambda che mi restituisce interi
        /*
        uguale allo stream ma crea dadi nuovi e prendo la faccia*/
        Supplier<Integer> s=()->r.nextInt(max-min+1)+min;
        return s;
    }

    public int getFaccia() {
        return faccia;
    }



}//end class
