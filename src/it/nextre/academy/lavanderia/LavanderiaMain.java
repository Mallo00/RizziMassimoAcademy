package it.nextre.academy.lavanderia;

import it.nextre.academy.myUtil.DummyData;
import it.nextre.academy.myUtil.MyFormatter;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

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
        Cliente c1 = new Cliente(DummyData.getNome(), DummyData.getCognome());
        Cliente c2 = new Cliente(DummyData.getNome(), DummyData.getCognome());

        //creo n capi che il cliente porterà a lavare
        for (int i = 0; i < 10; i++) {
            Capo cap1 = new Capo();
            System.out.println(cap1);
            c1.portaALavare(cap1);
        }
        //
        Lavanderia lavello = new Lavanderia();
        lavello.lava(c1.getCesta());
        System.out.println("lavaggio finito");

        c1.getCapiLavatiPerPrezzo().forEach(System.out::println);

        System.out.println("La somma dei prezzi dei lavaggi dei capi di " + c1.getNome() + " " + c1.getCognome() + " è: "
                + MyFormatter.formattaDouble(lavello.getSommaPrezzi(c1)));


        List<String> catPuliti = c1.getCapiLavatiPerPrezzo()
                .stream()
                .map(new Function<Capo, String>() {//definisco la funzione da applicare
                    @Override
                    public String apply(Capo capo) {
                        return capo.getCategoria().name().toLowerCase();//otteniamo la categoria
                    }
                })
                //.peek(System.out::println)      //stampa ciò che passa
                //.filter(cat->cat.length()>7)
                .distinct() //tira via i doppioni. inutile in un set
                .collect(Collectors.toList());  //metti il filtrato in una lista

        catPuliti.forEach(System.out::println);//referenza a un metodo statico
        catPuliti.forEach(MyPrinter::stampaStatic);
        catPuliti.forEach(MyPrinter::stampaStatic);

        //referenza a un metodo d'istanza
        MyPrinter mp=new MyPrinter();
        catPuliti.forEach(mp::stampaIst);

        catPuliti.forEach(e1->MyPrinter.stampaStatic(e1));

    }//end main
}//end class

class MyPrinter {
    public static void stampaStatic(Object o) {
        System.out.println("item: " + o.toString());
    }
    public void stampaIst(Object o) {
        System.out.println("item: " + o.toString());
    }
}
