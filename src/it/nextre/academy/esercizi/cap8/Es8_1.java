package it.nextre.academy.esercizi.cap8;

public class Es8_1 {
    public static void main(String[] args) {
        int dividendo = 5;
        int divisore = 0;
        try {
            System.out.println(dividendo/divisore);
        } catch (ArithmeticException e) {
            System.out.println("Esecuzione terminata");
        }

    }
}//end class
