package it.nextre.academy.myUtil;

public class Cammellizza {
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
}//end class
