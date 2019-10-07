package it.nextre.academy.basi.interfacce;

public class InterfacceMain {
    public static void main(String[] args) {

        Rover mars1 = new Rover();
        mars1.cammina3();
        mars1.ferma();
        Camminante camm = mars1;
        camm.cammina3();
        camm.ferma();
        mars1.analizzaAtmosfera();
        System.out.println(((Robot)mars1).nome);
    }
}//end class
