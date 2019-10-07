package it.nextre.academy.myUtil;

import java.text.DecimalFormat;
import java.util.Random;

public class MyOutput {

    public static void stampaVettoreInt(int [] vet){
        for (int i=0;i<vet.length;i++){
            System.out.print("["+vet[i]+"]");
        }
        System.out.println("");
    }
    public static void stampaVettoreBoolean(boolean [] vet){
        for (int i=0;i<vet.length;i++){
            System.out.print("["+vet[i]+"]");
        }
        System.out.println("");
    }
    public static void stampaVettoreAlContrarioInt(int [] vet){
        for (int i=vet.length-1;i>=0;i--){
            System.out.print("["+vet[i]+"]");
        }
        System.out.println("");
    }
    public static void stampaMatriceInt(int[][] mat){
        for (int i=0;i<mat.length;i++){
            for (int j=0;j<mat[0].length;j++){
                System.out.print("["+mat[i][j]+"]");
            }
            System.out.println("");
        }
    }
    public static void stampaMatriceString(String[][] mat){
        for (int i=0;i<mat.length;i++){
            for (int j=0;j<mat[0].length;j++){
                System.out.print("["+mat[i][j]+"]");
            }
            System.out.println("");
        }
    }
    public static int[] invertiVettoreInt(int [] vet){
        int[] vetContr=new int[vet.length];
        for (int i=vet.length-1;i>=0;i--){
            int pOpposta=vet.length-1-i;
            vetContr[pOpposta]=vet[i];
        }
        return vetContr;
    }
    public static String invertiStringa(String s){
        String appo="";
        for (int i = s.length()-1; i >=0; i--) {
            appo+=s.charAt(i);
        }
        s=appo;
        return s;
    }
    public static void stampaVettoreString(String [] vet){
        for (int i=0;i<vet.length;i++){
            System.out.print("["+vet[i]+"]");
        }
        System.out.println("");
    }
    public static void stampaVettoreAlContrarioString(String [] vet){
        for (int i=vet.length-1;i>=0;i--){
            System.out.print("["+vet[i]+"]");
        }
        System.out.println("");
    }
    public static String[] invertiVettoreString(String [] vet){
        String[] vetContr=new String[vet.length];
        for (int i=vet.length-1;i>=0;i--){
            int pOpposta=vet.length-1-i;
            vetContr[pOpposta]=vet[i];
        }
        return vetContr;
    }

    public static void stampaVettoreDouble(double[] vet) {
        for (int i=0;i<vet.length;i++){
            System.out.print("["+vet[i]+"]");
        }
        System.out.println("");
    }

    public static double calcolaMediaVett(double[] vet){
        double media=0;
        if(vet.length!=0){
            double sum=0;
            for (int i=0; i<vet.length;i++) {
                sum+=vet[i];
            }
            media=sum/vet.length;
        }
        return media;
    }
    
    public static String formattaDouble(double numero){
        return formattaDouble(numero, 2);
    }

    private static String formattaDouble(double numero, int precisione) {
        DecimalFormat df=new DecimalFormat();
        df.setMaximumFractionDigits(precisione);
        return df.format(numero);
    }

    /**
     * METODO CHE ritorna 1 in caso di vittoria, 0 in caso di sconfitta.
     * la percentuale di successo referenzia la variabile di classe chiamata perc succ
     * @return
     */
    public static int generaRisultatoRandomico(int PERC_SUCC) {
        Random r=new Random();
        return r.nextInt(100)<PERC_SUCC?1:0;
    }

}//end class
