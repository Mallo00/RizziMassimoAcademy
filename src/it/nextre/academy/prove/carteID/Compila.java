package it.nextre.academy.prove.carteID;

import java.util.Random;

class Compila implements Runnable {
    private String nome;

    public Compila(String nome) {
        //run();
        this.nome = nome;
        run();
    }

    public Compila() {
        run();
    }

    @Override
    public void run() {


    }
}