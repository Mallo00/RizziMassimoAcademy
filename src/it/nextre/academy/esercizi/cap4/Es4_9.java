package it.nextre.academy.esercizi.cap4;

import it.nextre.academy.myUtil.MyFormatter;
import it.nextre.academy.myUtil.MyLoadings;
import it.nextre.academy.myUtil.MyOutput;

import java.text.DecimalFormat;
import java.util.Random;

public class Es4_9 {
    public static void main(String[] args) {
        int nlanci = 100000000;
        boolean[] vetLanci = new boolean[nlanci];
        Random r = new Random();
        for (int i = 0; i < vetLanci.length; i++) {
            vetLanci[i] = r.nextBoolean();
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
        System.out.println("Percentuale di testa "+ MyFormatter.formattaDouble((contatesta * 100) / vetLanci.length)+"%");
        System.out.println("Percentuale di croce su "+ MyFormatter.formattaDouble((contacroce * 100) / vetLanci.length)+"%");
    }
}//end class
