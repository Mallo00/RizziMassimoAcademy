package it.nextre.academy.esercizi.cap6.es6_2;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String name;
    private List<Prodotto> noleggiati;
    Cliente(String name){
        this.name=name;
        noleggiati=new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addNoleggio(Prodotto n) {
        noleggiati.add(n);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "name='" + name + '\'' +
                ", noleggiati=" + noleggiati +
                '}';
    }
}//end class
