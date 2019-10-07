package it.nextre.academy.esercizi.cap4;

import it.nextre.academy.myUtil.MyInput;
import it.nextre.academy.myUtil.MyOutput;

public class Es4_13 {
    public static void main(String[] args) {
        System.out.println("Inserisci una stringa: ");
        String frase = MyInput.leggiRiga().trim();
        Carattere input2 = new Carattere(' ');
        int nParole = input2.contaOccorrenze(frase) + 1;
        //fattibile con stringtokenizer
        System.out.println("Il numero delle parole nell'input è: " + nParole);
//v1, ricevo un carattere e ne conta le occorrenze
         contaCarattereSingolo(frase);
//v2, ricevo una stringa e ne conta le occorrenze di ogni carattere che la compongono
        contaCarattereMultiplo(frase);
    }

    private static void contaCarattereMultiplo(String frase) {
        System.out.println("Inserisci una serie di caratteri e io conterò le occorrenze di ognuno.");
        String cerca = MyInput.leggiRiga().trim();
        String cercaVera = "";
        for (int i = 0; i < cerca.length(); i++) {
            if (!cercaVera.contains("" + cerca.toCharArray()[i])) {
                cercaVera += cerca.toCharArray()[i];
            }
        }
        Carattere[] vetCaratteri = new Carattere[cercaVera.length()];
        String[][] matOccorrenze = new String[cercaVera.length()][2];
        for (int i = 0; i < vetCaratteri.length; i++) {
            vetCaratteri[i] = new Carattere(cercaVera.charAt(i));
        }
        for (int i = 0; i < matOccorrenze.length; i++) {
            matOccorrenze[i][0] = "" + vetCaratteri[i].getCarattere();
        }
        for (int i = 0; i < matOccorrenze.length; i++) {
            for (int j = 1; j < matOccorrenze[0].length; j++) {
                matOccorrenze[i][j] = "" + vetCaratteri[i].contaOccorrenze(frase);
            }
        }
        MyOutput.stampaMatriceString(matOccorrenze);
    }

    private static void contaCarattereSingolo(String frase) {
        System.out.println("Inserisci un carattere e io ne conterò le occorrenze. Se vuoi puoi cercare il numero di parole inserendo uno spazio");
        char cerca = MyInput.leggiCarattere();
        Carattere input1 = new Carattere(cerca);
        int nOccorrenze = input1.contaOccorrenze(frase);
        System.out.println("Hai inserito " + nOccorrenze + " caratteri: " + cerca);
    }
}//end class
