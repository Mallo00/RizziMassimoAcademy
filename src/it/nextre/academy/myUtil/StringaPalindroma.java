package it.nextre.academy.myUtil;

import it.nextre.academy.myUtil.MyOutput;

public class StringaPalindroma {
    public static boolean stringaPalindroma(String s) {
        s = s.replaceAll(" ", "");
        int i = 0;
        for (i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt((s.length() - 1 - i))) {
                break;
            }
        }
        return true;
    }

}//end class
