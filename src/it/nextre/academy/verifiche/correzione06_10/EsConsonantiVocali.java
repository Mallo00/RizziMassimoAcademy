package it.nextre.academy.verifiche.correzione06_10;

import it.nextre.academy.myUtil.MyInput;


public class EsConsonantiVocali {
    public static void main(String[] args) {
        System.out.println("inserisci una frase");
        String s = MyInput.leggiRiga();
        System.out.println("Hai inserito: " + s);
        s = s.toLowerCase();
        String maiuscolata = maiuscolizza(s);
        System.out.println(maiuscolata);
        StringBuilder reverse=reverse(maiuscolata);
        System.out.println(reverse);

    }

    public static String maiuscolizza(String s) {
        String vocali = "aeiou";
        String tmp = "";
        for (int i = 0; i < s.length(); i++) {
            if (vocali.contains("" + s.charAt(i))) {
                tmp += ("" + s.charAt(i)).toUpperCase();
            } else {
                tmp = "" + s.charAt(i);
            }
        }
        return tmp;
    }

    public static StringBuilder reverse(String s){
        StringBuilder reverse=new StringBuilder(s);
        reverse.reverse();
        return reverse;
    }
}//end class
