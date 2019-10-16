package it.nextre.academy.esercizi.cap8;

import it.nextre.academy.myUtil.DummyData;
import it.nextre.academy.myUtil.MyInput;

public class Es8_5 {
    public static void main(String[] args) throws InvalidPasswordException {
        final int LUNGH_PSW = 100;
        String psw = "";
        for (int i = 0; i < LUNGH_PSW; i++) {
            psw += DummyData.getCognome();
        }
        System.out.println(psw);

        inserisciPSW(psw);

    }

    public static boolean inserisciPSW(String psw) throws InvalidPasswordException {
        System.out.println("Inserisci la password");
        String pass = MyInput.leggiRiga();
        int contapsw = 0;
        try {
            if (!psw.contains(pass)) {
                throw new InvalidPasswordException();
            } else {
                String tmp = psw;
                int npsw = tmp.length();
                psw = psw.replaceAll(pass, "");
                npsw = (npsw - psw.length()) / pass.length();
                System.out.println("La password è stata trovata " + npsw + " volte");
                return true;
            }
        }catch (InvalidPasswordException e){
            return inserisciPSW(psw);
        }

    }
}//end class
