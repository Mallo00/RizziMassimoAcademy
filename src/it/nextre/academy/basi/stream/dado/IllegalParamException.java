package it.nextre.academy.basi.stream.dado;

public class IllegalParamException extends RuntimeException{
    public IllegalParamException(String msg){
        super(msg);
    }
    public IllegalParamException(){
        super("Parametro/i non validi");
    }
}//end class