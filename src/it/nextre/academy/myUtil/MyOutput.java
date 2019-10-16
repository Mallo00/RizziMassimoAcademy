package it.nextre.academy.myUtil;

public class MyOutput {

    public static void stampaVettoreInt(int[] vet) {
        for (int i = 0; i < vet.length; i++) {
            System.out.print("[" + vet[i] + "]");
        }
        System.out.println("");
    }

    public static void stampaVettoreBoolean(boolean[] vet) {
        for (int i = 0; i < vet.length; i++) {
            System.out.print("[" + vet[i] + "]");
        }
        System.out.println("");
    }

    public static void stampaVettoreAlContrarioInt(int[] vet) {
        for (int i = vet.length - 1; i >= 0; i--) {
            System.out.print("[" + vet[i] + "]");
        }
        System.out.println("");
    }

    public static void stampaMatriceInt(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print("[" + mat[i][j] + "]");
            }
            System.out.println("");
        }
    }

    public static void stampaMatriceString(String[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print("[" + mat[i][j] + "]");
            }
            System.out.println("");
        }
    }


    public static void stampaVettoreString(String[] vet) {
        for (int i = 0; i < vet.length; i++) {
            System.out.print("[" + vet[i] + "]");
        }
        System.out.println("");
    }

    public static void stampaVettoreAlContrarioString(String[] vet) {
        for (int i = vet.length - 1; i >= 0; i--) {
            System.out.print("[" + vet[i] + "]");
        }
        System.out.println("");
    }


    public static void stampaVettoreDouble(double[] vet) {
        for (int i = 0; i < vet.length; i++) {
            System.out.print("[" + vet[i] + "]");
        }
        System.out.println("");
    }

    public static double calcolaMediaVett(double[] vet) {
        double media = 0;
        if (vet.length != 0) {
            double sum = 0;
            for (int i = 0; i < vet.length; i++) {
                sum += vet[i];
            }
            media = sum / vet.length;
        }
        return media;
    }


}//end class
