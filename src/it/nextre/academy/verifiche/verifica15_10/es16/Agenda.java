/*package it.nextre.academy.verifiche.verifica15_10.es16;


import it.nextre.academy.myUtil.MyInput;

import java.time.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class Agenda implements Comparator<Impegno> {
    private List<Impegno> impegni;
    private Persona proprietario;

    public Agenda(Persona proprietario) {
        impegni = new ArrayList<>();
        this.proprietario = proprietario;
    }


    public void creaImpegno() {
        System.out.println("Crea un nuovo impegno");
        TipoImpegno ti = null;
        Year year = null;
        Month month = null;
        MonthDay day = null;
        LocalTime orario = null;
        LocalTime orarioFine = null;
        LocalDateTime dataOraFine = null;
        LocalDate data = null;
        LocalDateTime dataOraInizioImpegno = null;
//      acquisisco l'anno
        while (year == null) {
            System.out.println("Anno:");
            try {
                year = Year.of(MyInput.leggiInteroPositivo());
            } catch (IllegalArgumentException | DateTimeException w) {
                System.out.println("Anno non valido");
            }
        }
        //acquisisco il mese
        while (month == null) {
            System.out.println("Mese:");
            try {
                month = Month.of(MyInput.leggiInteroPositivo());
            } catch (IllegalArgumentException | DateTimeException w) {
                System.out.println("Mese non valido");
            }
        }
        //acquisisco il giorno
        while (day == null) {
            System.out.println("Giorno:");
            try {
                day = MonthDay.of(month, MyInput.leggiInteroPositivo());
            } catch (IllegalArgumentException | DateTimeException w) {
                System.out.println("Giorno non valido");
            }
        }
        //posso comporre la data
        data = LocalDate.of(year.getValue(), month.getValue(), day.getDayOfMonth());
        //specifico il tipo di impegno
        try {
            System.out.println("Che tipo di impegno è? Promemoria o appuntamento?");
            ti = TipoImpegno.valueOf(MyInput.leggiRiga().toUpperCase());
            System.out.println("Definisci l'impegno");
            String nome = MyInput.leggiRiga();
            switch (ti) {
                case PROMEMORIA:
                    System.out.println("Imposta la scadenza del promemoria: ");
                    orario = getOrario();
                    dataOraInizioImpegno = LocalDateTime.of(data, orario);
                    Impegno i1 = new Impegno(ti, nome, dataOraInizioImpegno, dataOraFine);

                    addImpegno(i1);
                    break;
                case APPUNTAMENTO:
                    System.out.println("Inserisci l'inizio dell'appuntamento:");
                    orario = getOrario();
                    while (orarioFine == null || dataOraFine.compareTo(dataOraInizioImpegno) < 0) {
                        System.out.println("Inserisci la fine dell'appuntamento:");
                        orarioFine = getOrario();
                        dataOraFine = LocalDateTime.of(data, orarioFine);
                        dataOraInizioImpegno = LocalDateTime.of(data, orario);
                        if (dataOraFine.compareTo(dataOraInizioImpegno) < 0) {
                            System.out.println("L'appuntamento deve terminare dopo il suo inizio");
                        }
                    }
                    Impegno i2 = new Impegno(ti, nome, dataOraInizioImpegno, dataOraFine);
                    addImpegno(i2);
                    break;
            }//fine switch
        } catch (DateTimeException e) {
            System.out.println("Data non valida.");
        } catch (IllegalArgumentException e) {
            System.out.println("Tipo non valido.");
        }
    }

    private LocalTime getOrario() {
        LocalTime orario = null;
        while (orario == null) {
            try {
                System.out.println("Inserisci l'ora:");
                int ora = MyInput.leggiInteroPositivo();
                System.out.println("Inserisci il minuto:");
                int min = MyInput.leggiInteroPositivo();
                orario = LocalTime.of(ora, min);
            } catch (DateTimeException e) {
                System.out.println("Orario non valido");
            }
        }
        return orario;
    }


    public void addImpegno(Impegno i) {
        impegni.add(i);
    }

    public void ordinaImpegni() {
        impegni.sort(this);
    }

    @Override
    public int compare(Impegno o1, Impegno o2) {
        if (o1.getDataOraInizio().isBefore(o2.getDataOraInizio())) {
            return -1;
        } else {
            if (o1.getDataOraInizio().isAfter(o2.getDataOraInizio())) {
                return 1;
            } else return 0;
        }
    }

    public void stampa() {
        for (int i = 0; i < impegni.size(); i++) {
            System.out.println(impegni.get(i));
        }
    }
}//end class
*/