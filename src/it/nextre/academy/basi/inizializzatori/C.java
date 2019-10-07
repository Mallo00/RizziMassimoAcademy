package it.nextre.academy.basi.inizializzatori;

public class C extends  B{
    {
        System.out.println("Inizializzatore non statico di istanza di C");
    }

    static {
        System.out.println("Inizializzatore statico di classe di C");
    }
    C(){
        System.out.println("Costruttore di C");
    }
    public static void saluta(){
        System.out.println("Saluti da C");
    }
}//end class
