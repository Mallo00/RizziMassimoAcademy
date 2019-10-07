package it.nextre.academy.esercizi.cap5.es5_5;

import it.nextre.academy.myUtil.MyInput;

import java.util.ArrayList;
import java.util.Random;

public class Player {
    private String nome;
    private int nVittorie;
    Random r;

    public Player(String nome) {
        this.nome = nome;
        r = new Random();
        nVittorie = 0;
    }

    public String gioca(String messaggio) {
        System.out.println(messaggio);
        String mossa= MyInput.leggiRiga();
        return mossa;
    }
    public String gioca(ArrayList<String> l) {
        String mossa= l.get(r.nextInt(l.size()-1));
        return mossa;
    }

    public void vittoria() {
        this.nVittorie++;
    }

    public int getnVittorie() {
        return nVittorie;
    }

    public String getNome() {
        return nome;
    }
}//end class
