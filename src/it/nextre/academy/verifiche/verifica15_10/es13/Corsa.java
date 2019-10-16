package it.nextre.academy.verifiche.verifica15_10.es13;

import it.nextre.academy.myUtil.MyFormatter;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Corsa implements Comparator<Auto> {
    private static final int N_GIRI = 52;
    private static final Duration TEMPO_MEDIO = Duration.of(102000, ChronoUnit.MILLIS);
    private List<Auto> partecipanti;
    private static Corsa instance = null;

    private Corsa() {
        partecipanti = new ArrayList<>();
    }

    public static synchronized Corsa getInstance() {
        if (instance == null) {
            instance = new Corsa();
        }
        return instance;
    }

    public List<Auto> getPartecipanti() {
        return partecipanti;
    }

    public void addPartecipante(Auto a) {
        //inserisco auto dal nome univoco
        if (!partecipanti.contains(a)) {
            partecipanti.add(a);
        } else System.out.println("Partecipante " + a.getNome() + "già iscritto");
    }

    public void corsa() {
        //ciclo il numero di giri
        for (int i = 0; i < N_GIRI; i++) {
            System.out.println("GIRO " + (i + 1));
            //ogni partecipante deve correre
            partecipanti.forEach(Auto::corriGiro);
            //ordino la classifica sulla base del tempo
            ordinaClassifica();
            //ad ogni giro stampo la posizione aggiornata
            stampaCLassifica();
        }
    }

    public void annunciaVincitore() {
        System.out.println("Il vincitore è...");
        System.out.println(partecipanti.get(0).getNome());
        stampaCLassifica();
    }

    public void stampaCLassifica() {
        System.out.println("Posizioni: ");
        for (int k = 0; k < partecipanti.size(); k++) {
            System.out.println((k + 1) + ") " + partecipanti.get(k).getNome() + ", tempo: " + MyFormatter.durationFormatter(Duration.of(partecipanti.get(k).tempoTotaleMillis(), ChronoUnit.MILLIS)));
        }
    }


    public void ordinaClassifica() {
        //effettuo il sorting della lista dei partecipanti sulla base dei tempi
        partecipanti.sort(this);
    }

    public static Duration getTempoMedio() {
        return TEMPO_MEDIO;
    }

    @Override
    public int compare(Auto o1, Auto o2) {
        return Long.compare(o1.tempoTotaleMillis(), o2.tempoTotaleMillis());
    }


}//end class
