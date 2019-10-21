package it.nextre.academy.bruteForce;

import java.util.Random;

public class MainBruto {
    final static String psw="fesnfsivf_324";
    public static void main(String[] args) {
        String prova="";
        Random r=new Random();
        while (!psw.equals(prova)){
            for (int i = 0; i < psw.length(); i++) {
                prova+=(char)(r.nextInt());
            }
        }
        System.out.println(prova);
    }
}//end class
