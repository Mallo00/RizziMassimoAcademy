package it.nextre.academy.myUtil;

import java.io.IOException;
import java.net.InetAddress;

public class PingTest {
    public static void sendPingRequest(String ipAddress) throws IOException {
        InetAddress address = InetAddress.getByName(ipAddress);
        System.out.println("Sending Ping Request to " + ipAddress);
        double start=System.currentTimeMillis();
        if (address.isReachable(1000)){
            double fine=System.currentTimeMillis();
            double ping=fine-start;
            System.out.println("Host is reachable, Ping: "+ping);
        }
        else
            System.out.println("Sorry ! We can't reach to this host");
    }

    public static boolean isReachable(String ipAddress) throws IOException {
        InetAddress address = InetAddress.getByName(ipAddress);
        return address.isReachable(1000);
    }
}//end class
