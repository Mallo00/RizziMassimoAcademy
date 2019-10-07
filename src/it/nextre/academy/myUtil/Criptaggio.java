package it.nextre.academy.myUtil;

public class Criptaggio {
    public static String criptaCesare(String frase, int ch) {
        char[] fraseCript = frase.toLowerCase().toCharArray();
        for (int i = 0; i < fraseCript.length; i++) {
            if (fraseCript[i] != ' ') {
                fraseCript[i] = (char) (fraseCript[i] + ch);
            }
        }
        return frase = new String(fraseCript);
    }
    public static String criptaCesareVero(String frase, int ch) {
        char[] fraseCript = frase.toLowerCase().toCharArray();
        for (int i = 0; i < fraseCript.length; i++) {
            if (Alphabet.alphabet().contains(""+fraseCript[i])) {
                fraseCript[i]+=ch;
                if (!Alphabet.alphabet().contains(""+fraseCript[i])){
                    fraseCript[i]-=ch;
                    fraseCript[i]=(char)(((fraseCript[i]+ch)-122)+96);
                }
            }

        }
        return frase = new String(fraseCript);
    }

    public static String decriptaCesare(String frase, int ch) {
        char[] fraseCript = frase.toCharArray();
        for (int i = 0; i < fraseCript.length; i++) {
            if (Alphabet.alphabet().contains(""+fraseCript[i])) {
                fraseCript[i] = (char) (fraseCript[i] - ch);
                if (!Alphabet.alphabet().contains(""+fraseCript[i])){
                    fraseCript[i]+=ch;
                    fraseCript[i]=(char)(((fraseCript[i]-ch)+122)-96);
                }
            }
        }
        return frase = new String(fraseCript);
    }
}//end class
