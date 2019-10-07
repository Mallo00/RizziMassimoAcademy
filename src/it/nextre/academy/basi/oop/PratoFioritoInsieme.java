package it.nextre.academy.basi.oop;

import it.nextre.academy.myUtil.MyInput;

public class PratoFioritoInsieme {
    public static void main(String[] args) {
        //0 definire le variabili del gioco
        int vite = 3;
        int[][] tabellone;
        int difficolta;
        //1 richiedere la difficoltà
        difficolta = impostaDifficolta();
        //2 impostare il tabellone di gioco

        //3 interagire con l'utente

        //4 stampare il risultato
    }

    /**
     *
     * @return caselle è il numero di caselle di cui sarà composta la tabella
     */
    private static int impostaDifficolta() {
        int tmp = MyInput.leggiInteroPositivo();
        int caselle = 0;
        do {
            System.out.println("Scegli 1 per facile, 2 per normale, 3 per diffiile");
            switch (tmp) {
                case 1:
                    caselle = 4;
                    return caselle;
                case 2:
                    caselle = 5;
                    return caselle;
                case 3:
                    caselle = 6;
                    return caselle;
                default:
                    caselle = 0;
                    System.out.println("Valore non valido");
            }
        } while (caselle != 0);

        return caselle;
    }

}//end class
