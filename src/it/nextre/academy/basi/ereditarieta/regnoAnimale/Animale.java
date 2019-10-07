package it.nextre.academy.basi.ereditarieta.regnoAnimale;

//simulazione classe animale per la scheda tecnica di un vet.
public abstract class Animale {
    String nome;
    String padrone;
    String famigliaAppartenenza;

    //non so come ogni animale saluta, quindi astratto
    public abstract String saluta();
}//end class
