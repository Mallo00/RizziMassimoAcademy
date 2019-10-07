package it.nextre.academy.esercizi.cap6.es6_2;

public class CD extends Prodotto implements Noleggiabili {
    private boolean rent;
    private String name;
    private double weeklyPrice;

    CD(String name, double weeklyPrice) {
        super(name, weeklyPrice);
        this.name = name;
        this.weeklyPrice = weeklyPrice;
    }

    @Override
    public boolean isRent() {
        return rent;
    }

    @Override
    public void noleggia(Cliente c) {
        if (!rent) {
            rent = true;
        }
    }

    @Override
    public String toString() {
        return "CD{" +
                "rent=" + rent +
                ", name='" + name + '\'' +
                ", weeklyPrice=" + weeklyPrice +
                '}';
    }
}//end class
