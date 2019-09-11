package it.nextre.academy.myUtil;

import java.util.Scanner;

public class MyInput {

    public static  String leggiRiga(){
        Scanner s=new Scanner(System.in);
        return s.nextLine();
    }

    /**
     * @param String tmp è l'ingresso da verificare. viene raccolto come stringa e viene esaminata la sua composizione
     * @return ritorna il numero inserito verificato positivo
     */
    public static int leggiInteroPositivo(){
        Scanner s = new Scanner(System.in);
        String tmp= s.nextLine().trim();
        String numeri="0123456789";
        for (int i=0; i<tmp.length();i++) {
            if (numeri.indexOf(tmp.charAt(i))<0){
                //trovato carattere non valido
                System.out.println("Input non valido");
                return leggiInteroPositivo();//ricorsivo
            }
        }
        //se arrivo qui tmp è una sequenza do numeri positiva
        return Integer.parseInt(tmp);
    }
    public static int leggiIntero() {
        Scanner s = new Scanner(System.in);
        String tmp = s.nextLine().trim();
        String numeri="0123456789";
        for(int i=0;i<tmp.length();i++ ){
            if(numeri.indexOf(tmp.charAt(i)) <0  ){
                if (i==0 && (tmp.charAt(i)=='+' || tmp.charAt(i)=='-') ) {}else {
                    //trovato carattere non valido
                    System.out.println("Input non valido, riprova");
                    return leggiIntero();
                }
            }
        }
        //se arrivo qui tmp è una sequenza di numeri positiva
        return Integer.parseInt(tmp);
    }



}//end class
