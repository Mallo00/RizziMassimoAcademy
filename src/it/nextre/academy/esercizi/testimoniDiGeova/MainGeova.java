package it.nextre.academy.esercizi.testimoniDiGeova;

import it.nextre.academy.myUtil.PingTest;
import it.nextre.academy.myUtil.PortChecker;

import java.io.IOException;
import java.net.Socket;

public class MainGeova {
    public static void main(String[] args) {
        String host = "93.32.29.34";
        try {
            if (PingTest.isReachable(host)) {
                PortChecker.checkPort(host, new Socket());
            } else {
                System.out.println("L'host inserito non è raggiungibile");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}//end class
