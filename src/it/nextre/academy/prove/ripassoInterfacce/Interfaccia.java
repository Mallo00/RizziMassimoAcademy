package it.nextre.academy.prove.ripassoInterfacce;

public interface Interfaccia {
    void stampa();

    default void stampa1() {//posso non implementare i metodi default
        System.out.println("Stampa1");
    }
    void stampa2();//non è default, quindi DEVO implementarlo

    static void stampa3() {//i metodi statici hanno un corpo e posso non implementarli

    }


}
