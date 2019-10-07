package it.nextre.academy.esercizi.cancello;

public class GateMoveException extends Exception {
    GateMoveException(String msg){
        super(msg);
    }
    GateMoveException(){
        super("Move not avaiable");
    }
}//end class