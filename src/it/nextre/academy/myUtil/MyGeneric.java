package it.nextre.academy.myUtil;

import java.util.Random;
import java.util.Scanner;

public class MyGeneric {
    public static String stringaSiONo() {
        Scanner s = new Scanner(System.in);
        System.out.println("Sì o no? (s/n) ");
        String siOno = s.nextLine().toLowerCase().trim();
        if (!siOno.equals("si") && !siOno.equals("no") && !siOno.equals("sì")) {
            System.out.println("Input non valido");
            return stringaSiONo();
        }
        return siOno;
    }

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


    public static int leggiIntero2() {
        Scanner s = new Scanner(System.in);
        String tmp = s.nextLine().trim();
        String numeri = "0123456789";
        //se arrivo qui tmp è una sequenza di numeri positiva
        try {
            return Integer.parseInt(tmp);
        } catch (NumberFormatException e) {
            //trovato carattere non valido
            System.out.println("Input non valido");
            return Integer.parseInt(tmp);//ricorsivo
        }
    }

    public static double getRandomTemp(double tempBase, double delta) {
        double temp = 0, base = tempBase, maxscarto = delta, scarto;
        Random r = new Random();
        scarto = r.nextDouble() * maxscarto;
        if (r.nextBoolean()) {
            //true, aggiungo
            temp = base + scarto;
        } else {
            //sottraggo
            temp = base - scarto;
        }
        return temp;
    }
}//end class
