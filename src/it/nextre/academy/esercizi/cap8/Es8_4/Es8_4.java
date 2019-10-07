package it.nextre.academy.esercizi.cap8.Es8_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Es8_4 {
    public static void main(String[] args) {
        System.out.println(contr());
    }

    public static void checked() {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        try {
            System.out.println("frase");
            String frase = br.readLine();
        } catch (IOException e) {//errore hardware
            System.out.println("Errore nell'input");
        }
    }

    public static void unChecked() {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        try {
            System.out.println("numero");
            int i = Integer.parseInt(br.readLine().trim());

        } catch (NumberFormatException e) {//si crea in errore di inserimento umano
            System.out.println("Oh zio hai inserito qualcosa che non va");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static int contr() {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        try {
            System.out.println("numero");
            int i = Integer.parseInt(br.readLine().trim());
            return 0;
        } catch (NumberFormatException e) {//si crea in errore di inserimento umano
            System.out.println("Oh zio hai inserito qualcosa che non va");
            return 1;
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            System.out.println("sasso");
            return 4;
        }
    }
}//end class
