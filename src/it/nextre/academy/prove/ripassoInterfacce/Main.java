package it.nextre.academy.prove.ripassoInterfacce;

public class Main implements Interfaccia{
    public static void main(String[] args) {
        Padre p=new Padre("Luciano", 35);
        Figlio f=new Figlio("Massimo", 5);
        System.out.println(f.toString());
        System.out.println(f.getNome());
        System.out.println(p.getEta());
        System.out.println(p.getNome());
        System.out.println(p.toString());
    }

    @Override
    public void stampa1(){

    }

    @Override
    public void stampa() {

    }

    @Override
    public void stampa2() {

    }

}//end class
