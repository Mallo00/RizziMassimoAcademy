package it.nextre.academy.basi.generici;

import it.nextre.academy.basi.inizializzatori.A;

import java.lang.reflect.Array;
import java.util.ArrayList;

//lista che mantiene gli ultimi n elementi
public class Undo<E> {
    private E[] mem;

    public Undo() {
        this(3);
    }

    public Undo(Integer size) {
        //creare rray di generici
        mem = (E[]) new Object[size];
    }

    public void add(E elem) {
        //debug();
        //caso base
        if (mem[0] == null) {
            mem[0] = elem;
            return;
        }
        //altrimenti cerco la prima posizione nulla e la inverto con il precedente
        for (int i = 0; i < mem.length; i++) {
            if (mem[i] == null) {
                mem[i] = mem[i - 1];
                mem[i - 1] = null;
                break;
                //if (i==1)
            }
            if (i == mem.length - 1 && mem[mem.length - 1] != null)
                mem[mem.length - 1] = null;
        }//end for
        add(elem);
    }

    public E getItem(int i) {
        return mem[i];
    }


}//end class
