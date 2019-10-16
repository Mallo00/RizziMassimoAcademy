package it.nextre.academy.myUtil;

import java.util.Random;
import java.util.Scanner;

/**
 *  format number exception da fixare
 *
 * @see #leggiInteroPositivo()
 * @see #leggiIntero()
 */

public class MyInput {

    public static String leggiRiga() {
        Scanner s = new Scanner(System.in);
        return s.nextLine();
    }

    public static char carattSiONo() {
        Scanner s = new Scanner(System.in);
        System.out.println("Sì o no? (s/n) ");
        Character carattSN;
        carattSN = Character.toLowerCase(s.next().trim().charAt(0));
        if (carattSN != 's' && carattSN != 'n') {
            System.out.println("Input non valido");
            return carattSiONo();
        }
        /**
         * @deprecated
         * char sn=s.next().charAt(0);
         *         if (sn != 's' && sn != 'n') {
         *             System.out.println("Input non valido");
         *             return  siONo();
         *         }
         *         return sn;
         */
        return carattSN;
    }

    public static char leggiCarattere() {
        Scanner s = new Scanner(System.in);
        Character c;
        c = Character.toLowerCase(s.next().charAt(0));
        return c;
    }

    public static String stringaSiONo() {
        Scanner s = new Scanner(System.in);
        System.out.println("Sì o no? (s/n) ");
        String siOno = s.nextLine().toLowerCase().trim();
        if (!siOno.equals("si") && !siOno.equals("no") && !siOno.equals("sì")) {
            System.out.println("Input non valido");
            return stringaSiONo();
        }
        /**
         * @deprecated
         * char sn=s.next().charAt(0);
         *         if (sn != 's' && sn != 'n') {
         *             System.out.println("Input non valido");
         *             return  siONo();
         *         }
         *         return sn;
         */
        return siOno;
    }


    /**
     * param s tmp è l'ingresso da verificare. viene raccolto come stringa e viene esaminata la sua composizione
     *
     * @return ritorna il numero inserito verificato positivo
     */
    public static int leggiInteroPositivo() {
        Scanner s = new Scanner(System.in);
        String tmp = s.nextLine().trim();
        String numeri = "0123456789";
        for (int i = 0; i < tmp.length(); i++) {
            if (numeri.indexOf(tmp.charAt(i)) < 0) {
                //trovato carattere non valido
                System.out.println("Input non valido");
                return leggiInteroPositivo();//ricorsivo
            }
        }
        //se arrivo qui tmp è una sequenza do numeri positiva
        try {
            return Integer.parseInt(tmp);
        } catch (NumberFormatException e) {
            //trovato carattere non valido
            System.out.println("Input non valido");
            return leggiInteroPositivo();//ricorsivo
        }
    }


    public static double leggiDoublePositivo() {
        Scanner s = new Scanner(System.in);
        String tmp = s.nextLine().trim();
        String numeri = ".0123456789";
        for (int i = 0; i < tmp.length(); i++) {
            if (numeri.indexOf(tmp.charAt(i)) < 0) {
                //trovato carattere non valido
                System.out.println("Input non valido");
                return leggiDoublePositivo();//ricorsivo
            }
        }
        //se arrivo qui tmp è una sequenza do numeri positiva
        try {
            return Double.parseDouble(tmp);
        } catch (NumberFormatException e) {
            //trovato carattere non valido
            System.out.println("Input non valido");
            return leggiDoublePositivo();//ricorsivo
        }

    }
    public static double leggiDouble() {
        Scanner s = new Scanner(System.in);
        String tmp = s.nextLine().trim();
        String numeri = ".-0123456789";
        for (int i = 0; i < tmp.length(); i++) {
            if (numeri.indexOf(tmp.charAt(i)) < 0) {
                //trovato carattere non valido
                System.out.println("Input non valido");
                return leggiDoublePositivo();//ricorsivo
            }
        }
        //se arrivo qui tmp è una sequenza do numeri positiva
        try {
            return Double.parseDouble(tmp);
        } catch (NumberFormatException e) {
            //trovato carattere non valido
            System.out.println("Input non valido");
            return leggiDoublePositivo();//ricorsivo
        }
    }

    public static int leggiIntero() {
        Scanner s = new Scanner(System.in);
        String tmp = s.nextLine().trim();
        String numeri = "0123456789";
        for (int i = 0; i < tmp.length(); i++) {
            if (numeri.indexOf(tmp.charAt(i)) < 0) {
                if (i == 0 && (tmp.charAt(i) == '+' || tmp.charAt(i) == '-')) {
                } else {
                    //trovato carattere non valido
                    System.out.println("Input non valido, riprova");
                    return leggiIntero();
                }
            }
        }
        //se arrivo qui tmp è una sequenza di numeri positiva
        try {
            return Integer.parseInt(tmp);
        } catch (NumberFormatException e) {
            //trovato carattere non valido
            System.out.println("Input non valido");
            return Integer.parseInt(tmp);//ricorsivo
        }
    }


}//end class
