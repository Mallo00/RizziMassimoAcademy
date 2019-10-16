package it.nextre.academy.myUtil;

import java.text.DecimalFormat;
import java.time.Duration;

public class MyFormatter {
    public static String cammellizza(String s){
        s=s.trim();
        char[] chars=s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i]==' '&&chars[i+1]!=' '){
                chars[i+1]=Character.toUpperCase(chars[i+1]);
            }
        }
        s=new String(chars);
        s=s.replaceAll(" ","");
        return s;
    }

    public static String formattaDouble(double numero){
        return formattaDouble(numero, 2);
    }

    private static String formattaDouble(double numero, int precisione) {
        DecimalFormat df=new DecimalFormat();
        df.setMaximumFractionDigits(precisione);
        return df.format(numero);
    }
    public static String durationFormatter(Duration d) {
        //ritorno una stringa formattata
        return d.toString()
                .substring(2)
                .replaceAll("(\\d[HMS])(?!$)", "$1 ")
                .toLowerCase();
    }
}//end class
