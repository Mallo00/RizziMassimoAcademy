package it.nextre.academy.basi.generici;

import java.util.ArrayList;

public class Generici {
    public static void main(String[] args) {
        Undo u = new Undo(5);
        for (int i = 0; i < 5; i++) {
            u.add(i);
        }


        //le quadre permettono di specificare il tipo degli oggetti che si vanno a utilizzare
        ArrayList<String> iscritti = new ArrayList<String>();//accetta una specifica la volo
        ArrayList<Double> prezzi = new ArrayList<>();//accettabile solamente lo stesso tipo, a destra èsottinteso
        ArrayList items = new ArrayList<>();//lista di oggetti
        ArrayList items1 = new ArrayList();//lista di oggetti

        iscritti.add("Pierino Penati");
        prezzi.add(10d);
        //carico degli oggetti, ma perdono le proprietà
        items.add(iscritti);
        items.add(prezzi);
        items.add("Valerio");

        ArrayList<Number> numeri = new ArrayList<>();
        numeri.add(5);//numeri.add(new Integer(5))
        numeri.add(5d);//numeri.add(new Double(5))
        numeri.add(5l);//numeri.add(new Long(5))
        //ritorna un numero, non ha i metodi della classe di appartenenza perchè numeri è object


        System.out.println(numeri.get(2).getClass());
        //devo discriminare in base al prezzo, ma è troppo tedioso
        for (Number n :
                numeri) {
            if (n instanceof Integer) {
                ((Integer) n).compareTo(6);
            }
            if (n instanceof Double) {
                ((Double) n).compareTo(6D);
            }
            if (n instanceof Long) {
                ((Long) n).compareTo(6L);
            }
        }

    }
}//end class
