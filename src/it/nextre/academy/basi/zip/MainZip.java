package it.nextre.academy.basi.zip;

import it.nextre.academy.basi.html.HtmlBuilder;
import it.nextre.academy.myUtil.DummyData;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class MainZip {
    public static void main(String[] args) {
        //specifico il path di salvataggio
        Path destination = Paths.get(System.getenv("SystemDrive"), "Academy", "Corretti a casa", "pr090919", "dummyFiles");
        //creo i file
        creaDummyFile(destination, 15, "___", "test", "html");
        //cerco i file che iniziano con "___"
        File[] fArray = destination.toFile().listFiles(f -> f.getName().startsWith("___"));
        List<File> files = Arrays.asList(fArray);
        //files.forEach(System.out::println);

        //zippa(files, destination, "archive");
    }

    private static void creaDummyFile(Path folder, int nFiles, String prefix, String name, String ext) {
        if (!folder.toFile().exists()){
            folder.toFile().mkdir();
        }

        if (!folder.toFile().canWrite()) {
            System.out.println("Non posso");
            return;
        }
        for (int i = 0; i < nFiles; i++) {
            String html = new HtmlBuilder("Account page").addH(1, "ACCOUNT").addP("username: " + DummyData.getEmail()).addP("password: " + DummyData.getPassword(8)).getPage();
            String dummyText = "username: " + DummyData.getEmail() + "\npassword: " + DummyData.getPassword(8);
            String tmpFileName = prefix + name + i + "." + ext;
            Path tmpPath = folder.resolve(Paths.get(tmpFileName));
            File tmpFile = new File(tmpPath.toUri());
            try (FileWriter fw = new FileWriter(tmpFile)) {
                fw.write(dummyText);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static File zippa(List<File> files, Path destination, String FileName) {
        Path outputPath = destination.resolve(Paths.get(FileName) + ".zip");
        File outputFIle = outputPath.toFile();
        try (ZipOutputStream zipper = new ZipOutputStream(new FileOutputStream(outputFIle.getAbsolutePath()));) {
            for (File file : files) {
                ZipEntry entry = new ZipEntry(/* nome del file nell'archivio */file.getName());
                zipper.putNextEntry(entry);
                FileInputStream fis = new FileInputStream(file.getAbsolutePath());
                byte[] bytes = new byte[4096/*dimensione del chunk nel file system*/];
                int byteread;
                while ((byteread = fis.read(bytes)) != -1) {
                    zipper.write(bytes, 0, byteread);
                }
                fis.close();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}//end class
