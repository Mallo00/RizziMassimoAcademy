package it.nextre.academy.verifiche.verifica15_10.es13;


import it.nextre.academy.myUtil.DummyData;

public class Main13 {
    private static final int N_PARTECIPANTI = 5;

    public static void main(String[] args) {

        //creo l'unica istanza di corsa che dovrà esistere
        Corsa c = Corsa.getInstance();
        //aggiungo partecipanti univoci fino al numero desiderato
        while (c.getPartecipanti().size() < N_PARTECIPANTI) {
            c.addPartecipante(new Auto(DummyData.getNome()));
        }
        //inizia la gara
        c.corsa();


    }
}//end class
