package it.nextre.academy.esercizi.cap4;

import it.nextre.academy.myUtil.MyInput;

/**
 *
 */
public class Es4_8 {
    public static void main(String[] args) {
        int scelta=0;
        boolean flag=false;
        do{
            scelta=sceltaAzione();

            switch (scelta){
                case 0:
                    System.out.println("Hai scelto di creare un vettore.");
                    flag=true;
                    break;
                case 1:
                    if (flag)
                    System.out.println("Hai scelto di aggiungere un elemento casuale al vettore.");
                    else System.out.println("Per poter effettuare questa operazione occorre prima svolgere altri passaggi");
                    break;
                case 2:
                    if (flag)
                        System.out.println("Hai scelto di rimuovere un elemento specifico al vettore.");
                    else System.out.println("Per poter effettuare questa operazione occorre prima svolgere altri passaggi");
                    break;
                case 3:
                    if (flag)
                        System.out.println("Hai scelto stampare il vettore.");
                    else System.out.println("Per poter effettuare questa operazione occorre prima svolgere altri passaggi");
                    break;
                case 4:
                    if (flag)
                        System.out.println("Hai scelto di stampare al contrario il vettore.");
                    else System.out.println("Per poter effettuare questa operazione occorre prima svolgere altri passaggi");
                    break;
                case 5:
                    if (flag)
                        System.out.println("Hai scelto di ordinare il vettore.");
                    else System.out.println("Per poter effettuare questa operazione occorre prima svolgere altri passaggi");
                    break;
                case 6:
                    if (flag)
                        System.out.println("Hai scelto di cercare un elemento nel vettore.");
                    else System.out.println("Per poter effettuare questa operazione occorre prima svolgere altri passaggi");
                    break;

                case 7:
                    if (flag)
                        System.out.println("Hai scelto di aggiungere un elemento casuale al vettore.");
                    else System.out.println("Per poter effettuare questa operazione occorre prima svolgere altri passaggi");
                    break;



            }
        }while (scelta!=9);
    }

    private static int sceltaAzione() {
        int scelta=0;
        do{
            System.out.println("Seleziona l'azione da eseguire: ");
            System.out.println("0) Crea un vettore di interi");
            System.out.println("1) Aggiungi un elemento casuale al vettore");
            System.out.println("2) Rimuovi un elemento specifico dal vettore");
            System.out.println("3) Stampa vettore");
            System.out.println("4) Stampa vettore al contrario");
            System.out.println("5) Ordina vettore");
            System.out.println("6) Cerca un elemento nel vettore");
            System.out.println("7) Aggiungi il vettore a una matrice");
            System.out.println("8) Stampa matrice");
            System.out.println("9) Chiudi programma");
            scelta= MyInput.leggiInteroPositivo();
            if (scelta<0||scelta>9){
                System.out.println("Hai inserito un valore non valido. Riprova.");
            }
        }while (scelta<0||scelta>9);
        return scelta;
    }



}//end class
