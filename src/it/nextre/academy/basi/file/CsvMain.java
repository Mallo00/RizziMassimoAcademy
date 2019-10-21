package it.nextre.academy.basi.file;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CsvMain {
    public static final int N_DATA_EXAMPLE = 100;

    public static void main(String[] args) {
//creare un oggetto esempio da stampare
        DataExample d1 = DataExample.getRandomDataExample();
        System.out.println(d1);
        //ottimizzato per la struttura di righe
        StringWriter sw = new StringWriter();
        d1.setCognome("De, Lucca");
        try (CSVPrinter csvPrinter = new CSVPrinter(sw, CSVFormat.DEFAULT.withHeader("id", "Nome", "Cognome", "eMail"))) {
            for (int i = 0; i < N_DATA_EXAMPLE; i++) {
                d1 = DataExample.getRandomDataExample();
                //csvPrinter.printRecord(/*serie di valori*/);
                //csvPrinter.print(d1); non va bene, stampa non formattato
                csvPrinter.printRecord(d1.getId(), d1.nome, d1.cognome, d1.email);//separa tutto con le virgole. se inseriamo qualcosa con la virgola, inserisce ""
                csvPrinter.flush();
            }
        } catch (IOException e) {

        }
        //System.out.println(sw.toString()); DEBUG STAMPA IN CONSOLE
        //scrivo su csv
        try (FileWriter fw = new FileWriter("data-example.csv")) {
            fw.write(sw.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
        //rileggo da csv e creo una lista
        List<DataExample> dataFromCSV = new ArrayList<>();
        try (/*setuppare per la lettura*/CSVParser csvParser = new CSVParser(new FileReader("data-example.csv"), CSVFormat.DEFAULT.withFirstRecordAsHeader())) {
            for (CSVRecord r : csvParser) {
                //chiediamo il nome del record appena letto
                System.out.println(r.get("Nome"));
                DataExample tmp = new DataExample(Integer.parseInt(r.get("id")),
                        r.get("Nome"),
                        r.get("Cognome"),
                        r.get("eMail"));
                dataFromCSV.add(tmp);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        dataFromCSV.stream()
                .filter(e -> e.getEmail().endsWith("@live.it"))
                .forEach(System.out::println);
    }//end main
}//end class

