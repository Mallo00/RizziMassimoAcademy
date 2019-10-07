package it.nextre.academy.esercizi.cap4.Es4_4;

import it.nextre.academy.myUtil.MyOutput;

import java.util.Arrays;
import java.util.Random;

//Realizzare una matrice con all’interno una serie di valori di lunghezze differenti. Questa matrice deve rappresentare il numero di tentativi,
//per eseguire un’operazione che ha una probabilità di successo pari al 10%, di 10 persone. Una persona termina il suo lavoro solo dopo aver
//completato con successo 5 operazioni.
//Al termine stampare la media del numero di tentativi per portare a termine l’operazione.
//SUGGERIMENTI: usare la classe Random() e non Math.random().
public class Es4_4 {
    public static final int NGIOCA = 10;
    public static final int SUCCESSI = 5;
    public static final int PERC_SUCC = 10;

    public static void main(String[] args) {
        //mioEs(NGIOCA, SUCCESSI);
        correzione();
    }

    public static int[][] mioEs(int giocatori, int check) {
        Random r = new Random();
        int[][] matr = new int[giocatori][];
        int[] vetEstraz = new int[0];
        int estr = 0;
        //cicla per il numero di giocatori
        for (int i = 0; i < giocatori; i++) {
            int tries = 0;
            int checks = 0;
            int estraz = 0;
            vetEstraz = new int[0];
            do {
                tries++;
                estr = r.nextInt(10);
                vetEstraz = Arrays.copyOf(vetEstraz, vetEstraz.length + 1);
                vetEstraz[vetEstraz.length - 1] = estr;
                if (estr == 1) {
                    checks++;
                }
            } while (checks < check);
            matr[i] = Arrays.copyOf(vetEstraz, vetEstraz.length);
        }
        MyOutput.stampaVettoreInt(vetEstraz);
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[0].length; j++) {
                System.out.print(matr[i][j]);
            }
            System.out.println("");
        }
        return matr;
    }

    private static void correzione() {
        //0 preparo le variabili
        int[][] matr = new int[NGIOCA][];
        //logica di gioco
        for (int i = 0; i < matr.length; i++) {
            //simulo l'operazione
            int checks = 0;
            int giocate[] = new int[0];
            do {
                int risultato = MyOutput.generaRisultatoRandomico(PERC_SUCC);
                if (risultato == 1) {
                    //vince
                    checks++;
                } else {
                    //perde
                    risultato = 0;
                }
                //registro giocate in array
                int[] tmp = new int[giocate.length + 1];
                for (int j = 0; j < giocate.length; j++) {
                    tmp[j] = giocate[j];
                }
                giocate = tmp;
            } while (checks < SUCCESSI);
            //associo le giocate del giocatore algiocatore
            matr[i] = giocate;
        }//end for
        //2 stampa dei risultati
        //System.out.println(matr[0].length);
        MyOutput.stampaMatriceInt(matr);
    }


}//end class
