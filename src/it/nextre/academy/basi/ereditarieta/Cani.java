package it.nextre.academy.basi.ereditarieta;

import it.nextre.academy.basi.ereditarieta.regnoAnimale.Animale;

//una classe non astratta figlia di una classe astratta DEDE implementare i metodi astratti che eredita
public class Cani extends Animale {
    @Override
    public String saluta() {
        return "Bau Bau, wof, scodinzola...";
    }
    public String abbaia(){
        return "Bau";
    }
}//end class
