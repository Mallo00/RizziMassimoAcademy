package it.nextre.academy.esercizi.random;
/**
 *  implementare conteggio delle vite nel metodo giocata @see giocata(int[][] matr)
 */

import it.nextre.academy.myUtil.MyInput;

import java.util.Random;


public class PratoFiorito {
    public static void main(String[] args) {

        /**
         *  da implementare con interfaccia grafica per scelta boolean
         */
        char scelta = '\0';
        int diff = 0;
        //args cheat vinci
        System.out.println("Ciao, vuoi giocare?");
        scelta = MyInput.carattSiONo();
        if (scelta=='s'){
            do{
                int nVite = 3;
                //gioco
                //selezioniamo la difficoltà a cui impostare il gioco
                diff = scegliDifficolta();
                int matr[][] = new int[diff][diff];
                int numPremi = scegliNumPremi(diff);
                inserisciPremio(matr, numPremi);
                /**
                 * metodo che mi permette di vedere le coordinate dei premi
                 *  implementare cheatcode
                 */
                if (args.length>0&&args[0].equals("cheat")){
                    cheat(matr);
                    stampaMatrice(matr);
                }
                System.out.println("OPEN THE GAME MR. JOESTAR!");
                giocata(matr, nVite);
                System.out.println("Ciao, vuoi giocare ancora? ");
                scelta = MyInput.carattSiONo();
            }while (scelta != 'n');
            System.out.println("Arrivederci!");
        }
        else{
            System.out.println("Arrivederci!");
        }
    }//end main

    private static void giocata(int[][] matr, int nVite) {
        boolean haiVinto = false;
        while (!haiVinto && nVite > 0) {
            int x = -1;
            int y = -1;
            System.out.println("Indovina le coordinate: ");
            /**
             *  ottimizzare con do while
             */
            do {
                System.out.print("Inserisci la x in un range da 0 a: " + matr.length);
                x = MyInput.leggiInteroPositivo();
                if (x > matr.length) {
                    System.out.println("Hai inserito un input non valido. Riprova.");
                }
            }while (x > matr.length);
            do {
                System.out.print("Inserisci la y in un range da 0 a: " + matr[0].length);
                y = MyInput.leggiInteroPositivo();
                if (y > matr[0].length) {
                    System.out.println("Hai inserito un input non valido. Riprova.");
                }
            }while (y > matr[0].length);
/** @deprecated non è ottimizzato
            while (x < 0 || x > matr.length) {
                System.out.print("Inserisci la x in un range da 0 a: " + matr.length);
                x = MyInput.leggiInteroPositivo();
                if (x > matr.length) {
                    System.out.println("Hai inserito un input non valido. Riprova.");
                }
            }
            while (y < 0 || y > matr[0].length) {
                System.out.print("Inserisci la y in un range da 0 a: " + matr[0].length);
                y = MyInput.leggiInteroPositivo();
                if (y > matr[0].length) {
                    System.out.println("Hai inserito un input non valido. Riprova.");
                }
            }

 */
            if (matr[x][y] == 1) {
                haiVinto=true;
                System.out.println("Hai trovato il tesoro, hai vinto!");
            } else {
                nVite--;
                System.out.println("Non hai trovato il tesoro, hai ancora " + nVite + " vite.");
                if (nVite == 0) {
                    System.out.println("Hai perso");
                }
            }
        }//fine while
    }
    private static void cheat(int[][] matr) {
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[i].length; j++) {
                if (matr[i][j] == 1) {
                    System.out.println("Premio in posizione: riga" + i + ", colonna " + j);
                }
            }
            System.out.println("");
        }
    }
    private static void stampaMatrice(int[][] matr) {
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[i].length; j++) {
                System.out.print("[" + matr[i][j] + "]");
            }
            System.out.println("");
        }
    }
    private static int scegliNumPremi(int diff) {
        switch (diff) {
            case 4:
                return 1;
            case 6:
                return 2;
            case 8:
                return 3;
            //non dovrebbe verificarsi
            default:
                return 0;
        }

    }

    /**
     * @param matr     matrice di cui ci occorrono le dimensioni
     * @param numPremi numero di caselle di matrice da modificare
     */
    private static void inserisciPremio(int[][] matr, int numPremi) {
        Random r = new Random();
        int x, y;
        for (int i = 0; i < numPremi; i++) {
            do {
                x = r.nextInt(matr.length);
                y = r.nextInt(matr[0].length);
            } while (matr[x][y] == 1);
            matr[x][y] = 1;
        }
    }
    /**
     * * @return ritorna la difficoltà a cui si ha deciso di giocare, ovvero la dimensione della tabella da creare
     * non effettua controllo su valori non equivalenti a difficoltà, impostando in tal caso la difficoltà a 4
     */
    private static int scegliDifficolta() {
        System.out.println("Scegli 1 per facile, 2 per normale, 3 per diffiile");
        int diff = MyInput.leggiInteroPositivo();
        switch (diff) {
            case 1:
                return 4;
            case 2:
                return 6;
            case 3:
                return 8;
            default:
                return 4;
        }
    }
}//end class
