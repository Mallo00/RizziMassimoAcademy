package it.nextre.academy.esercizi.cap4;

public class Carattere {
    private char carattere;
    private int nOccorrenze;
    Carattere(char carattere){
        this.carattere=carattere;
        nOccorrenze=0;
    }
    public int contaOccorrenze(String pool){
        int nOccorrenze=0;
        for (int i = 0; i < pool.length(); i++) {
            if (carattere==pool.charAt(i)){
                nOccorrenze++;
            }
        }
        return nOccorrenze;
    }

    public char getCarattere() {
        return carattere;
    }

    @Override
    public String toString() {
        return "carattere=" + carattere
                ;
    }
}//end class
