package it.nextre.academy.myUtil;

import it.nextre.academy.esercizi.randomData.DummyData;
import it.nextre.academy.myUtil.Printable;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GenericList<T> implements Printable {
    private List<T> lista;
    Random r = new Random();

    public GenericList() {
        lista = new ArrayList<T>();
    }

    public T rimuoviCasuale() {
        try {
            return lista.remove(r.nextInt(lista.size()));
        } catch (IllegalArgumentException e) {
            System.out.println(ANSI_GREEN_BACKGROUND+"La lista è vuota"+ANSI_GREEN_BACKGROUND);
            return null;
        }
        //return null;//posso lanciare un'eccezione
    }


    public boolean addSingolo(T o) {
        if (!lista.contains(o)) {
            lista.add((T) o);
            return true;
        }
        return false;
    }

    public boolean AddSingolo(T o, int i) {
        if (!lista.contains(o)) {
            lista.add(i, o);
            return true;
        } else {
            return false;
        }
    }



    public boolean addDoppione(T o) {
        lista.add((T) o);
        return true;
    }

    public boolean addSingolo(T o, int i) {
        if (!lista.contains(o)) {
            lista.add(i, (T) o);
            return true;
        }
        return false;
    }

    public boolean addDoppione(T o, int i) {
        lista.add(i, (T) o);
        return true;
    }

    public T removeIndex(int i) {

        return lista.remove(i);

    }

    public boolean removeObject(T o) {
        return lista.remove(o);
    }

    @Override
    public String toString() {
        return ANSI_CYAN_BACKGROUND+"GenericList{" +
                "lista=" + lista +
                '}'+ANSI_CYAN_BACKGROUND;
    }

    public List<T> getLista() {
        return lista;
    }

}//end class
