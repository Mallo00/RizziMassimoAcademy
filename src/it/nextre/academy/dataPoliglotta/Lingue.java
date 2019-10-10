package it.nextre.academy.dataPoliglotta;

import java.util.HashMap;
import java.util.Map;

public class Lingue {
    private static Map<Integer, String> lingue;

    public static Map<Integer, String> getLingue() {
        lingue = new HashMap<>();
        lingue.put(1, "it");
        lingue.put(2, "en");
        lingue.put(3, "fr");
        lingue.put(4, "de");
        return lingue;
    }
}//end class
