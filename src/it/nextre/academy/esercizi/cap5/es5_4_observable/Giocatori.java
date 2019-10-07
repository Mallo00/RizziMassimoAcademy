package it.nextre.academy.esercizi.cap5.es5_4_observable;

import it.nextre.academy.myUtil.MyLoadings;
import it.nextre.academy.myUtil.MyOutput;

import java.util.Arrays;
import java.util.Random;

public class Giocatori implements Giocatore, MostreEstraz {

    private String nome;
    private int[][] schedina;
    private int contaCheck;
    private boolean vinto;
    Random r = new Random();


    public int[][] getSchedina() {
        return schedina;
    }

    public Giocatori(String nome) {
        vinto = false;
        contaCheck = 0;
        this.nome = nome;
        schedina = new int[3][6];
        for (int i = 0; i < schedina.length; i++) {
            for (int j = 0; j < schedina[0].length; j++) {
                int appo = 0;
                do {
                    appo = r.nextInt(90) + 1;
                } while (exitst(appo));
                schedina[i][j] = appo;
            }

        }
        //schedina = MyLoadings.bubbleSort(schedina);
    }

    public boolean exitst(int appo) {
        for (int i = 0; i < schedina.length; i++) {
            for (int j = 0; j < schedina[0].length; j++) {
                if (schedina[i][j] == appo) {
                    return true;
                }
            }

        }
        return false;
    }

    @Override
    public void mostra() {
        System.out.println("Non serve a un azzo");
    }

    public boolean controlla(int estraz) {
        int k = 0;
        boolean vinto = false;

        Controllo: for (int i = 0; i < schedina.length; i++) {
            for (int j = 0; j < schedina[0].length; j++) {
                if (schedina[i][j] == estraz) {
                    System.out.println(nome + ": Ce l'ho! " + estraz);
                    contaCheck++;
                    break Controllo;
                }
            }
        }


        if (contaCheck == 6) {
            vinto = true;
            System.out.println(nome + ": Ho vinto!");
            MyOutput.stampaMatriceInt(schedina);
        }
        return vinto;
    }

    @Override
    public String toString() {
        return "Giocatori{" +
                "nome='" + nome + '\'' +
                ", schedina=" + Arrays.toString(schedina) +
                ", contaCheck=" + contaCheck +
                '}';
    }

    @Override
    public void update(Integer estraz) {
        Controllo: for (int i = 0; i < schedina.length; i++) {
            for (int j = 0; j < schedina[0].length; j++) {
                if (schedina[i][j] == estraz) {
                    System.out.println(nome + ": Ce l'ho! " + estraz);
                    contaCheck++;
                    break Controllo;
                }
            }
        }
        if (vittoria()) {
            System.out.println(nome + ": Ho vinto!");
        }

    }

    public boolean isVinto() {
        return vinto;
    }

    public boolean vittoria() {
        vinto = contaCheck == 6;
        return vinto;
    }

    public String getNome() {
        return nome;
    }
}//end class
