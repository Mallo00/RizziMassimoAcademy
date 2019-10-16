package it.nextre.academy.esercizi.cap4.Es4_2;

import it.nextre.academy.myUtil.MyFormatter;
import it.nextre.academy.myUtil.MyLoadings;
import it.nextre.academy.myUtil.MyOutput;

public class Es4_2 {
    public static void main(String[] args) {
       // String[] vetNomi = Es3_3.punto1();
        // int[] fibonacci = Es3_3.punto3();
        //int[] vetNum = Es3_3.punto2();
        // punto1(vetNomi,vetNum,fibonacci);
        //punto 2
        //punto2(fibonacci);
        //punto 3, stampa di una serie di nomi separati da una virgola
        // punto3(vetNomi);
        //punto 4, media delle temperature randomiche
        punto4();
        /**
         * caricamento delle temperature casuali oscillanti di un valore limitato casuale
         double[] vetTemp=new double[5];
         for(int i=0;i<vetTemp.length;i++){
         vetTemp[i]= MyInput.getRandomTemp(35,15);
         }
         System.out.print("Temperature: ");
         for (int i=0;i<vetTemp.length;i++){
         System.out.print("["+df.format(vetTemp[i])+"]");
         }
         */
        //punto 5
        //punto5(fibonacci);
        //punto 6
        //punto6(vetNomi);
        //punto 7
        //punto7(vetNomi);
    }//fine main

    private static void punto7(String[] vetNomi) {
        String[] vetAppo = new String[vetNomi.length];

        for (int i = 0; i < vetNomi.length; i++) {
            String s="";
            for (int j=vetNomi[i].length()-1;j>=0;j--) {
                s+= vetNomi[i].charAt(j);
            }
            vetAppo[i]=s;
        }
        MyOutput.stampaVettoreString(vetAppo);
    }

    private static void punto6(String[] vetNomi) {
        System.out.println("come sarebbero i nomi senza vocali");
        for (int i = 0; i < vetNomi.length; i++) {
            System.out.println(vetNomi[i] + ", diventa: " + vetNomi[i].replaceAll("[AEIOUaeiou]", ""));
        }
    }

    private static void punto5(int[] fibonacci) {
        System.out.println("Somma separata dei valori pari e dispari.");
        int sommaP = 0;
        int nPari = 0;
        int nDisp = 0;
        int sommaD = 0;
        for (int i = 0; i < fibonacci.length; i++) {
            if (fibonacci[i] % 2 == 0) {
                nPari++;
                sommaP += fibonacci[i];
            } else {
                nDisp++;
                sommaD += fibonacci[i];
            }
        }
        System.out.println("I Pari sono: " + nPari + ", la loro somma è di: " + sommaP + "I Dispari sono: " + nDisp + ", la loro somma è di: " + sommaD);
    }

    private static void punto4() {
        double[] vetTemp = new double[5];
        vetTemp = MyLoadings.caritcaVetNumeriCasualiDouble(vetTemp, (double) 0, (double) (46));
        for (int i = 0; i < vetTemp.length; i++) {
            System.out.print("[" + MyFormatter.formattaDouble(vetTemp[i]) + "]");
        }
        System.out.println("");
        System.out.println("Media delle temperature: ");
        System.out.print(MyFormatter.formattaDouble(MyOutput.calcolaMediaVett(vetTemp)));
    }

    private static void punto3(String[] vetNomi) {
        for (int i = 0; i < vetNomi.length; i++) {
            System.out.print(vetNomi[i]);
            if (i < vetNomi.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(".");
    }

    private static void punto2(int[] fibonacci) {
        System.out.print("Somma di tutti i valori in Fibonacci: ");
        int sum = 0;
        for (int appo :
                fibonacci) {
            sum += appo;
        }
        System.out.println(sum);
    }

    private static void punto1(String[] vetNomi, int[] vetNum, int[] fibonacci) {
        //punto 1, vettori al contrario
        System.out.println("Stampa al contrario del vettore di nomi");
        MyOutput.stampaVettoreString(MyLoadings.invertiVettoreString(vetNomi));
        System.out.println("Stampa al contrario del vettore di numeri casuali");
        MyOutput.stampaVettoreInt(MyLoadings.invertiVettoreInt(vetNum));
        System.out.println("Stampa al contrario del vettore di fibonacci");
        MyOutput.stampaVettoreInt(MyLoadings.invertiVettoreInt(fibonacci));
    }



}//end class
