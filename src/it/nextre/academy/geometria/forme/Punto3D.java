package it.nextre.academy.geometria.forme;

public class Punto3D extends Punto {//eredita le protected di punto

    {
        System.out.println("Inizializzatore non statico di istanza Punto3D");
    }

    static {
        System.out.println("Inizializzatore statico di classe Punto3D");
    }

    Punto tmp = new Punto();
    protected double z;

    public Punto3D() {
        super.x = 0;
        super.y = 0;
        this.z = 0;
    }

    public Punto3D(double x, double y, double z) {
        super(x, y);
        this.z = 0;
    }
}//end class
