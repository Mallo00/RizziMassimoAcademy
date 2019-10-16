package it.nextre.academy.verifiche.verifica15_10.es16;

import it.nextre.academy.myUtil.MyInput;

import java.time.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class Persona {
    private String nome;
    private Agenda agenda;

    public Persona(String nome) {
        this.nome = nome;
        agenda = new Agenda();
    }

    public void menu() {
        int scelta = -1;
        while (scelta != 0) {
            System.out.println("Seleziona l'operazione:");
            System.out.println("1: crea un nuovo impegno");
            System.out.println("2: rimuovi un impegno");
            System.out.println("3: segna un impegno come completato");
            System.out.println("4: visualizza l'agenda");
            scelta = -1;
            while (scelta < 0 || scelta > 4) {
                scelta = MyInput.leggiInteroPositivo();
                if (scelta > 4) {
                    System.out.println("Input non valido");
                }
            }
            switch (scelta) {
                case 0:
                    System.out.println("Arrivederci!");
                    break;
                case 1:
                    creaImpegno();
                    break;
                case 2:
                    rimuoviImpegno();
                case 3:
                    completa();
                    break;
                case 4:
                    visualizzaImpegni();
                    break;
            }
        }
    }

    private void visualizzaImpegni() {
        if (agenda.impegni.isEmpty()) {
            System.out.println("Non hai impegni registrati.");
        } else {
            System.out.println("I tuoi impegni:");
            agenda.ordinaImpegni();
            agenda.stampa();
        }
    }

    private void visualizzaImpegni(boolean completato) {
        if (agenda.impegni.isEmpty()) {
            System.out.println("Non hai impegni registrati.");
        } else {
            System.out.println("I tuoi impegni:");
            agenda.ordinaImpegni();
            agenda.stampa(completato);
        }
    }





    private void completa() {
        if (agenda.impegni.isEmpty()) {
            System.out.println("Non hai impegni registrati.");
            return;
        }
        visualizzaImpegni(false);
        int scelta=0;
        do {
            System.out.println("Quale impegno hai completato?");
            scelta=MyInput.leggiInteroPositivo();
            if (scelta<1||scelta>agenda.impegni.size()){
                System.out.println("Hai inserito un valore non valido. Riprova.");
            }
        }while (scelta<1||scelta>agenda.impegni.size());
        agenda.impegni.get(scelta-1).setCompletato(true);
        System.out.println("Impegno portato a termine!");

    }

    private void rimuoviImpegno() {
        System.out.println("Rimuovi un impegno");
        if (agenda.impegni.isEmpty()) {
            System.out.println("Non hai impegni registrati.");
            return;
        }
        visualizzaImpegni();
        int scelta=0;
        do {
            System.out.println("Quale impegno vuoi rimuovere?");
            scelta=MyInput.leggiInteroPositivo();
            if (scelta<1||scelta>agenda.impegni.size()){
                System.out.println("Hai inserito un valore non valido. Riprova.");
            }
        }while (scelta<1||scelta>agenda.impegni.size());
        agenda.impegni.remove(scelta-1);
        System.out.println("Impegno rimosso!");
    }

    private void creaImpegno() {
        agenda.creaImpegno();
    }

    public Agenda getAgenda() {
        return agenda;
    }

    class Agenda implements Comparator<Impegno> {
        private List<Impegno> impegni;


        public Agenda() {
            impegni = new ArrayList<>();
        }


        public void creaImpegno() {
            System.out.println("Crea un nuovo impegno");
            TipoImpegno ti = null;
            LocalTime orario = null;
            LocalTime orarioFine = null;
            LocalDateTime dataOraFine = null;
            LocalDate data = null;
            LocalDateTime dataOraInizioImpegno = null;

            //acquisisco la data
            data = componiData();
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
                System.out.println((i + 1) + ") " + impegni.get(i));
            }
        }
        public void stampa(boolean completato) {
            for (int i = 0; i < impegni.size(); i++) {
                if (impegni.get(i).isCompletato()==completato){
                    System.out.println((i + 1) + ") " + impegni.get(i));
                }
            }
        }
    }//end class

    private LocalDate componiData() {
        Year year = null;
        Month month = null;
        MonthDay day = null;
//          acquisisco l'anno
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
        return LocalDate.of(year.getValue(), month.getValue(), day.getDayOfMonth());
    }

}//end class
