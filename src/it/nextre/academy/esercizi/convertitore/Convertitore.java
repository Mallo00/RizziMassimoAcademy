package it.nextre.academy.esercizi.convertitore;

import it.nextre.academy.myUtil.MyInput;

public class Convertitore {
    public static String[] metro = {"metri", "millimetri", "centimetri", "decametri", "ettometri", "kilometri"};
    public static String[] litro = {"litro", "millilitro", "centilitro", "decilitro", "ettolitro"};
    public static String[] grammo = {"grammi", "decagrammi", "ettogrammi", "kilogrammi", "decagrammi", "ettogrammi", "megagrammi"};
    public static String[] secondi = {"secondi", "minuti", "ore", "giorni", "settimane", "mesi", "anni"};
    public static String[] dimImperiali = {"miglia", "piedi", "pollici"};
    public static String[] liqImperiali = {"galloni", "oncia"};


    public static void main(String[] args) {
        double input;
        int misura = getMisura();


        input = MyInput.leggiDouble();
        System.out.println(input);
    }

    public static int getMisura() {
        int misura = 0;
        System.out.println("Che cosa vuoi inserire? ");
        System.out.println
                        ("1) metri\n" +
                        "2) litri\n" +
                        "3) grammi\n" +
                        "4) secondi\n" +
                        "5) galloni");
        misura = MyInput.leggiInteroPositivo();
        if (misura>5){
            System.out.println("valore non valido");
            return getMisura();
        }
        return misura;
    }
}//end class
