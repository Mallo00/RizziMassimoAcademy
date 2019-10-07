package it.nextre.academy.esercizi.bingobango.ereditarieta;

public class Figlio extends Padre{
    String passione;
    public Figlio(String nome, int eta, String lavoro, String passione) {
        super(nome, eta, lavoro);
        this.passione=passione;
    }
    public Figlio(){
        super();
    }

    @Override
    public String toString() {
        return "Figlio{" +
                "passione='" + passione + '\'' +
                ", lavoro='" + lavoro + '\'' +
                ", nome='" + nome + '\'' +
                ", eta=" + eta +
                '}';
    }
}//end class
