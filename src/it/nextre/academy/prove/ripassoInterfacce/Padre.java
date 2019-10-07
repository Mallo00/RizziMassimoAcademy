package it.nextre.academy.prove.ripassoInterfacce;

public class Padre {
    static {
        System.out.println("Inizializzaroee statico padre");
    }

    {
        System.out.println("Inizializzatore di istanza padre");
    }

    private String nome;
    private int eta;
    Padre(String nome, int eta){
        this.nome=nome;
        this.eta=eta;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Padre{" +
                "nome='" + nome + '\'' +
                ", eta=" + eta +
                '}';
    }
}//end class
