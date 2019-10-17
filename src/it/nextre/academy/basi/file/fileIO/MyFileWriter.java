package it.nextre.academy.basi.file.fileIO;

import it.nextre.academy.myUtil.dummyObj.Umano;

import java.io.*;

public class MyFileWriter {
    //riceve le coordinate del file e lo crea
    public static PrintWriter createFile(String pathName) {
        //in un try, perché potrebbero sollevarsi eccezioni in IO
        try {
            File listOfNames = new File(pathName);
            PrintWriter infoToWrite = new PrintWriter(new BufferedWriter(new FileWriter(listOfNames)));
        } catch (IOException e) {
            System.out.println("Errore IO");
            System.exit(0);
        }
        return null;
    }

    //mi permentte di ottenere una stringa contenente le info di un oggetto e di scriverle in un file specifico
    public static void createHuman(Umano u, PrintWriter pw) {
        String humanData = u.getCognome() + " " + u.getNome();
        humanData += Integer.toString(u.getEta());
        pw.println(humanData);
    }

    public static void getFileInfo() {
        System.out.println("Informazioni nel file\n");
        File listOfNames = new File("C:" + File.pathSeparator + "Academy" + File.pathSeparator + "Corretti a casa" + File.pathSeparator + "pr090919" + File.pathSeparator + "files" + File.pathSeparator + "Prove" + File.pathSeparator + "umani.txt");

        try {
            //legge una serie di caratteri simultaneamente
            BufferedReader getInfo=new BufferedReader(new FileReader(listOfNames));
            String custInfo =getInfo.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}//end class
