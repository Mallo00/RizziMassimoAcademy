package it.nextre.academy.basi.file;

import it.nextre.academy.basi.file.fileIO.MyFileWriter;
import it.nextre.academy.myUtil.DummyData;
import it.nextre.academy.myUtil.dummyObj.Umano;

import java.io.*;

import static it.nextre.academy.basi.file.fileIO.MyFileWriter.createFile;

public class MainFile {
    public static void main(String[] args) {
        /*
        //oggetti da inserire
        Umano[] umani = new Umano[10];
        //percorso in cui salvareil file con le info degli oggetti
        String path = "C:" + File.pathSeparator + "Academy" + File.pathSeparator + "Corretti a casa" + File.pathSeparator + "pr090919" + File.pathSeparator + "files" + File.pathSeparator + "Prove" + File.pathSeparator + "umani.txt";
        //richiamo il metodo della mia classe custom per creare il file nel percorso specificato
        MyFileWriter.createFile(path);
        PrintWriter pw = createFile(path);

        for (int i = 0; i < umani.length; i++) {
            umani[i] = new Umano(DummyData.getNome(), DummyData.getCognome(), DummyData.getAge(0, 100));
            MyFileWriter.createHuman(umani[i], pw);
        }
        pw.close();

        MyFileWriter.getFileInfo();

         */


        File f = new File("textdemo.txt");//rappresenta un possibile file nel path specificato
        if (!f.exists()) {
            try {
                //potrei non avere l'autorizzazione o altro...
                f.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try (//risorse
             //assicurarsi che l'indirizzo sia corretto e che il file esiste
             //utilizzando f risolviamo la cosa
             FileReader fr = new FileReader(("textdemo.txt"));
             BufferedReader br = new BufferedReader(fr);
        ) {//corpo try
            String riga = null;
            while ((riga = br.readLine()) != null) {
                System.out.println("Letto: " + riga);
                fr.close();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }//end main
}//end class
