/**
 * Gestire le richieste di carte d'identità di n persone
 * le persone possono compilare contemporaneamente lo stesso modulo
 * Al termine della propria compilazione, si procede in ordine di terminazione per la stampa
 */
package it.nextre.academy.prove.carteID;


import it.nextre.academy.myUtil.DummyData;

public class MainCarteID {
    public static void main(String args[]) {
        Persona[] richiedenti = new Persona[10];
        for (int i = 0; i < richiedenti.length; i++) {
            richiedenti[i]=new Persona(DummyData.getNome());
            richiedenti[i].start();
        }
    }

}//end class




