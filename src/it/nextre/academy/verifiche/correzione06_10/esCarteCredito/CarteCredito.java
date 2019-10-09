package it.nextre.academy.verifiche.correzione06_10.esCarteCredito;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class CarteCredito {

    private int nCarta;
    private String shop;
    private String categoria;
    private Utente intestatario;
    private Date ultimoUtilizzo;
    private Date scadenza;
    private int credito;


    public CarteCredito(int nCarta, String shop, String categoria, Utente intestatario) {
        this.nCarta = nCarta;
        this.shop = shop;
        this.categoria = categoria;
        this.intestatario = intestatario;
    }

    public CarteCredito(CarteCredito c, Calendar cal) {
        this.nCarta = c.nCarta;
        this.shop = c.shop;
        this.categoria = c.categoria;
        this.intestatario = c.intestatario;
        this.credito = 0;
        this.scadenza=cal.getTime();
    }

    public int getnCarta() {
        return nCarta;
    }

    public String getShop() {
        return shop;
    }

    public String getCategoria() {
        return categoria;
    }

    public Utente getIntestatario() {
        return intestatario;
    }

    public Date getUltimoUtilizzo() {
        return ultimoUtilizzo;
    }

    public Date getScadenza() {
        return scadenza;
    }

    public int getCredito() {
        return credito;
    }
}//end class
