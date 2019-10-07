package it.nextre.academy.esercizi.random;

import it.nextre.academy.geometria.forme.Punto;

public class Reference {
    Punto p1;
    Punto p2;
    Punto p3;
    public Reference() {
        p1 = new Punto();
        p2 = new Punto();

        p1.setX(5);
        p1.setY(6);
        p2.setX(1);
        p2.setY(2);
        p3=p2;
    }

//    Punto p3=new Punto();
// : 10/09/2019 creare metodo per modificare punti utilizzando getters e setters

}