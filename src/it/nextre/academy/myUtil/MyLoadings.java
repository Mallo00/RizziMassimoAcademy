package it.nextre.academy.myUtil;

import java.util.Random;

public class MyLoadings {

    public static double[] caritcaVetNumeriCasualiDouble(double[] vet, double min, double max) {
        Random r = new Random();
        for (int i = 0; i < vet.length; i++) {
            vet[i] = min + (max - min) * r.nextDouble();
        }
        return vet;
    }

    public static int[] caritcaVetNumeriCasualiInt(int[] vet, int min, int max) {
        Random r = new Random();
        for (int i = 0; i < vet.length; i++) {
            vet[i] = r.nextInt((max - min)) + min;
        }
        return vet;
    }

    public static int[][] caritcaMatNumeriCasualiInt(int[][] mat, int min, int max) {
        Random r = new Random();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                mat[i][j] = r.nextInt((max - min)) + min;
            }
        }
        return mat;
    }

    /**
     * @param vet vettore da allungare con altri valori
     * @return ritorna il vettore in ingresso allungato e con nuovi valori
     */
    public static int[] inserisciElementoInVettoreInt(int vet[]) {
        int[] tmp = new int[vet.length + 1];
        for (int j = 0; j < vet.length; j++) {
            tmp[j] = vet[j];
        }
        vet = tmp;
        return vet;
    }

    public static String[] inserisciElementoInVettoreString(String vet[]) {
        String[] tmp = new String[vet.length + 1];
        for (int j = 0; j < vet.length; j++) {
            tmp[j] = vet[j];
        }
        vet = tmp;
        return vet;
    }

    public static int[] bubbleSort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            boolean flag = false;
            for (int j = 0; j < array.length - 1; j++) {
                //Se l' elemento j e maggiore del successivo allora
                //scambiamo i valori
                if (array[j] > array[j + 1]) {
                    int k = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = k;
                    flag = true; //Lo setto a true per indicare che é avvenuto uno scambio
                }
            }
            if (!flag) break; //Se flag=false allora vuol dire che nell' ultima iterazione
            //non ci sono stati scambi, quindi il metodo può terminare
            //poiché l' array risulta ordinato
        }
        return array;
    }

    public static String[] invertiVettoreString(String[] vet) {
        String[] vetContr = new String[vet.length];
        for (int i = vet.length - 1; i >= 0; i--) {
            int pOpposta = vet.length - 1 - i;
            vetContr[pOpposta] = vet[i];
        }
        return vetContr;
    }

    public static String invertiStringa(String s) {
        String appo = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            appo += s.charAt(i);
        }
        s = appo;
        return s;
    }

    public static int[] invertiVettoreInt(int[] vet) {
        int[] vetContr = new int[vet.length];
        for (int i = vet.length - 1; i >= 0; i--) {
            int pOpposta = vet.length - 1 - i;
            vetContr[pOpposta] = vet[i];
        }
        return vetContr;
    }

}//end class
