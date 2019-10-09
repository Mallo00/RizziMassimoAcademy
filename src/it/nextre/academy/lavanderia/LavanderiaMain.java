package it.nextre.academy.lavanderia;

import it.nextre.academy.esercizi.randomData.DummyData;

public class LavanderiaMain {
    /*
    gestire una lavanderia e suddividere i capi per ogni cliente
    ogni capo avrà
        una categoria
        un colore
        un materiale (lana, cotone, acrilico, lino e seta...)
        attributo di pulito
        data e ora ultimo lavaggio
    ordinare i capi per categoria, colore e materiale
    estrarre un capo dalla cesta e lavarlo
     */
    public static void main(String[] args) {
        Cliente c1=new Cliente(DummyData.getNome(), DummyData.getCognome());
        Cliente c2=new Cliente(DummyData.getNome(), DummyData.getCognome());
        //c1.portaAlavare(new Capo());
        for (int i = 0; i < 10; i++) {
            Capo cap1=new Capo();
            System.out.println(cap1);
            c1.portaALavare(cap1);
        }

        Lavanderia lavello=new Lavanderia();
        lavello.lava(c1.getCesta());
        System.out.println("lavaggio finito");

        c1.getCapiLavatiPerPrezzo().forEach(System.out::println);


    }//end main
}//end class
