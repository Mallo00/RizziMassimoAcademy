package it.nextre.academy.basi.xml;

import it.nextre.academy.myUtil.dummyObj.Lavoro;
import it.nextre.academy.myUtil.dummyObj.Umano;

public class PersonaDaEsportare extends Umano {
    Lavoro lavoro;

    public PersonaDaEsportare(String nome, String cognome, int eta, double peso, double altezza) {
        super(nome, cognome, eta, peso, altezza);
    }

    public PersonaDaEsportare(String nome, String cognome, Lavoro lavoro) {
        super(nome, cognome);
        this.lavoro = lavoro;
    }

    public PersonaDaEsportare(String nome, String cognome, int eta) {
        super(nome, cognome, eta);
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    @Override
    public String getCognome() {
        return super.getCognome();
    }

    @Override
    public void setCognome(String cognome) {
        super.setCognome(cognome);
    }

    @Override
    public int getEta() {
        return super.getEta();
    }

    @Override
    public void setEta(int eta) {
        super.setEta(eta);
    }

    @Override
    public double getPeso() {
        return super.getPeso();
    }

    @Override
    public void setPeso(double peso) {
        super.setPeso(peso);
    }

    @Override
    public double getAltezza() {
        return super.getAltezza();
    }

    @Override
    public void setAltezza(double altezza) {
        super.setAltezza(altezza);
    }

    @Override
    public String toString() {
        return "PersonaDaEsportare{ " +
                "\n\tNome: "+ super.getNome() +
                "\n\tCognome: "+super.getCognome() +
                "\n\tEta: "+super.getEta() +
                "\n\tPeso: "+super.getPeso() +
                "\n\tlavoro: " + lavoro +
                "\n\tStipendio: "+lavoro.getStipendio()+
                "€\n}";
    }

    @Override
    public int compareTo(Umano o) {
        return super.compareTo(o);
    }

    @Override
    public int compare(Umano o1, Umano o2) {
        return super.compare(o1, o2);
    }
}//end class
