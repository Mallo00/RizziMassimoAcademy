package it.nextre.academy.esercizi.criptaggioMap;

import java.util.HashMap;
import java.util.Map;

public class MappaChiavi {
    private static Map<Character, Character> mappaChiavi = new HashMap<>();
    private static MappaChiavi instance = null;

    public synchronized static MappaChiavi getInstance() {
        if (instance == null) instance = new MappaChiavi();
        return instance;
    }

    private MappaChiavi() {
        mappaChiavi.put('a', 'l');
        mappaChiavi.put('s', 'k');
        mappaChiavi.put('d', 'j');
        mappaChiavi.put('f', 'h');
        mappaChiavi.put('q', 'z');
        mappaChiavi.put('w', 'x');
        mappaChiavi.put('e', 'c');
        mappaChiavi.put('r', 'v');
        mappaChiavi.put('t', 'b');
        mappaChiavi.put('y', 'n');
        mappaChiavi.put('u', 'm');
        mappaChiavi.put('i', 'p');
        mappaChiavi.put('o', 'o');
        mappaChiavi.put('l', 'a');
        mappaChiavi.put('k', 's');
        mappaChiavi.put('j', 'd');
        mappaChiavi.put('m', 'f');
        mappaChiavi.put('z', 'g');
        mappaChiavi.put('b', 'q');
        mappaChiavi.put('n', 'w');
        mappaChiavi.put('v', 'e');
        mappaChiavi.put('c', 'r');
        mappaChiavi.put('x', 't');
        mappaChiavi.put('h', 'y');
        mappaChiavi.put('p', 'i');
        mappaChiavi.put('g', 'u');

        mappaChiavi.put('!', '?');
        mappaChiavi.put('.', ':');
        mappaChiavi.put(',', ';');
        mappaChiavi.put('-', '_');
        mappaChiavi.put('"', '£');
        mappaChiavi.put('$', '%');
        mappaChiavi.put('&', '/');
        mappaChiavi.put('(', ')');
        mappaChiavi.put('=', '^');

        mappaChiavi.put('?', '!');
        mappaChiavi.put(':', '.');
        mappaChiavi.put(';', ',');
        mappaChiavi.put('_', '-');
        mappaChiavi.put('£', '"');
        mappaChiavi.put('%', '$');
        mappaChiavi.put('/', '&');
        mappaChiavi.put(')', '(');
        mappaChiavi.put('^', '=');


    }


    public static Map<Character, Character> reversedMap() {
        Map<Character, Character> inv = new HashMap<>();
        for (Map.Entry<Character, Character> entry : mappaChiavi.entrySet())
            inv.put(entry.getValue(), entry.getKey());
        return inv;
    }


    public static String cripta(String s) {
        char[] chars = s.trim().toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (mappaChiavi.containsValue(chars[i])) {
                chars[i] = (mappaChiavi.get(chars[i]));
            } else {
                if (mappaChiavi.containsValue(Character.toLowerCase(chars[i]))) {
                    chars[i] = Character.toUpperCase(mappaChiavi.get(Character.toLowerCase(chars[i])));
                }
            }
        }
        return new String(chars);
    }

    public static String decripta(String s) {
        char[] chars = s.trim().toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (reversedMap().containsValue(chars[i])) {
                chars[i] = (reversedMap().get(chars[i]));
            } else {
                if (reversedMap().containsValue(Character.toLowerCase(chars[i]))) {
                    chars[i] = Character.toUpperCase(reversedMap().get(Character.toLowerCase(chars[i])));
                }
            }
        }
        return new String(chars);
    }

}//end class