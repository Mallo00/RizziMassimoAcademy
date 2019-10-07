package it.nextre.academy.esercizi.cap5;

import java.util.Random;

public class Auto {
    private double serbatoio=55;
    private String nome;
    private double kml;
    private double kmPercorsi;
    private int nRifo;
    Random r=new Random();

    public Auto(String nome){
        nRifo=0;
        this.nome=nome;
        switch (nome) {
            case "Utilitaria":
                kml = 16.67;
                break;
            case "Supercar":
                kml = 4;
                break;
            case "Berlina":
                kml = 14;
                break;
            case "SUV":
                kml = 13;
                break;
            case "Ibrida":
                kml = 18;
                break;
        }
        this.kml=kml;
        kmPercorsi=0;
    }
    public void corri(){
        while (serbatoio!=0){
            System.out.println("Sto correndo");
            kmPercorsi+=serbatoio*kml;
            serbatoio-=kmPercorsi/kml;
            if (pieno()){
                System.out.println("Rifornimento effettuato");
                nRifo++;
                serbatoio=55;
            }else serbatoio=0;
        }
        System.out.println("è finita la benza!");
        System.out.println("Km percorsi: "+kmPercorsi);
    }

    private boolean pieno() {
        System.out.println("Fai il pieno?");
        return r.nextInt(10)<3;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "nome='" + nome + '\'' +
                ", kml=" + kml +
                ", kmPercorsi=" + kmPercorsi +
                ", nRifo=" + nRifo +
                '}';
    }

    public double getKml() {
        return kml;
    }

}//end class
