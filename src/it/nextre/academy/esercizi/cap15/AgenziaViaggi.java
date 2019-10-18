package it.nextre.academy.esercizi.cap15;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AgenziaViaggi implements Filtratore {
    private String nome;
    private List<Alloggio> alloggi;

    public AgenziaViaggi(String nome) {
        this.nome = nome;
        this.alloggi = new ArrayList<>();
    }

    //metodo per prendere la lista totale e creare dei file contenente gli alloggi suddivisi per location
    public void dividiPerLocation() {
        //specifico il path di salvataggio
        Path destination = Paths.get(System.getenv("SystemDrive"), "Academy", "Corretti a casa", "pr090919", "hotels");
        Path dst = Paths.get("C:\\Academy\\Corretti a casa\\pr090919\\hotels\\");


        List<Alloggio> alMare = alloggi.stream()
                .filter(alloggio -> Alloggio.isLocated(alloggio, Location.MARE))
                .collect(Collectors.toList());
        List<Alloggio> inMontagna = alloggi.stream()
                .filter(alloggio -> Alloggio.isLocated(alloggio, Location.MONTAGNA))
                .collect(Collectors.toList());
        List<Alloggio> alLago = alloggi.stream()
                .filter(alloggio -> Alloggio.isLocated(alloggio, Location.LAGO))
                .collect(Collectors.toList());
        List<Alloggio> inPianura = alloggi.stream()
                .filter(alloggio -> Alloggio.isLocated(alloggio, Location.PIANURA))
                .collect(Collectors.toList());

        scrivi(alMare, destination, Location.MARE, "txt");
        scrivi(alLago, destination, Location.LAGO, "txt");
        scrivi(inMontagna, destination, Location.MONTAGNA, "txt");
        scrivi(inPianura, destination, Location.PIANURA, "txt");


    }

    private void scrivi(List<Alloggio> lista, Path destination, Location l, String ext) {

        for (int i = 0; i < lista.size(); i++) {
            String tmpFileName = l.getValue() + i + "." + ext;
            System.out.println(tmpFileName);
            Path tmpPath = destination.resolve(Paths.get(tmpFileName));
            File file = new File(tmpPath.toUri());
            try (FileWriter fw = new FileWriter(file)) {
                fw.write(lista.get(i).toString());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    void filtraCPU() {
        List<Alloggio> filtrati = alloggi.stream()
                .filter(Alloggio::hasFreeParking)
                .filter(Alloggio::hasFreeWifi)
                .filter(alloggio -> Alloggio.isCloser(alloggio, 1000))
                .filter(alloggio -> Alloggio.isStruttura(alloggio, TipoStruttura.APPARTAMENTO))
                .filter(alloggio -> Alloggio.isLocated(alloggio, Location.LAGO))
                .collect(Collectors.toList());
        System.out.println(filtrati.size() + " alloggi corrispondono ai criteri");
        Path dst = Paths.get("C:" + File.pathSeparator + "Academy  " + File.pathSeparator + "  Corretti a casa" + File.pathSeparator + "pr090919" + File.pathSeparator + "hotels");
        scrivi(filtrati, dst, Location.PIANURA, "html");


    }


    private void selezioneFiltri() {
        //tutti i filtri scelti dall'utente
        List<FiltriAlloggi> filtriAlloggiDaApplicare = new ArrayList<>();
        filtriAlloggiDaApplicare.add(FiltriAlloggi.NOME);
        filtriAlloggiDaApplicare.add(FiltriAlloggi.CLASSIFICAZIONE);
        filtriAlloggiDaApplicare.add(FiltriAlloggi.LOCATION);
        filtriAlloggiDaApplicare.add(FiltriAlloggi.PARCHEGGIO_INCLUSO);
        filtriAlloggiDaApplicare.add(FiltriAlloggi.FREEWIFI);
        filtriAlloggiDaApplicare.add(FiltriAlloggi.TIPO_STRUTTURA);
        filtriAlloggiDaApplicare.add(FiltriAlloggi.PREZZO_PER_NOTTE);


        /*
        int scelta = -1;
        boolean altroFiltro = false;
        //ripeto il ciclo ogni volta che l'utente vuole un filtro
        do {
            System.out.println("Seleziona quale filtro vuoi applicare:");
            System.out.println("0) Ignora filtraggio");
            for (int i = 0; i < Filtri.values().length; i++) {
                System.out.println(i + 1 + ") " + Filtri.values()[i].getValue());
            }
            do {
                scelta = MyInput.leggiIntero();
                if (scelta > Filtri.values().length) {
                    System.out.println("Input non valido. Reinserisci");
                }
            }while (scelta!=0 && scelta > Filtri.values().length);

            if (scelta == 0) {
                System.out.println("Nessun filtro aggiunto");
            } else {
                filtriDaApplicare.add(Filtri.values()[scelta-1]);
                System.out.println("Vuoi aggiungere un altro filtro?");
                altroFiltro = MyInput.carattSiONo() == 's';
                if (!altroFiltro) {
                    System.out.println("Prossimo passaggio");
                }
            }
        }
        while (altroFiltro && (/*scelta > Filtri.values().length || scelta != 0));
*/
    }


    public void stampaAlloggi() {
        alloggi.forEach(System.out::println);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Alloggio> getAlloggi() {
        return alloggi;
    }

    public void addAlloggio(Alloggio a) {
        if (!alloggi.contains(a))
            alloggi.add(a);
    }

}//end class
