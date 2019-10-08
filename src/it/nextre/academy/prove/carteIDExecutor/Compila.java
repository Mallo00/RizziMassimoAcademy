package it.nextre.academy.prove.carteIDExecutor;

class Compila implements Runnable {
    private String nome;

    public Compila(String nome) {
        //run();
        this.nome = nome;
        run();
    }

    public Compila() {
        run();
    }

    @Override
    public void run() {


    }
}