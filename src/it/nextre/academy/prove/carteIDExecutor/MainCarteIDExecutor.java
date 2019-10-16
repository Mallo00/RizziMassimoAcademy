/**
 * Gestire le richieste di carte d'identità di n persone
 * le persone possono compilare contemporaneamente lo stesso modulo
 * Al termine della propria compilazione, si procede in ordine di terminazione per la stampa
 */
package it.nextre.academy.prove.carteIDExecutor;


import it.nextre.academy.myUtil.DummyData;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainCarteIDExecutor {
    public static void main(String args[]) {
        Persona[] richiedenti = new Persona[1000];
        List<Persona> ps=new ArrayList<>();
        ExecutorService executor = Executors.newFixedThreadPool(richiedenti.length);
        for (int i = 0; i < richiedenti.length; i++) {
            richiedenti[i]=new Persona(DummyData.getNome());
            //executor.execute(richiedenti[i]);
            ps.add(new Persona(DummyData.getNome()));
        }
        //executor.invokeAll(ps);
        executor.shutdown();

    }

}//end class




