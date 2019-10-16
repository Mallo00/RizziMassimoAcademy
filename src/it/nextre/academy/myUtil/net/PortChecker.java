package it.nextre.academy.myUtil.net;


import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

public class PortChecker {

    public static void checkPort(String host, Socket socket) {
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

    public static List<Integer> getPortList(String host, Socket socket) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 65535; i++) {
            try {
                System.out.println("Looking for " + i);
                socket = new Socket(host, i);
                list.add(i);
                System.out.println("There is a server on port " + i + " of " + host);
            } catch (UnknownHostException e) {
                System.out.println("Exception occured" + e);
                break;
            } catch (IOException e) {
            }
        }
        return list;
    }

    public static List<Integer> thretedList(String host, Socket socket) {
        int nThread=100;
        int i = 65535 / nThread;
        Runnable[] ricerche = new Runnable[nThread];
        for (int j = 0; j < ricerche.length; j++) {
            ricerche[j] = new Ricerca(host, socket, i*j, nThread);
        }
        Thread[] threads = new Thread[nThread];
        for (int j = 0; j < threads.length; j++) {
            threads[j]=new Thread(ricerche[j]);
        }
        for (int j = 0; j < threads.length; j++) {
            threads[j].start();
        }
        return new ArrayList<>();
    }
}


class Ricerca implements Runnable {
    int i;
    String host;
    Socket socket;
    int nThreads;

    public Ricerca(String host, Socket socket, int i, int nThreads) {
        this.i = i;
        this.host = host;
        this.socket = socket;
        this.nThreads=nThreads;
    }

    @Override
    public void run() {
        //System.out.println(i);
        thretedList(host, socket, i, nThreads);
    }

    public static List<Integer> thretedList(String host, Socket socket, int i, int nThreads) {
        List<Integer> list = new ArrayList<>();
        for (; i < 65535/nThreads; i++) {
            try {
                socket = new Socket(host, i);
                list.add(i);
                System.out.println("There is a server on port " + i + " of " + host);
            } catch (UnknownHostException e) {
                System.out.println("Exception occured" + e);
                break;
            } catch (IOException e) {
            }
        }
        return list;
    }


}