package it.nextre.academy.esercizi.cap15;


import it.nextre.academy.myUtil.dummyObj.DummyAlloggio;

public class Main15 {
    public static void main(String[] args) {
        // filtro degli hotel e scrivere i risultati a file
        AgenziaViaggi a = new AgenziaViaggi("MalloneTravels");
        creaAlloggi(a);
        //effettua il filtraggio e crea i file
        a.filtraCPU();
        //crea i file suddivisi per location
        //a.dividiPerLocation();

    }
    private static void creaAlloggi(AgenziaViaggi a) {
        while (a.getAlloggi().size() < 500) {
            a.addAlloggio(DummyAlloggio.getAlloggioRandom());
        }
    }
}//end class
