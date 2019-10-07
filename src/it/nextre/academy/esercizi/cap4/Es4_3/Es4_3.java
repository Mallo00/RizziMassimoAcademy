package it.nextre.academy.esercizi.cap4.Es4_3;

import it.nextre.academy.myUtil.MyInput;
import it.nextre.academy.myUtil.MyLoadings;
import it.nextre.academy.myUtil.MyOutput;

//Scrivere un programma per creare un insieme di valori, dello stesso tipo, a grandezza dinamica. Realizzare quindi un ciclo for per riempire
//questa struttura con un numero N di elementi che viene stabilito all’avvio del programma (chiesto all’utente).
//SUGGERIMENTI: documentarsi sulla classe Scanner, System.in e Integer.parseInt().
//EDIT: COPIA IL VALORE DI UN ARRAY
public class Es4_3 {
    public static void main(String[] args) {
        int[] vetNum=new int[0];
        vetNum=caricaVet(vetNum);
        MyOutput.stampaVettoreInt(vetNum);
        int[] vetContr=new int[vetNum.length];
        vetContr=MyOutput.invertiVettoreInt(vetNum);
       // vetContr=invertiVettore(vetNum, vetContr);
        MyOutput.stampaVettoreInt(vetContr);
    }

    private static int[] caricaVet(int[] vet){
        int nElem;
        System.out.println("Inserisci il numero di elementi che vuoi caricare: ");
        nElem= MyInput.leggiInteroPositivo();
        vet=new int[nElem];
        System.out.println("Inserisci un valore minimo che dovranno assumere gli elementi: ");
        int min=MyInput.leggiIntero();
        int max;
        do{
            System.out.println("Inserisci un valore massimo che dovranno assumere gli elementi: ");
            max=MyInput.leggiIntero();
            if (min>=max){
                System.out.println("Hai inserito un valore massimo maggiore o uguale al valore minimo. Riprova.");
            }
        }while (min>=max);
        MyLoadings.caritcaVetNumeriCasualiInt(vet, min, max);
        return vet;
    }

    public static int[] invertiVettore(int[] vet, int[] vetContr){
        int i=0;
        int j=0;
        for (i=0, j=vet.length-1;i<vet.length;i++,j--){
            vetContr[i]=(int) vet[j];
        }
        return vetContr;
    }


}//end class
