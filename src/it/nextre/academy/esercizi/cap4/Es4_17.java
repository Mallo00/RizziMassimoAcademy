package it.nextre.academy.esercizi.cap4;

import it.nextre.academy.myUtil.MyLoadings;
import it.nextre.academy.myUtil.MyOutput;

import java.util.Random;

public class Es4_17 {
    public static void main(String[] args) {
        Random r=new Random();
        int[] vetFrontini=new int[500];
        MyLoadings.caritcaVetNumeriCasualiInt(vetFrontini,0,10000);
        int max=0;
        int posMax=0;
        for (int i = 0; i < vetFrontini.length; i++) {
            if (vetFrontini[i]>max){
                max=vetFrontini[i];
                posMax=i;
            }
        }
        System.out.println("Valore più alto: "+max+", in posizione: "+posMax);
        max=0;
        posMax=0;
        for (int i = 0; i < 500; i++) {
            int tmp=r.nextInt(10000)+1;
            if (tmp>max){
                max=tmp;
                posMax=i;
            }
        }
        System.out.println("Valore più alto: "+max+", in posizione: "+posMax);
    }
}//end class
