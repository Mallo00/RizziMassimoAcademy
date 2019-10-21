package it.nextre.academy.basi.file;

import it.nextre.academy.myUtil.DummyData;

import java.util.concurrent.atomic.AtomicInteger;

class DataExample {
    static AtomicInteger contatore = new AtomicInteger(0);
    int id;
    String nome;
    String cognome;
    String email;
    public static AtomicInteger getContatore() {
        return contatore;
    }

    public static void setContatore(AtomicInteger contatore) {
        DataExample.contatore = contatore;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    public DataExample(int id, String nome, String cognome, String email) {
        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
    }

    @Override
    public String toString() {
        return "DataExample{" +
                "contatore=" + contatore +
                ", id=" + id +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static DataExample getRandomDataExample() {
        return new DataExample(contatore.getAndIncrement(),DummyData.getCognome(),  DummyData.getNome(), DummyData.getEmail());
    }

}
