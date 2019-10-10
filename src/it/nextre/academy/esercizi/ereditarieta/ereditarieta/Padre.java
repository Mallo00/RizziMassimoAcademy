package it.nextre.academy.esercizi.ereditarieta.ereditarieta;

public class Padre extends Nonno implements Lavoratore {
    protected String lavoro;

    public Padre(String nome, int eta, String lavoro) {
        super(nome, eta);
        this.lavoro = lavoro;
    }

    public Padre() {
        super();
    }

    @Override
    public void lavora() {
        System.out.println("Il mio lavoro è: " + lavoro);
    }

    @Override
    public String toString() {
        return "Padre{" +
                "lavoro='" + lavoro + '\'' +
                ", nome='" + nome + '\'' +
                ", eta=" + eta +
                '}';
    }
}//end class
