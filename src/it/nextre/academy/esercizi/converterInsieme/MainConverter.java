package it.nextre.academy.esercizi.converterInsieme;

public class MainConverter {
    public static void main(String[] args) {
        Converter comv = new Converter();

        String risultato=comv.converti(20,"m","Km");
        System.out.println(risultato);
    }
}//end class
