package it.nextre.academy.esercizi.cap6.es6_2;

public class ImpossibleRentException extends RuntimeException {
    ImpossibleRentException(){
        super("Impossibile effettuare l'affitto");
    }
    ImpossibleRentException(String msg){
        super(msg);
    }
}//end class
