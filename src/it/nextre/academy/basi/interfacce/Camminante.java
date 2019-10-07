package it.nextre.academy.basi.interfacce;

public interface Camminante {
   // public abstract void cammina();
    //è possibile richiamarlo dall'interfaccia perchè static. non è concesso avere final, perché una cosa statica non si relaziona con un'istanza
    static void cammina2(){};
    //ereditato dalla classe che eredita l'interfaccia, il default indica l'implementazione di base
    default void cammina3(){};
    String nome="Sasso";

    private static void cammina4(){};
    void ferma();
}//end class
