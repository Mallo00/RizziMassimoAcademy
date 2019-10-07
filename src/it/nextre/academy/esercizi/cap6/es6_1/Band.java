package it.nextre.academy.esercizi.cap6.es6_1;

import java.util.ArrayList;

public class Band {
    private String nome;
    private ArrayList<Musicista> membri;
    private String genere;

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public Band(String nome) {
        this.nome = nome;
        this.genere="";
        membri=new ArrayList<>();
    }
    public void addMembro(Musicista musicista){
        membri.add(musicista);
    }
    public void removeMember(Musicista musicista){
        membri.remove(musicista);
    }

    @Override
    public String toString() {
        return "Band{" +
                "nome='" + nome + '\'' +
                ", membri=" + membri +
                '}';
    }

    public ArrayList<Musicista> getMembri() {
        return membri;
    }
}//end class
