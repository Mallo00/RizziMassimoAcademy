package it.nextre.academy.lavanderia;

import it.nextre.academy.esercizi.cap5.es5_4_observable.EstrattoreG;
import it.nextre.academy.myUtil.MyOutput;

import java.time.LocalDateTime;
import java.util.Random;

public class Capo {
    private static long contatore = 0;//NESSUNO, se non il metodo dedicato, dovrà usare questa variabile

    private synchronized static long nextCartellino() {
        return ++contatore;
    }

    private long cartellino = nextCartellino();
    private Materiale materiale;
    private Categoria categoria;
    private Colore colore;
    private double prezzo;
    private boolean pulito;
    private LocalDateTime dataLavaggio;

    public Capo(Materiale materiale, Categoria categoria, Colore colore) {
        this.cartellino = nextCartellino();
        this.materiale = materiale;
        this.categoria = categoria;
        this.colore = colore;
    }

    public Capo() {
        //se richiamo un capo vuoto, ne creo uno completamente randomico
        this(getMaterialeRandom(), getCategoriaRandom(), getColoreRandom());
    }

    @Override
    public String toString() {
        return "Capo{" +
                "cartellino=" + cartellino +
                ", materiale=" + materiale +
                ", categoria=" + categoria +
                ", colore=" + colore +
                ", prezzo=" + MyOutput.formattaDouble(prezzo) +
                ", pulito=" + pulito +
                ", dataLavaggio=" + dataLavaggio +
                '}';
    }

    public boolean isPulito() {
        return pulito;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public LocalDateTime getDataLavaggio() {
        return dataLavaggio;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public void setDataLavaggio(LocalDateTime dataLavaggio) {
        this.dataLavaggio = dataLavaggio;
    }

    public Materiale getMateriale() {
        return materiale;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public Colore getColore() {
        return colore;
    }

    public void setPulito(boolean pulito) {
        this.pulito = pulito;
    }

    private static Materiale getMaterialeRandom() {
        return new Estrattore<Materiale>().getOne(Materiale.values());
    }

    private static Categoria getCategoriaRandom() {
        return new Estrattore<Categoria>().getOne(Categoria.values());
    }

    private static Colore getColoreRandom() {
        return new Estrattore<Colore>().getOne(Colore.values());
    }

}//end class

class Estrattore<T> {
    private static Random r = new Random();

    T getOne(T[] arr) {
        return arr[r.nextInt(arr.length)];
    }

}
