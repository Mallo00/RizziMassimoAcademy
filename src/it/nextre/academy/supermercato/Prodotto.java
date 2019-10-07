package it.nextre.academy.supermercato;

import java.util.Random;

public class Prodotto {
    private String nome;
    private String barCode;
    private double prezzo;
    private double pesoKg;
    private String categoria;
    private Prodotto instance = null;
    private ListaProdotti db;
    private Random r = new Random();

    Prodotto() {
        db = new ListaProdotti();
    }

    Prodotto(String nome, String barCode, double prezzo, double pesoKg) {
        this.nome=nome;
        this.barCode = barCode;
        this.prezzo = prezzo;
        this.pesoKg = pesoKg;
        this.categoria="sconosciuta";
    }
/*
    public String creaBarCode() {
        char[] charCode = new char[12];
        for (int i = 0; i < 12; i++) {
            charCode[i] = Alphabet.numbers().charAt(r.nextInt(Alphabet.numbers().length()));
        }
        String code = new String(charCode);
        System.out.println(code);
        return code;
    }

 */

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getBarCode() {
        return barCode;
    }

    private void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public double getPesoKg() {
        return pesoKg;
    }

    public void setPesoKg(double pesoKg) {
        this.pesoKg = pesoKg;
    }

    public String getCategoria() {
        return categoria;
    }

    protected void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public synchronized Prodotto getInstance() {
        if (instance == null) {
            instance = new Prodotto();
        }
        return instance;
    }

    public void compraP() {
        Prodotto p = new Prodotto();
        db.add(p);
    }
    @Override
    public String toString() {
        return "Prodotto{" +
                "nome='" + nome + '\'' +
                ", barCode='" + barCode + '\'' +
                ", prezzo=" + prezzo +
                ", peso=" + pesoKg +
                ", categoria='" + categoria + '\'' +
                '}';
    }
}//end class