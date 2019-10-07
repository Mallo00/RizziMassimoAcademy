package it.nextre.academy.basi.inizializzatori;

public class A {
    {
        System.out.println("Inizializzatore non statico di istanza di A");
    }

    static {
        System.out.println("Inizializzatore statico di classe di A");
    }
    A(){
        System.out.println("Costruttore di A");
    }
    public static void saluta(){
        System.out.println("Saluti da A");
    }









}//end class
