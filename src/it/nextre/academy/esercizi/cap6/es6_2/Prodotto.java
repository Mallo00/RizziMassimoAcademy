package it.nextre.academy.esercizi.cap6.es6_2;

public abstract class Prodotto {
    private String name;
    private double price;
    private boolean rent;
    Prodotto(String name, double price) {
        this.name = name;
        this.price =price;
        rent=false;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isRent() {
        return rent;
    }

    public void setRent(boolean rent) {
        this.rent = rent;
    }
}//end class
