package it.nextre.academy.basi.ereditarieta.regnoAnimale;

//una classe non astratta figlia di una classe astratta DEDE implementare i metodi astratti che eredita
public class Gatto extends Animale {
    @Override
    public String saluta() {
        return "MIao Miao e se ne va...";
    }

    public String miagola(){
        return "Miao";
    }
}//end class
