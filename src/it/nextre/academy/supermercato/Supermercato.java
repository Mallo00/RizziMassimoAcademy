package it.nextre.academy.supermercato;

import it.nextre.academy.myUtil.MyFormatter;
import it.nextre.academy.myUtil.MyOutput;

import java.util.Random;

//occorre salvare i codici a barre in una lista, non gli oggetti
public class Supermercato {
    public static void main(String[] args) {
        Random r=new Random();
        Prodotto p1=new Prodotto().getInstance();
        Prodotto[] scaffale= {new Prodotto("fagioli", BarCodeGenerator.getInstance().newCode(), 5, 0.3) };
        //creare prodotti qui e poi aggiungerli tramite p1
        //p1.creaBarCode();
      //  Cellulare c1=new Cellulare(6,6,128,"Android","Mate 10 Pro", , 850, 170);
        //c1.toString();
        final int N_PEZZI=8;
        Prodotto[] carrello=new Prodotto[N_PEZZI];
        System.out.println("FACCIO LA SPESA");
        for (int i = 0; i < carrello.length; i++) {
            carrello[i]=scaffale[r.nextInt(scaffale.length)];
        }
        for (int i = 0; i < carrello.length; i++) {
            System.out.println(carrello[i]);
        }
        Cassa cassa1=new Cassa();
        cassa1.addProdotti(carrello);
        System.out.println("Pagare: "+ MyFormatter.formattaDouble(cassa1.getTot()));
    }
}//end class
