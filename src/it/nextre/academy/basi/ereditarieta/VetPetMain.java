package it.nextre.academy.basi.ereditarieta;


import it.nextre.academy.basi.ereditarieta.regnoAnimale.Animale;
import it.nextre.academy.basi.ereditarieta.regnoAnimale.Gatto;

public class VetPetMain {

    public static void main(String[] args) {
        Animale c=new Cani();
        Animale g=new Gatto();

        if (c instanceof Cani){
            ((Cani)c).abbaia();
        }
        //classCastexception, gatto, castato a cane, non può abbaiare. Occorre controllare che sia instanceOf;
        //((Cani)g).abbaia();
        System.out.println(c instanceof Cani);//true
        System.out.println(c instanceof Gatto);//false
        System.out.println(c instanceof Domestico);//true
        System.out.println(c instanceof Animale);//false
    }
}//end class
