package it.nextre.academy.esercizi.cap4;

import it.nextre.academy.myUtil.MyOutput;

import java.text.DecimalFormat;
import java.util.Random;

public class Es4_15 {
    public static void main(String[] args) {
        int nlanci = 100000;
        int percSucc=3;
        boolean[] vetLanci = new boolean[nlanci];
        Random r = new Random();
        for (int i = 0; i < vetLanci.length; i++) {
            vetLanci[i] = r.nextInt(10)<percSucc;
        }
        double contatesta = 0;
        double contacroce = 0;
        for (int i = 0; i < vetLanci.length; i++) {
            if (vetLanci[i]) {
                contatesta++;
            } else contacroce++;
        }
        double percentTesta, percentCroce;
        System.out.println("Lanci: "+vetLanci.length);
        System.out.println("Percentuale di testa "+MyOutput.formattaDouble((contatesta * 100) / vetLanci.length)+"%");
        System.out.println("Percentuale di croce su "+MyOutput.formattaDouble((contacroce * 100) / vetLanci.length)+"%");
    }
}//end class
