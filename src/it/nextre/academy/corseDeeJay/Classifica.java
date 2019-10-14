package it.nextre.academy.corseDeeJay;

import java.util.*;
import java.util.stream.Collectors;

public class Classifica implements Comparator {
    private Map<Integer, Corridore> classifica;
    private Set<Corridore> partecipanti;
    private static Classifica instance = null;
    private static final int N_GIRI=10;

    private Classifica() {
        this.classifica = new HashMap<>();
        partecipanti = new TreeSet<>();
    }

    public synchronized static Classifica getInstance() {
        if (instance == null) {
            instance = new Classifica();
        }
        return instance;
    }

    public void addCorridore(Corridore c) {
        partecipanti.add(c);
    }

    public void removeCorridore(Corridore c) {
        partecipanti.remove(c);
    }


    public Set<Corridore> getPartecipanti() {
        return partecipanti;
    }


    @Override
    public int compare(Object o1, Object o2) {
        return Double.compare(((Corridore) o1).getTempoTotaleDouble(), ((Corridore) o2).getTempoTotaleDouble());
    }

    public static int getnGiri() {
        return N_GIRI;
    }

    public void aggiornaClassifica() {
        Iterator<Corridore> it = partecipanti.iterator();
        Corridore current = null;
        int i=0;
        while(it.hasNext() ) {
            i++;
            classifica.put(i, it.next());
        }


    }
}//end class
