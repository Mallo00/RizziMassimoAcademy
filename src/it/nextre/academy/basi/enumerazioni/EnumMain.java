package it.nextre.academy.basi.enumerazioni;

import javax.crypto.spec.PSource;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EnumMain {
    public static void main(String[] args) {
        AutoradioSany stereo = new AutoradioSany("despacito");
        if (stereo.getState() == Radio.ACCESA) ;//controllare così
        // if (stereo.getState().ordinal==1);//non fare così
        Radio[] states = Radio.values();
        for (Radio r : states) {
            System.out.println(r);
            //System.out.println(r.toString());
            // System.out.println(r.ordinal());
            System.out.println(r.getErrorCode());
            r.stampa();
        }
        System.out.println(Radio.valueOf("STOP").ordinal());
        System.out.println("sasso");
        List<Radio> operations = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            operations.add(states[r.nextInt(states.length)]);
        }
        //operations.forEach(System.out::println);
        operations.stream()
                .forEach(EnumMain::operate);//.map(Radio::getStato).forEach(System.out::println);
    }

    private static void operate(Radio operations) {
        switch (operations) {
            case ACCESA:
                System.out.println("Radio accesa");
                break;
            case SPENTA:
                System.out.println("Radio spenta");
                break;
            case STOP:
                System.out.println("Torno al momento 0 della canzone attuale e fermo la riprodiuzione");
                break;
            case PLAY:
                System.out.println("Riprendo la ripreoduzione");
                break;
            case PAUSA:
                System.out.println("radio in pausa, lampeggio sul display");
                break;
            case AVANTI:
                System.out.println("Prossima canzone della playlist");
                break;
            case INDIETRO:
                System.out.println("Canzone precedente della playlist");
                break;
            case VOL_UP:
                System.out.println("Alzo il volume e Stampo il valore del volume seguito da 'db'");
                break;
            case VOL_DOWN:
                System.out.println("abbasso il volume e Stampo il valore del volume seguito da 'db'");
                break;
        }
    }
}//end class


class AutoradioSany {
    private String modello;
    private Radio state;

    public AutoradioSany(String modello) {
        this.modello = modello;
        this.state = Radio.SPENTA;
    }

    public Radio getState() {
        return state;
    }

}
