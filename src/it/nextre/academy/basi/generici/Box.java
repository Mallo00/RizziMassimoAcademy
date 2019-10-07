package it.nextre.academy.basi.generici;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Box<T> /*tipo, è un placeholder*/ {
    //resituisce il tipo dell'istanza dell'oggetto
    private T value;

    public Box(T param) {
        this.value = param;
        //un'interfaccia=oggetto che implementa l'interfaccia
        List<String> emails = new ArrayList<>();

        //  List l1=new List() {}è da definire
        List<String> l1 = new LinkedList<String>();
        //una lista effettua le medesime operazioni basilari, in ogni momento e con qualunque tio di variabile==> generico
    }

    public T getValue() {
        return value;
    }
}//end class
