package it.nextre.academy.myUtil.dummyObj;

public enum Lavoro {
    OPERAIO(900),
    PROGRAMMATORE(1700),
    DOTTORE(2000),
    INSEGNANTE(1500),
    SCRITTORE(1400),
    ATTORE(100000000),
    PILOTA(3000),
    PARROCO(1);

    Lavoro(double stipendio) {
        this.stipendio = stipendio;
    }

    private double stipendio;

    public double getStipendio() {
        return stipendio;
    }
}
