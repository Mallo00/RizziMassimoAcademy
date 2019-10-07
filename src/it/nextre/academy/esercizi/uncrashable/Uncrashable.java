package it.nextre.academy.esercizi.uncrashable;

import it.nextre.academy.myUtil.Alphabet;
import java.math.BigInteger;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Uncrashable {
    public static void main(String[] args) throws MaxValueException {
        int i = 0;
        leggi(i);

    }

    public static int leggi(int i) throws MaxValueException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci");
        int appo=0;
        try {
            appo=sc.nextInt();
        }
        catch (InputMismatchException e){
            if((""+appo).contains(Alphabet.alphabet()+"<>,;.:-_òç@°à#ù§éè[]{}+*!£$%&/()=?\"ì^'")){

            }
            throw new MaxValueException();
        }

        return i;
    }

}//end class
