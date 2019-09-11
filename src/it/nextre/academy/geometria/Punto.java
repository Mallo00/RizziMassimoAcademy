/**
 * classe per rappresentare un punto su di un piano cartesiano bidimensionale(2D)
 *
 */
//1package
//2 import
//3 class
package it.nextre.academy.geometria;

public class Punto {
    public double x,y;

//costruttori
    public Punto(){
        //var è utilizzabile solo all'interno di metodi
        x=0;
        y=0;
    }
    public Punto(double x, double y){
        this.x=x;
        this.y=y;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null )
            return false;
        if(!(obj instanceof  Punto))
            return false;
        Punto tmp=(Punto) obj;
        return this.x==tmp.x && this.y==tmp.y;
    }

    @Override
    public String toString() {
        return "Punto{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}//end class
