package it.nextre.academy.esercizi.cap15;

import it.nextre.academy.myUtil.MyFormatter;

public class Alloggio {
    private String nome;
    private short classificazione = 0;
    private Location location;
    private double prezzoPerNotte;
    private TipoStruttura tipoStrutura;
    private boolean parcheggioIncluso;
    private boolean freeWifi;
    private double distanza;

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Alloggio) {
            if (((Alloggio) obj).getNome().equals(this.getNome()) && ((Alloggio) obj).getLocation().equals(this.getLocation()) && ((Alloggio) obj).getTipoStrutura().equals(this.getTipoStrutura())) {
                return true;
            } else return false;
        } else return false;
    }

    @Override
    public String toString() {
        return "Alloggio: " + nome +
                "\n\tclassificazione=" + classificazione +
                "\n\tlocation=" + location +
                "\n\tprezzoPerNotte=" + MyFormatter.formattaDouble(prezzoPerNotte) + "€" +
                "\n\ttipoStrutura=" + tipoStrutura +
                "\n\tparcheggioIncluso=" + parcheggioIncluso +
                "\n\tfreeWifi=" + freeWifi +
                "\n\tdistanza=" + MyFormatter.formattaDouble(distanza) + "m\n";
    }

    public double getDistanza() {
        return distanza;
    }


    public Alloggio(String nome, short classificazione, Location location, double prezzoPerNotte, TipoStruttura tipoStrutura, boolean parcheggioIncluso, boolean freeWifi, double distanza) {
        this.nome = nome;
        this.classificazione = classificazione;
        this.location = location;
        this.prezzoPerNotte = prezzoPerNotte;
        this.tipoStrutura = tipoStrutura;
        this.parcheggioIncluso = parcheggioIncluso;
        this.freeWifi = freeWifi;
        this.distanza = distanza;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public short getClassificazione() {
        return classificazione;
    }


    public Location getLocation() {
        return location;
    }

    public double getPrezzoPerNotte() {
        return prezzoPerNotte;
    }


    public TipoStruttura getTipoStrutura() {
        return tipoStrutura;
    }


    public boolean isParcheggioIncluso() {
        return parcheggioIncluso;
    }


    public boolean isFreeWifi() {
        return freeWifi;
    }

    static boolean isCloser(Alloggio a, double dist) {
        return a.getDistanza() < dist;
    }


    static boolean hasFreeWifi(Alloggio a) {
        return a.isFreeWifi();
    }


    static boolean hasFreeParking(Alloggio a) {
        return a.isParcheggioIncluso();
    }


    static boolean isClassifiedAs(Alloggio a, short c) {
        return a.getClassificazione() == c;
    }


    static boolean isStruttura(Alloggio a, TipoStruttura ts) {
        return a.getTipoStrutura().equals(ts);
    }


    static boolean isLocated(Alloggio a, Location l) {
        return a.getLocation().equals(l);
    }


    static boolean isLowerThan(Alloggio a, double price) {
        return a.getPrezzoPerNotte() < price;
    }
}//end class
