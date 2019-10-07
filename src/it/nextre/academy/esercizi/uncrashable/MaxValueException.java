package it.nextre.academy.esercizi.uncrashable;

public class MaxValueException extends RuntimeException {
    MaxValueException(String msg){
        System.err.println(msg);
    }
    MaxValueException(){
        this("Numero troppo grande");
    }

}//end class
