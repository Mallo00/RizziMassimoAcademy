package it.nextre.academy.esercizi.testimoniDiGeova;

import it.nextre.academy.myUtil.net.PingTest;
import it.nextre.academy.myUtil.net.PortChecker;

import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class MainGeova {
    public static void main(String[] args) {
        String host = "93.32.29.34";
        List<Integer> lista=new ArrayList<>();
        try {
            if (PingTest.isReachable(host)) {
                lista=PortChecker.thretedList(host, new Socket());
            } else {
                System.out.println("L'host inserito non è raggiungibile");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}//end class
