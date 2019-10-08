package it.nextre.academy.myUtil;

public class Umano {
    private int age;
    private String nome;
    private String cognome;
    private double peso;
    private double altezza;

    public Umano() {

    }

    public Umano(String nome) {
        this.nome = nome;
    }

    public Umano(int age, String nome, String cognome, double peso, double altezza) {
        this.age = age;
        this.nome = nome;
        this.cognome = cognome;
        this.peso = peso;
        this.altezza = altezza;
    }

    @Override
    public String toString() {
        return "Umano{" +
                "Nome=" + nome +
                ", cognome='" + cognome + '\'' +
                ", eta='" + age + " anni" + '\'' +
                ", peso=" + peso + "kg" +
                ", altezza=" + altezza + "cm" +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getcognome() {
        return cognome;
    }

    public void setcognome(String cognome) {
        this.cognome = cognome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }
}//end class
