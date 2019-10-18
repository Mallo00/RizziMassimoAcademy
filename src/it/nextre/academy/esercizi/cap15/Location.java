package it.nextre.academy.esercizi.cap15;

public enum Location {
    MARE("Mare"),
    MONTAGNA("Montagna"),
    PIANURA("Pianura"),
    LAGO("Lago");

    Location(String value) {
        this.value = value;
    }

    private String value;


    public String getValue() {
        return value;
    }
}
