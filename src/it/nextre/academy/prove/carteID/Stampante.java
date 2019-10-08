package it.nextre.academy.prove.carteID;

public class Stampante {
    private static Stampante instance;
    private Stampante() {
    }
    public static Stampante getInstance() {
        if (instance == null) {
            instance = new Stampante();
        }
        return instance;
    }
    public synchronized void stampa(Persona p) {
        System.out.println("Stampa carta d'identità di " + p.getNome()
                + " in corso...");
        try {
            wait(3000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        System.out.println("Stampa completata! " + p.getNome()
                + " grazie e arrivederci!");
    }
}
