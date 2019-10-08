package it.nextre.academy.prove.carteIDExecutor;

import java.util.Random;

public class Persona extends Thread {

    String nome;
    Compila compila;
    private final static Random R = new Random();

    Persona(String nome) {
        this.nome = nome;
    }

    @Override
    public void run() {
        //all'avvio la persona si reca presso l'unico sportello disponibile e inizia a compilare
        SportelloCarte.getInstance().gestisciRichiesta(this);
    }

    public String getNome(){
        return nome;
    }


}//end class
