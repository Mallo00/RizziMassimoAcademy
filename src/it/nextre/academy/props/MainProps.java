package it.nextre.academy.props;

import java.io.*;
import java.util.Properties;
import java.util.Set;

public class MainProps {
    public static void main(String[] args) {
        Properties props = System.getProperties();//predefinite di sistema
        //Set<Object> keys = props.keySet(); uguale a sotto
        var keys = props.keySet();
        //   for (Object key : keys) {
        //       System.out.println(key+" -> "+props.getProperty(key.toString()));
        //       System.out.println(key+" -> "+props.getProperty(key.toString(),"aaa"));
        //   }
        String key = "java.vendor";
        System.out.println(key + "->" + props.get(key));
        System.out.println(key + "->" + props.getProperty(key.toString()));
        System.out.println(key + "->" + props.getProperty(key.toString(), "aaa"));
        System.out.println(key + "->" + props.getProperty(key.toString(), "bbb"));

        String key1 = "java.vendor1";
        System.out.println(key + "->" + props.get(key));
        System.out.println(key + "->" + props.getProperty(key.toString()));
        System.out.println(key + "->" + props.getProperty(key.toString(), "aaa"));
        System.out.println(key + "->" + props.getProperty(key.toString(), "bbb"));


        //custom properties
        System.out.println("\n".repeat(10));

        File preferenze = new File("./preferenze.properties");
        Properties customProps = new Properties();
        if (!preferenze.exists()) {
            try {
                preferenze.createNewFile();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try (Reader reader = new FileReader(preferenze)) {
            //carico in ram
            customProps.load(reader);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(customProps.get("pippo"));
        //caricare una nuova proprietà
        //inserendo scritte, poco versatile
        customProps.setProperty("macchina", "true");
        //sfruttando le mappe di oggetti
        customProps.put("pausa", Boolean.FALSE.toString());
        try (Writer fw = new FileWriter(preferenze)) {
            //scrivo in disco
            customProps.store(fw, "commento");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}//end class
