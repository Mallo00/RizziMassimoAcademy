package it.nextre.academy.basi.calendario;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.*;

public class MainCalendario {
    public static void main(String[] args) {
        /*
        //Calendar cal=Calendar.getInstance();
        Calendar cal = new GregorianCalendar();
        //Mon Oct 14 09:32:35 CEST 2019
        System.out.println(cal.getTime().toString());
        SimpleDateFormat sdf = new SimpleDateFormat("MM");
        System.out.println(sdf.format(cal.getTime()));

         */


        //stampare giorni di ottobre 2019
        GregorianCalendar start = new GregorianCalendar(2019, Calendar.OCTOBER, 1);
        System.out.println(getMonthCalendar(10, 2019));

        for (int i = 0; i < Calendar.UNDECIMBER; i++) {
            System.out.println(getMonthCalendar(i + 1, 2019));
        }


        //cal.add(Calendar.DATE, 1);
        //start.add(Calendar.DATE,1);
        // System.out.println(getDayFullText(start.getTime(), Locale.ITALY));
        //System.out.println(getDayShortText(start.getTime(), Locale.ITALY));


    }


    private static String getDayFullText(Date d, Locale l) {
        SimpleDateFormat sdf = new SimpleDateFormat("MM", l);
        return sdf.format(d);
    }

    private static String getDayShortText(Date d, Locale l) {
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE", l);
        return sdf.format(d).substring(0, 2).toUpperCase();
    }

    public static String getMonthCalendar(int month, int year) {
        if (month < 1 || month > 12) {
            return "Error month 1-12";
        }
        GregorianCalendar start = new GregorianCalendar(year, month - 1, 1);
        //ottengo il mese in itliano con anno
        String out = "";
        GregorianCalendar sett = new GregorianCalendar(2019, month - 1, 1);
        for (int i = 1; i < Calendar.DAY_OF_WEEK; i++) {
            out += sett.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.SHORT, Locale.ITALY) + "\t";
            sett.add(1, i);
        }
        out += new SimpleDateFormat("MMMM", Locale.ITALY)
                .format(start.getTime()).toUpperCase() + " " + year + "\n";
        //creo intestazione di colonna
        Map<String, Integer> map = start.getDisplayNames(Calendar.DAY_OF_WEEK, Calendar.SHORT, Locale.ITALY);
        //System.out.println(map);
        //ciclo per i giorni
        for (int d = 0; d <= start.get(Calendar.DAY_OF_MONTH); d++) {
            if (d == 0)
                //devo capire che giorno della settimana deve iniziare il calendario
                //DAY_OF_WEEK parte da 1 a 7 dove 1 è domenica
                if (start.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY)
                    out += "\t".repeat(6);
                else
                    out += "\t".repeat(start.get(Calendar.DAY_OF_WEEK - 2));
            out += start.get(Calendar.DAY_OF_MONTH) + "\t";
            if (start.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY)
                out += "\n";
            start.add(Calendar.DATE, 1);
        }
        return out;
    }
}//end class

