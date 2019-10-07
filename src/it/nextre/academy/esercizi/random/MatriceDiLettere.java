package it.nextre.academy.esercizi.random;

import it.nextre.academy.myUtil.MyInput;
import java.util.Random;

public class MatriceDiLettere {
    public static void main(String[] args) {
        /**
         chiedere le dimensioni della matrice dall’utente
         popolare la matrice
         controllare la matrice
         */
        char matr[][];
        int righe;
        int colonne;
        System.out.print("Inserisci il numero di righe della matrice: ");
        righe = MyInput.leggiInteroPositivo();
        System.out.print("Inserisci il numero di colonne della matrice: ");
        colonne = MyInput.leggiInteroPositivo();
        matr = new char[righe][colonne];
        popolaMatriceRandomicamente(matr);
        stampaMatrice(matr);
        trovaX(matr);
        contaX(matr);
        char carattere='\0';
        /**
         *  ricevere carattere da cercare tramite input da tastiera
         *
         * System.out.println("Inserisci un carattere da cercare");
         *         carattere=(char)(MyInput.leggiRiga());
         */

        controllaMatrice(matr,  carattere);
    }//end main

    public static void popolaMatriceRandomicamente(char[][] matr) {
        Random r = new Random();
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[i].length; j++) {
                matr[i][j] = (char) (r.nextInt(26) + 65);

            }
        }
    }//fine popo

    public static void stampaMatrice(char [][] matr){
        for (int i=0; i<matr.length;i++){
            for (int j=0; j<matr[i].length;j++){
                System.out.print("["+matr[i][j]+"]");
            }
            System.out.println("");
        }
    }
    public static void trovaX(char [][] matr){
        trovax:
        for (int i=0; i<matr.length;i++){
            for (int j=0; j<matr[i].length;j++){
                if (matr[i][j]=='X'){
                    System.out.println("Trovata una x in posizione: ");
                    System.out.println("Riga: ["+i+"], "+"Colonna: ["+j+"]");
                    break trovax;
                }
            }
        }
    }

    public static void contaX(char [][] matr){
        int contax=0;
        contax:
        for (int i=0; i<matr.length;i++){
            for (int j=0; j<matr[i].length;j++){
                if (matr[i][j]=='X'){
                    System.out.println("Trovata x in posizione: ");
                    System.out.println("Riga: ["+i+"], "+"Colonna: ["+j+"]");
                    contax++;
                }
            }
        }
        System.out.println("Numero di x: "+contax);
    }


    private static boolean controllaMatrice(char[][] matr, char carattereDaCercare){
        boolean trovato=false;
        for (int i=0; i<matr.length;i++){
            for (int j=0; j<matr[i].length;j++){
                if (matr[i][j]==carattereDaCercare){
                    return true;
                }
            }
        }
        return false;
    }
}//end class
