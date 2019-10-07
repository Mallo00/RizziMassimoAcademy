package it.nextre.academy.esercizi.bingobango.ereditarieta;

public abstract class Nonno {
    protected String nome;
    protected int eta;

    public Nonno(String nome, int eta) {
        this.nome = nome;
        this.eta = eta;
    }

    public Nonno() { }

    public void saluta() {
        System.out.println("Ciao mi chiamo " + nome);
    }
    public static void cammina(){
        System.out.println("Cammino");
    }
    @Override
    public String toString() {
        return "Nonno{" +
                "nome='" + nome + '\'' +
                ", eta=" + eta +
                '}';
    }
}//end class
