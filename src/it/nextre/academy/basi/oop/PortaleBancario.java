package it.nextre.academy.basi.oop;

import it.nextre.academy.myUtil.MyInput;

public class PortaleBancario {
    public static void main(String[] args) {
        int scelta=0;
        do{
            do {
                System.out.println("Benvenuto! Seleziona l'operazione da effettuare sul tuo conto bancario");
                System.out.println("1) Prelievo");
                System.out.println("2) Deposito");
                System.out.println("0) Esci");
                scelta= MyInput.leggiInteroPositivo();
                if (scelta<0||scelta>2) System.out.println("Input non valido. Riprova.");
            }while (scelta<0||scelta>2);
            switch (scelta){
                case 1:
                    break;
                case 2:
                    break;
            }
        }while (scelta!=0);
    }
}//end class
