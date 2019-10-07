package it.nextre.academy.file;

import it.nextre.academy.basi.inizializzatori.B;

import java.io.*;

public class Lettura {
    public static void main(String[] args) {
        //gestire le eccezioni


        try {
            //dalla riga dell'errore, il programma salta nel catch
            File targhe=new File("C:"+File.separator+"academy"+File.separator+"corretti a casa"+File.separator+"pr090919"+File.separator+"targhe.txt");
            FileReader fr=new FileReader(targhe);
            BufferedReader br=new BufferedReader(fr);
            String riga=null;
            br.mark(0);
            //System.out.println(br.lines().count());
            int righe=0;
                    br.reset();
            br.skip(righe-5);
            while ((riga=br.readLine())!=null){
                System.out.println(riga);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}//end class
