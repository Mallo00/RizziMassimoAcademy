package it.nextre.academy.esercizi.cap8;

public class InvalidPasswordException extends RuntimeException {
    InvalidPasswordException(){
        this("Password non valida!");
    }
    InvalidPasswordException(String msg){
        System.err.println(msg);
    }
}//end class
