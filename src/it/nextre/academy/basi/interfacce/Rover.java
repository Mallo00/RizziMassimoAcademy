package it.nextre.academy.basi.interfacce;

import java.util.Random;

public class Rover extends Robot implements Camminante {
    @Override
    public void cammina3() {
        System.out.println("ATTENZIONE: rover in movimento");
    }

    @Override
    public void ferma() {
        System.out.println("IL ROVER SI è FERMATO!");
    }
    public void analizzaAtmosfera(){

    }
    private void scattaFoto(){};
    private void cacca(){};
}//end class
