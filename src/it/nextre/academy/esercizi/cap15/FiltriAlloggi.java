package it.nextre.academy.esercizi.cap15;

public enum FiltriAlloggi {
    CLASSIFICAZIONE("Classificazione"),
    LOCATION("Location"),
    DISTANZA("Distanza"),
    PREZZO_PER_NOTTE("Prezzo per notte"),
    TIPO_STRUTTURA("Tipo struttura"),
    NOME("Nome"),
    PARCHEGGIO_INCLUSO("Parcheggio incluso"),
    FREEWIFI("Free Wifi");

    FiltriAlloggi(String value) {
        this.value = value;
    }


    private String value;

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value + '\'';
    }
}
