package it.nextre.academy.esercizi.targhe;

import it.nextre.academy.myUtil.MyInput;
import java.io.FileWriter;
import java.io.IOException;

public class GeneraTarghe {
    public static void main(String[] args) throws InterruptedException, IOException {
        System.out.println("Quante targhe vuoi stampare?");
        int n = MyInput.leggiInteroPositivo();
        char l1 = 'A';
        char l2 = 'A';
        char l3 = 'A';
        char l4 = 'A';
        int numTarghe = 0;
        FileWriter fw = new FileWriter("targhe.txt", true);
        generaTarghe(n, l1, l2, l3, l4, numTarghe, fw);
    }//end main

    /**
     * Metodo che genera targhe univoche
     *
     * @param n
     * @param l1
     * @param l2
     * @param l3
     * @param l4
     * @param numTarghe
     */
    public static void generaTarghe(int n, char l1, char l2, char l3, char l4, int numTarghe, FileWriter fw) throws IOException {
        System.out.println("Inizio generazione targhe");
        long inizio = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            if (numTarghe < 999)
                numTarghe++;
            else {
                numTarghe = 0;
                if (numTarghe == 0) {
                    l4 = (char) (l4 + 1);
                    if (l4 == 'Z') {
                        l4 = 'A';
                        l3 = (char) (l3 + 1);
                        if (l3 == 'Z') {
                            l3 = 'A';
                            l2 = (char) (l2 + 1);
                            if (l2 == 'Z') {
                                l2 = 'A';
                                l1 = (char) (l1 + 1);
                            }
                        }
                    }
                }
            }
            System.out.println(l1 + "" + l2 + "" + formatta(numTarghe) + "" + l3 + "" + l4 + "\r\n");
           // fw.append(l1 + "" + l2 + "" + formatta(numTarghe) + "" + l3 + "" + l4 + "\r\n");
            //fw.flush();
        }
        fw.close();
        long fine = System.currentTimeMillis();
        System.out.println("Generazione targhe conclusa con successo! in " + (fine - inizio));
    }

    private static String formatta(int i) {
        if (i <= 9) {
            return "00" + i;
        }
        if (i <= 99) {
            return "0" + i;
        }
        return "" + i;
    }
}//end class