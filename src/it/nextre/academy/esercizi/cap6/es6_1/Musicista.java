package it.nextre.academy.esercizi.cap6.es6_1;

public class Musicista implements Cantante, Strumentista {
    String nome;
    String ruolo;
    public Musicista(String nome) {
        this.nome = nome;
        this.ruolo="Niente";
    }

    @Override
    public void canta() {
        canta("Sto cantando");
    }

    public String getRuolo() {
        return ruolo;
    }

    public void setRuolo(String ruolo) {
        this.ruolo = ruolo;
    }

    public void canta(String canzone) {
        System.out.println(canzone);
    }

    @Override
    public String toString() {
        return "Musicisti{" +
                "nome='" + nome + '\'' +
                '}';
    }

}//end class
