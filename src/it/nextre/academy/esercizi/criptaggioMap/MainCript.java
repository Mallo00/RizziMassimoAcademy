package it.nextre.academy.esercizi.criptaggioMap;

public class MainCript {
    public static void main(String[] args) {
        //codificare con una mappa e ottenere la mappa opposta per decodificare
        MappaChiavi mappaChiavi=MappaChiavi.getInstance();
        String frase="Bingo bongo termometar!";
        System.out.println(frase);
        String criptata=MappaChiavi.cripta(frase);
        System.out.println("Criptata: "+criptata);
        System.out.println("decriptata: "+MappaChiavi.decripta(criptata));



    }
}//end class
