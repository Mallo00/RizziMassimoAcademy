package it.nextre.academy.esercizi.stampaFile.stampaInOrdine;


import java.io.File;

public class Walker {

    static void stampaRicorsiva(File[] files, int i, int tab) {
        if (i == files.length)
            return;

        //System.out.print("\t".repeat(tab));
        // stampo le cartelle a questo livello non nascoste
        if (files[i].isDirectory() && !files[i].getName().startsWith(".")) {

            System.out.println("[" + files[i].getName() + "]");
            stampaRicorsiva(files[i].listFiles(), 0, ++tab);

            // ricosione per le sottocartelle
            // incremento la profondità perché siamo di un livello inferiore
            // try {
            //     stampaRicorsiva(files[indice].listFiles(), 0, ++tab);
            // } catch (NullPointerException e) {
//
            // }
        }
        // ricorsione per la cartella principale
        // stampaRicorsiva(files, ++indice, tab);

        stampaRicorsiva(files, ++i, ++tab);
    }//fine stampa


}