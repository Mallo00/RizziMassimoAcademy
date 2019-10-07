package it.nextre.academy.esercizi.cap4;

import it.nextre.academy.myUtil.MyInput;

public class Es4_16 {
    public static void main(String[] args) {
        int base = 0;
        int esp = 0;
        System.out.println("inserisci la base");
        base = MyInput.leggiIntero();
        System.out.println("inserisci esp");
        esp = MyInput.leggiIntero();
        System.out.println(calcolaEsp(base, esp));
        System.out.println(calcolaEspRicorsiva(base, esp));
    }
    private static double calcolaEsp(int base, int esp) {
        double ris;
        if (esp != 0) {
            int espPos = Math.abs(esp);
            ris = 1;
            for (int i = 0; i < espPos; i++) {
                ris *= base;
            }
            if (esp > 0) {
                return ris;
            } else {
                return (1 / ris);
            }
        } else return 1;
    }
    private static double calcolaEspRicorsiva(int base, int esp) {
        if (esp == 0) return 1;
        if (esp == 1) return base;
        if (esp > 0)
            return base * calcolaEspRicorsiva(base, esp - 1);
        else
            return 1.0 / base * calcolaEspRicorsiva(base, esp + 1);
    }



}//end class
