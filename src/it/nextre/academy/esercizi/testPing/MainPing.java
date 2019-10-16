package it.nextre.academy.esercizi.testPing;

import it.nextre.academy.myUtil.net.PortChecker;

import java.io.IOException;
import java.net.Socket;

class MainPing {

    public static void main(String[] args) {

        PortChecker.checkPort("127.0.0.1", new Socket());
        try {
            String ipAddress = "tropicalacquapark.it";
            Pinger.sendPingRequest(ipAddress);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
