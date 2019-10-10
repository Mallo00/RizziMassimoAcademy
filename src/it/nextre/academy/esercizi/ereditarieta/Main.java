package it.nextre.academy.esercizi.ereditarieta;

import it.nextre.academy.esercizi.ereditarieta.ereditarieta.Figlio;
import it.nextre.academy.esercizi.ereditarieta.ereditarieta.Lavoratore;
import it.nextre.academy.esercizi.ereditarieta.ereditarieta.Nonno;
import it.nextre.academy.esercizi.ereditarieta.ereditarieta.Padre;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Padre pio = new Padre("Luciano", 50, "Operaio");
        Figlio f1 = new Figlio("Massimo", 19, "Programmatore", "Informatica");
        pio.saluta();
        f1.saluta();
        System.out.println(pio.toString());
        pio.lavora();
        System.out.println(f1.toString());
        f1.lavora();

        List<Lavoratore> lavoratori = new ArrayList<>();
        lavoratori.add(pio);
        lavoratori.add(f1);
        System.out.println(lavoratori);

        List<Nonno> nonni = new ArrayList<>();
        nonni.add(pio);
        nonni.add(f1);

        List<Figlio> figli = new ArrayList<>();
        //figli.add(pio);
        figli.add(f1);
        f1.cammina();
    }
}
