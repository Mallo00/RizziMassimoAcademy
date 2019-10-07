package it.nextre.academy.basi.eccezioni;

public class InvalidTiroException extends Exception {
    //gestire più modi per arrivare al costruttoe padree
    public InvalidTiroException (){
        this("Tiro non valido");//sto richiamando il costruttore della classe
    }
    public InvalidTiroException(String msg){
        super(msg);//richiamo al padre
    }
}//end class
