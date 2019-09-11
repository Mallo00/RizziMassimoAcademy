package it.nextre.academy.geometria.forme;

public class Rettangolo {
    private double base, alt, area, perimetro;


    //quadrato
    public Rettangolo(double base){
        this.base=base;
    }

    /**
     *
     * @param base base del rettangolo
     * @param alt alteszza del rettangolo
     */
    public Rettangolo (double base, double alt){
        this.base=base;
        this.alt=alt;
        area=this.base*this.alt;
        perimetro=(this.base+this.alt)*2;
    }

    /**
     *
     * @return ritorna l'altezza del rettangolo
     */
    public double getAlt() {
        return alt;
    }

    /**
     *
     * @return
     */
    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
        getPerimetro();
        getArea();
    }

    /**
     *
     * @param alt
     */
    public void setAlt(double alt) {
        this.alt = alt;
        getPerimetro();
        getArea();
    }
    public double getArea(){
        return area;
    }
    public double getPerimetro(){
        return perimetro;
    }
}//end class
