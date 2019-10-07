package it.nextre.academy.esercizi.cap5.Es5_6;

import it.nextre.academy.esercizi.randomData.DummyData;

//Es 5.6
//Realizzare una serie di classi che permettano, grazie alla visibilità, di limitare l’accesso ai propri membri.
//Strutturare le classi per avere dei metodi che permettano di leggere e modificare le variabili.
//Ogni istanza di classe dovrà avvisare l’utente dell’avvenuta creazione.
public class Es5_6 {
    public static void main(String[] args) {
        Padre p= new  Padre(20, DummyData.getNome());
        Figlio f=new Figlio(4);
    }
}//end class
