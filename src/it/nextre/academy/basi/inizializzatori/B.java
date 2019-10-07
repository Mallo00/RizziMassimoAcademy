package it.nextre.academy.basi.inizializzatori;

public class B extends A {

    {
        System.out.println("Inizializzatore non statico di istanza di B");
    }

    static {
        System.out.println("Inizializzatore statico di classe di B");
    }
    B(){
        System.out.println("Costruttore di B");
    }

    public B(int i) {
        System.out.println("sasso"+ i);
    }

    public static void saluta(){
        System.out.println("Saluti da B");
    }
}//end class
