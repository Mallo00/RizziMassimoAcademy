package it.nextre.academy.esercizi.Es3_3;

import it.nextre.academy.myUtil.MyInput;

import java.util.Random;

public class Es3_3 {
    public static void main(String[] args) {
        //vetNomi
        String[] vetNomi=new String[0];
        vetNomi=punto1();
        //vetNum
        int[] vetNum=new int[0];
        vetNum=punto2();
        //vetFibonacci
        int[] fibonacci=new int[0];
        fibonacci=punto3();
    }

    public static int[] punto3() {
        System.out.println("Inserisci il numero di elementi della catena di fibonacci che vuoi vedere");
        int[] fibonacci=new int[MyInput.leggiInteroPositivo()+1];;
        for (int i = 0; i < fibonacci.length; i++) {
            if (i==0){
                fibonacci[i]=0;
                continue;
            }
            if (i==1){
                fibonacci[i]=1;
                continue;
            }
            fibonacci[i]=fibonacci[i-1]+fibonacci[i-2];
        }
        for (int i = 0; i < fibonacci.length; i++) {
            System.out.print("["+fibonacci[i]+"]");
        }
        System.out.println("");
        return fibonacci;
    }

    public static int[] punto2() {
        Random r=new Random();
        int[] vetNum;
        int nNum;
        System.out.println("Inserisci il numero di numeri che vuoi inserire");
        nNum=MyInput.leggiInteroPositivo();
        vetNum=new int[nNum];
        for (int i=0;i<vetNum.length;i++){
            vetNum[i]=r.nextInt(10);
        }
        System.out.println("Vuoi vedere l'elenco dei numeri? (s/n)");
        char sn=MyInput.carattSiONo();
        if (sn=='s'){
            for (int i=0;i<vetNum.length;i++){
                System.out.print("["+vetNum[i]+"]");
            }
            System.out.println("");
        }
        return vetNum;
    }

    public static String[] punto1() {
        String[] vetNomi;
        int nNomi;
        System.out.println("Inserisci il numero di nomi che vuoi inserire");
        nNomi=MyInput.leggiInteroPositivo();
        vetNomi=new String[nNomi];
        for (int i=0;i<vetNomi.length;i++){
            System.out.println("Inserisci il nome numero: "+(i+1));
            vetNomi[i]=MyInput.leggiRiga();
        }
        if (vetNomi.length>0){
            System.out.println("Vuoi vedere l'elenco dei nomi? (s/n)");
            char sn=MyInput.carattSiONo();
            if (sn=='s'){
                for (int i=0;i<vetNomi.length;i++){
                    System.out.print("["+vetNomi[i]+"]");
                }
                System.out.println("");
            }
        }
        return vetNomi;
    }

}//end class