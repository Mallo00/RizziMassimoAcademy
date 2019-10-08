package it.nextre.academy.prove.carteID;

import java.util.Random;

public class SportelloCarte {
    private static SportelloCarte instance = null;
    private Stampante s = null;
    Random r;

    private SportelloCarte() {
        //unica stampante disponibile
        s=s.getInstance();
        r=new Random();
    }

    public static synchronized SportelloCarte getInstance() {
        if (instance == null) {
            instance = new SportelloCarte();
        }
        return instance;
    }

    public synchronized void gestisciRichiesta(Persona p) {
        System.out.println("Buongiorno " + p.getNome());
        //inizio la compilazione sincronizzata del dato cliente
        compilaModulo(p);
        //al termine della sua compilazione, ne eseguo la stampa
        s.stampa(p);
    }

    private synchronized void compilaModulo(Persona p) {
        //estraggo il tempo necessario per il cliente per compilare il modulo
        final int aspetta = r.nextInt(10)+1;
        try {
            System.out.println(p.getNome()+": Inizio a compilare... mi servono " + aspetta + " secondi...");
            wait(aspetta * 1000);
        } catch (InterruptedException ex) {
            //ex.printStackTrace();
        }
        System.out.println(p.getNome()+" ho finito di compilare!");
    }

}//end class
