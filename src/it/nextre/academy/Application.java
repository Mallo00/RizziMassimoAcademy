/**
 * @author Massimo Rizzi
 * @version 1.1
 *  */
package it.nextre.academy;



import it.nextre.academy.geometria.Punto;
import it.nextre.academy.geometria.forme.Rettangolo;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Application {
    public static void main(String[] args) {

      //  Punto p1=new Punto();
      //  InputStreamReader ingresso=new InputStreamReader(System.in);
        //BufferedReader tastiera=new BufferedReader(ingresso);

        //occorre gestire la visibilità dei parametri
       // p1.x=3;
        //p1.y=5;

        //double base, alt;
        //base=5;
        //alt=4;

       // Rettangolo r1=new Rettangolo(base, alt)

        Reference ref1=new Reference();
        System.out.println("Primo punto: "+ref1.p1.toString());
        System.out.println("Secondo punto: "+ref1.p2.toString());
        System.out.println("Terzo punto: "+ref1.p3.toString());

//        System.out.println("Area rettangolo "+r1.getArea());
//        System.out.println("Perimetro rettangolo "+r1.getPerimetro());
    }//end main

}//end class