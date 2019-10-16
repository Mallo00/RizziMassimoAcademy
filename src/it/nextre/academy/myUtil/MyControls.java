package it.nextre.academy.myUtil;

public class MyControls {
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
