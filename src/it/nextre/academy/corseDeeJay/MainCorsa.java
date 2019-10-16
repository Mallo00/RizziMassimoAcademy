package it.nextre.academy.corseDeeJay;

import it.nextre.academy.myUtil.DummyData;

import java.util.Random;

//  creare n partecipanti che devono correre su un circuito di 1km per 10 volte.
//  misurare i tempi e fare la classifica
//  si aggiorna la classifica a ogni ciclo
//  usa comparator per confrontare i corridori
public class MainCorsa {
    public static final int N_CORRIDORI=10;
    public static void main(String[] args) {
        Random r=new Random();
        Classifica c=Classifica.getInstance();
        while (c.getPartecipanti().size()<N_CORRIDORI) {
            c.addCorridore(new Corridore(DummyData.getNome()));
        }
        c.getPartecipanti().stream()
                .forEach(System.out::println);
        run(c);
    }

    private static void run(Classifica c) {
        for (int i = 0; i < Classifica.getnGiri(); i++) {
            c.getPartecipanti().stream()
                    .forEach(Corridore::corriGiro);
            c.aggiornaClassifica();
        }

    }
}//end class
