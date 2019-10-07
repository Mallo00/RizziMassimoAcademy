package it.nextre.academy.designpattern.observablePattern;

public class Player implements ObserverInterface {
    private String nome;
    private Integer numeroVincente;

    public Player(String nome, Integer numeroVincente) {
        this.nome = nome;
        this.numeroVincente = numeroVincente;
    }

    public Player(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Player{" +
                "nome='" + nome + '\'' +
                '}';
    }

    @Override
    public void doAction(int numero) {
        if (numeroVincente==numero){
            System.out.println(this.nome+" ha vinto con il numero: "+numero);
        }
    }

    public boolean haVinto() {

        return false;
    }
}//end class
