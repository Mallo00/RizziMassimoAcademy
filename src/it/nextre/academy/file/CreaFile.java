package it.nextre.academy.file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreaFile {
    public static void main(String[] args) throws IOException {
        FileWriter fw=new FileWriter("C:\\Users\\utente\\Desktop\\gitTemp\\file\\a.txt",true);
        fw.append('a');
        fw.close();
    }
}//end class
