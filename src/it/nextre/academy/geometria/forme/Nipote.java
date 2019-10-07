package it.nextre.academy.geometria.forme;

public class Nipote extends Punto3D {

    {
        System.out.println("Inizializzatore non statico di istanza di Nipote");
    }

    static {
        System.out.println("Inizializzatore statico di classe di Nipote");
    }
    /*
    static private int sasso;
    public static void main(String[] args) {
        System.out.println("Sasso");
        //Punto p=new Punto3D();
        sasso=0;
    }

     */
    public static void saluta(){
        System.out.println("Ciao");
    }
}//end class
