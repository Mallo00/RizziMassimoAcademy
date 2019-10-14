package it.nextre.academy.corseDeeJay;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class Corridore implements Comparable {
    private String nome;
    private List<Duration> tempi;


    private static Random r=new Random();
    public Corridore(){

    }

    public Corridore(String nome) {
        this.nome = nome;
        tempi = new ArrayList<>();

    }

    public List<Duration> getTempi() {
        return tempi;
    }

    public String getNome() {
        return nome;
    }

    public Duration getTempoTotale() {
        Duration d=Duration.of(0, ChronoUnit.SECONDS);
        for (int i = 0; i < tempi.size(); i++) {
            d=d.plus(tempi.get(i));
        }
        return d;
    }
    public double getTempoTotaleDouble() {
        Duration d=Duration.of(0, ChronoUnit.SECONDS);
        for (int i = 0; i < tempi.size(); i++) {
            d=d.plus(tempi.get(i));
        }
        return d.toSeconds();
    }

    @Override
    public String toString() {
        return "Corridore{" +
                "nome='" + nome + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Corridore)) return false;
        if (this.getNome().equals(((Corridore)o).getNome())) {
            return true;
        } else return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    public void corriGiro(){
        tempi.add(generaDurataRandom());
    }
    public Duration generaDurataRandom(){
        //generatore
        Duration d1 =  Duration.ofMinutes(r.nextInt(3));
        //formattatore
        /*
        System.out.println( DateTimeFormatter
                .ofPattern("HH:mm:ss:SSS")
                .format(LocalTime.ofNanoOfDay(d1.toNanos()))
        );
         */
        return d1;
    }
}//end class
