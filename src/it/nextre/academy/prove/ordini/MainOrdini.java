package it.nextre.academy.prove.ordini;

public class MainOrdini {
    public static void main(String[] args) {
        AziendaSpedizioni as = AziendaSpedizioni.getInstance();
        as.creaProdotti(10);
        as.stampaCatalogo();
        as.creaUtenti(1);

        for (int i = 0; i < as.getUtenti().size(); i++) {
            as.acquisto(as.getUtenti().get(i));
        }

    }//end main

}//end class
