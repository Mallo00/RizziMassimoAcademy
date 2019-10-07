package it.nextre.academy.prove.ripassoInterfacce;

public class Figlio extends Padre {
    static {
        System.out.println("Inizializzaroee statico figlio");
    }

    {
        System.out.println("Inizializzatore di istanza figlio");
    }

    Figlio(String nome, int eta) {
        super(nome, eta);
    }

    @Override
    public String toString() {
        return "Figlio{Nome: " +
                getNome()
                +" Eta: "+
                getEta()
                +
                "}";
    }
}//end class
