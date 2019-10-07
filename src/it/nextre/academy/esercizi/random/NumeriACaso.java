package it.nextre.academy.esercizi.random;

import java.util.Random;

public class NumeriACaso {
    public static void main(String[] args) {
        Random r = new Random();
        System.out.println(1 + r.nextInt(10));


        int x;
        int i = 0;
        int j = 0;
        prova:
        do {

            i++;
            x = 1 + (int) (Math.random() * 10);
            System.out.println(i + ")" + x);
            if (x == 5) break prova;
        } while (x <= 10 || x >= 1);

        char[][] alfabeto = new char[5][5];

/**
 * caricamento di una matrice con caratteri casuali.
 * quando viene caricata una lettera x, il caricamento si interrompe
 */
        lettere:
        for (i = 0; i < alfabeto.length; i++) {
            for (j = 0; j < alfabeto[i].length; j++) {
                alfabeto[i][j] = (char) (r.nextInt(25) + 97);
                System.out.print(alfabeto[i][j] + "-");
                if (alfabeto[i][j] == 'x') {
                    System.out.println('\n' + "x non valida, esco");

                    break lettere;
                }
            }
            System.out.println("");
        }
        esitoCaricamento(alfabeto, i, j);
        System.out.println("Fine caricamento matrice");


    }
    public static void esitoCaricamento(char[][] alfabeto,int i, int j){
        if (i==alfabeto.length-1&&j==alfabeto[i].length-1&&alfabeto[i][j]!='x'){
            System.out.println("Matrice caricata completamente");
        }

        if (alfabeto[i][j] == 'x') {
            System.out.println("Caricamento interrotto per estrazione x");
        }
        else    {
            System.out.println("Matrice caricata completamente");
        }
    }

}//end class
