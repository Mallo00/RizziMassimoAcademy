package it.nextre.academy.esercizi.cap15;

public enum TipoStruttura {
    HOTEL("Hotel"),
    BaB("BaB"),
    APPARTAMENTO("Appartamento");

    TipoStruttura(String value) {
        this.value = value;
    }

    private String value;

    public String getValue() {
        return value;
    }

}
