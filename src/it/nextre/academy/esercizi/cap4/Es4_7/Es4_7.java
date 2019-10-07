package it.nextre.academy.esercizi.cap4.Es4_7;

import it.nextre.academy.myUtil.MyLoadings;
import it.nextre.academy.myUtil.MyOutput;

public class Es4_7 {
    public static final int DIM=10;
    public static void main(String[] args) {
        int[] vetNum=new int[DIM];
        vetNum= MyLoadings.caritcaVetNumeriCasualiInt(vetNum, 0, 10);
        MyOutput.stampaVettoreInt(vetNum);
        vetNum=MyLoadings.bubbleSort(vetNum);
        MyOutput.stampaVettoreInt(vetNum);
    }
}//end class
