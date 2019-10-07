package it.nextre.academy.esercizi.stampaFile.stampaTuttoFixed;

import java.io.File;

public class Walker {


    static void stampaRicorsiva(File[] files, int indice, int profondita) {

        // finisco la ricorsione quando sono arrivato alla fine della lista di file
        if (indice == files.length/*||files[indice]==null*/)
            return;

        // indentazione
        for (int i = 0; i < profondita; i++)
            System.out.print("\t");

        // stampo i file a questo livello
        if (files[indice].isFile())
            System.out.println(files[indice].getName());

            // altrimenti stampo la cartella su questo livello
        else {
            if (files[indice].isDirectory()) {

                System.out.println("[" + files[indice].getName() + "]");
                // ricosione per le sottocartelle
                // incremento la profondità perché siamo di un livello inferiore
                try {
                    stampaRicorsiva(files[indice].listFiles(), 0, profondita + 1);
                } catch (NullPointerException e) {

                }
            }
        }

        // ricorsione per la cartella principale
        stampaRicorsiva(files, ++indice, profondita);
    }


}