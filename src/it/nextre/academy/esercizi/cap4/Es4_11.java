package it.nextre.academy.esercizi.cap4;


import it.nextre.academy.myUtil.MyInput;
import it.nextre.academy.myUtil.MyLoadings;
import it.nextre.academy.myUtil.MyOutput;

import java.util.StringTokenizer;

public class Es4_11 {
    public static void main(String[] args) {
        System.out.println("Inserisci una frase da cammellare: ");
        String s = MyInput.leggiRiga().trim();
        String cam1 = cammellizza1(s);
        String cam2 = cammellizza2(s);
        String cam3 = cammellizza3(s);
        //System.out.println(cam);

    }

    public static String cammellizza1(String s) {
        long inizio1 = System.currentTimeMillis();
        String cammello;
        char[] vetCar;
        int nElem = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                nElem++;
            }
        }
        vetCar = new char[s.length() - nElem];

        int i = 0;
        for (int j = 0; j < s.length(); j++) {
            if (s.charAt(j) != ' ') {
                if (j != 0 && s.charAt(j - 1) == ' ') {
                    vetCar[i] = Character.toUpperCase(s.charAt(j));
                } else {
                    vetCar[i] = s.charAt(j);
                }
                i++;
            }
        }
        cammello = new String(vetCar);
        //MyOutput.stampaVettoreString(vetCammello);
        System.out.println(cammello);
        long fine1 = System.currentTimeMillis();
        double time1 = 1.0 * (fine1 - inizio1) / 1000;
        System.out.println("Primo: " + time1);
        return cammello;
    }

    /*
    public void correzione2(){
        String in=" ciao come va  uaglio".trim();
        String op="";
        String inizio;
        StringTokenizer st=new StringTokenizer(in);
        int giro=0;
        while (in.contains(" ")){
            if (){

            }
            String token=st.nextToken();
            if (giro++==0){

            }
        }
    }

     */
    public static String cammellizza2(String s) {
        long inizio2 = System.currentTimeMillis();
        String[] vetParole = s.split(" ");
        for (int i = 1; i < vetParole.length; i++) {
            char[] parola = new char[vetParole[i].length()];
            for (int j = 0; j < vetParole[i].length(); j++) {
                if (j == 0)
                    parola[j] = Character.toUpperCase(vetParole[i].charAt(0));
                else parola[j] = vetParole[i].charAt(j);
            }
            String s1 = new String(parola);
            vetParole[i] = s1;
        }
        String s1 = "";
        for (int i = 0; i < vetParole.length; i++) {
            s1 += vetParole[i];
        }
        s = s1;
        System.out.println(s);
        long fine2 = System.currentTimeMillis();
        double time2 = 1.0 * (fine2 - inizio2) / 1000;
        System.out.println("Secondo: " + time2);
        return s;
    }

    public void correzione3() {
        String in = " ciao come va  uaglio".trim();
        String op = "";
        String inizio;
        StringTokenizer st = new StringTokenizer(in);
        int giro = 0;
        while (st.hasMoreElements()) {
            String token = st.nextToken();
            if (giro++ == 0) {

            }
        }
    }

    public static String cammellizza3(String s) {
        long inizio3 = System.currentTimeMillis();
        StringTokenizer tk = new StringTokenizer(s);
        String[] parole = new String[tk.countTokens()];
        for (int i = 0; i < parole.length; i++) {
            parole[i] = tk.nextToken();
        }
        for (int i = 1; i < parole.length; i++) {
            char[] parola = new char[parole[i].length()];
            for (int j = 0; j < parole[i].length(); j++) {
                if (j == 0)
                    parola[j] = Character.toUpperCase(parole[i].charAt(0));
                else parola[j] = parole[i].charAt(j);
            }
            String s1 = new String(parola);
            parole[i] = s1;
        }
        String s1 = "";
        for (int i = 0; i < parole.length; i++) {
            s1 += parole[i];
        }
        s = s1;
        System.out.println(s);
        long fine3 = System.currentTimeMillis();
        double time3 = 1.0 * (fine3 - inizio3) / 1000;
        System.out.println("Terzo: " + time3);
        return s;
    }
}//end class
