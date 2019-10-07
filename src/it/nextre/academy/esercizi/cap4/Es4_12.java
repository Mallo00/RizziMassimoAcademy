package it.nextre.academy.esercizi.cap4;

import it.nextre.academy.myUtil.Alphabet;
import it.nextre.academy.myUtil.MyInput;

//tutto in minuscolo senza tolowercase, stringbuilder, lowercase
public class Es4_12 {
    public static void main(String[] args) {
        String s = MyInput.leggiRiga().trim();
        char[] caratteri = s.toCharArray();
        String op = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            int j = 0;
            boolean flag1 = false;
            if (Alphabet.upperCaseAlphabet().contains("" + s.charAt(i))) {
                flag1 = true;
            }
            if (flag1) {
                boolean flag2 = false;
                while (j < Alphabet.upperCaseAlphabet().length() && !flag2) {
                    if (Alphabet.upperCaseAlphabet().charAt(j) == s.charAt(i)) {
                        op += ("" + Alphabet.alphabet().charAt(j));
                        flag2 = true;
                    }
                    j++;
                }
            } else op += s.charAt(i);

        }
        System.out.println(op);
    }//end main
}//end class
