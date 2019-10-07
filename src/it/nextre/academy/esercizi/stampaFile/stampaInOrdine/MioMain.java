package it.nextre.academy.esercizi.stampaFile.stampaInOrdine;

import java.io.File;

public class MioMain {
    public static void main(String[] args) {


        // Definisco la cartella da cui far iniziare la scansione
        String path = "C:\\Users\\utente\\Google Drive";
        // Creo l'oggetto del file
        File cartella = new File(path);
        //se il file creato rappresenta una cartella posson iniziare la scansione
        if (cartella.exists() && cartella.isDirectory()) {
            // creo un'array di file contenente tutto cio che è presente sotto la cartella di file
            File files[] = cartella.listFiles();

            System.out.println("Lista ordinata di file e cartelle a partire da: " + cartella);
            //inizio la ricorsione
            //params: lista di file, indice di file nella dir corrente, livello d'indentazione a seconda della "profondita"
            Walker.stampaRicorsiva(files,0,0);

        }
    }
}//end class
