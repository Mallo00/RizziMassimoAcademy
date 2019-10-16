package it.nextre.academy.verifiche.verifica15_10.es13;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Auto {
    private String nome;
    private List<Duration> tempi;
    private Random r;

    public Auto(String nome) {
        this.nome = nome;
        tempi = new ArrayList<>();
        r = new Random();
    }

    public void corriGiro() {
        //calcolo un nuovo delta per far variare il tempo del giro
        long deltaMillis = r.nextInt(5000) - 2000;
        //genero la durata del giro e la inserisco nella lista
        Duration questoGiro = Duration.of(Corsa.getTempoMedio().toMillis() + deltaMillis, ChronoUnit.MILLIS);
        tempi.add(questoGiro);
    }

    public String getNome() {
        return nome;
    }

    public long tempoTotaleMillis(){
        //sommo i tempi di tutti i giri
        long sum=0;
        for (int i = 0; i < tempi.size(); i++) {
            sum+=tempi.get(i).toMillis();
        }
        return sum;
    }

    @Override
    public boolean equals(Object obj) {
        return this.getNome().equals(((Auto)obj).getNome());
    }
}//end class