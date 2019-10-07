package it.nextre.academy.myUtil;


import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class PortChecker {

    public static void checkPort(String host, Socket socket){
        for (int i = 1; i <= 65535; i++) {
            try {
                System.out.println("Looking for " + i);
                socket = new Socket(host, i);
                System.out.println("There is a server on port " + i + " of " + host);
            } catch (UnknownHostException e) {
                System.out.println("Exception occured" + e);
                break;
            } catch (IOException e) {
            }
        }
    }
}