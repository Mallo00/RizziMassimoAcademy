package it.nextre.academy.dataPoliglotta;

import it.nextre.academy.myUtil.MyInput;


import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;

public class HelloWorld {
    /* ricevere in input una data, giorno mese anno e stampi in 4 lingue differenti il giorno rappresentante quella data
     * all'avvio si chiederà la lingua dell'interfaccia
     * poi inseriamo i dati
     * stampiamo i dati in tutte le lingue
     * */
    public static void main(String[] args) {
        Locale use = setLingua();
        Map<Integer, String> lingue = Lingue.getLingue();
        //imposto le risorse da utilizzare per il progetto
        ResourceBundle rb = ResourceBundle.getBundle("it/nextre/academy/dataPoliglotta/Date", use);
        //acquisisco la data
        LocalDate date = inserisciData(rb);
        //confermo l'inserimento corretto
        System.out.println(rb.getString("helloworld.confirmDate"));
        //effettuo la formattazione per ottenere il giorno della settimana
        //DateTimeFormatter dtf= DateTimeFormatter.ofPattern("EEEE", Locale.getDefault());
        //mando in stampa in tutte le lingue
        stampaNelleLingue(date, lingue);
    }

    private static void stampaNelleLingue(LocalDate date, Map<Integer, String> lingue) {
        Locale use = null;
        DateTimeFormatter dtf = null;
        for (int i = 0; i < lingue.size(); i++) {
            use = setLingua(lingue, i + 1);
            dtf = DateTimeFormatter.ofPattern("EEEE", use);
            System.out.println(date.format(dtf));
        }

    }

    private static LocalDate inserisciData(ResourceBundle rb) {
        LocalDate date = null;
        while (date == null) {
            System.out.println(rb.getString("helloworld.askData"));
            date = getData(rb);
        }
        return date;
    }

    private static Locale setLingua(Map<Integer, String> lingue, int i) {
        //imposto la lingua desiderata
        //System.out.println(lingue.get(i));
        Locale use = Locale.forLanguageTag(lingue.get(i));
        Locale.setDefault(use);
        return use;
    }

    private static Locale setLingua() {
//preparo le lingue
        Map<Integer, String> lingue = Lingue.getLingue();
        //scelgo la lingua
        Integer scelta = scegliLingua(lingue);
        //imposto la lingua desiderata
        Locale use = Locale.forLanguageTag(lingue.get(scelta));
        Locale.setDefault(use);
        return use;
    }

    private static Integer scegliLingua(Map<Integer, String> lingue) {
        System.out.println("Choose your language:");
        System.out.println(
                "1) Italiano\n" +
                        "2) English\n" +
                        "3) French\n" +
                        "4) Deutch");
        //creo una mappa contenente i valori di riferimento per le lingue

        Integer scelta = 0;
        while (!lingue.containsKey(scelta)) {
            scelta = MyInput.leggiInteroPositivo();
            if (!lingue.containsKey(scelta)) {
                System.out.println("NO");
            }
        }
        return scelta;
    }


    public static LocalDate getData(ResourceBundle rb) {
        try {
            System.out.println(rb.getString("helloworld.askYear"));
            int anno = MyInput.leggiInteroPositivo();
            Year y = Year.of(anno);
            Month m = null;
            while (m == null) {
                try {
                    System.out.println(rb.getString("helloworld.askMonth"));
                    int mese = MyInput.leggiInteroPositivo();
                    m = Month.of(mese);
                } catch (DateTimeException e) {
                    System.err.println(rb.getString("helloworld.errorMessege"));
                    m = null;
                }
            }
            MonthDay g = null;
            try {
                System.out.println(rb.getString("helloworld.askDay"));
                int giorno = MyInput.leggiInteroPositivo();
                g = MonthDay.of(m, giorno);
            } catch (DateTimeException e) {
                System.err.println(rb.getString("helloworld.errorMessege"));
                g = null;
            }
            return LocalDate.of(y.getValue(), m, g.getDayOfMonth());
        } catch (DateTimeException e) {
            System.err.println(rb.getString("helloworld.errorMessege"));
            return null;
        }
    }

}//end class
