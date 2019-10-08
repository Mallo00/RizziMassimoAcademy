package it.nextre.academy.prove.hashCode;

public class Oggetto {
    private String nome;
    Oggetto(String nome){
        this.nome=nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Oggetto{" +
                "nome='" + nome + '\'' +
                '}';
    }
}//end class
