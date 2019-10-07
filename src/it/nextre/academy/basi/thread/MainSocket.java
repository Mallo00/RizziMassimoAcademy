package it.nextre.academy.basi.thread;


import it.nextre.academy.myUtil.MyInput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class MainThread {

    private static int cont = 0;

    public static synchronized int getnext() {
        return cont++;
    }


    public static void main(String[] args) throws IOException {

        ExecutorService ex= Executors.newFixedThreadPool(7);//dichiaro un numerodi thread da creare
        //ho un insieme definito di thread da far eseguire
        for (int i = 0; i < 10; i++) {
            ex.submit(Task::new);
        }
        System.out.println("a");
        while (!ex.isShutdown()){
            try {
                ex.shutdown();//smetti di eseguire thread
                ex.awaitTermination(1, TimeUnit.SECONDS);//consento un tempo massimo per effettuare la terminazione
                System.out.println("b");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                System.out.println("Sassolino");
            }
        }

/*
        Runnable task = new Runnable() {
            @Override
            public void run() {
                int pos = MainThread.getnext();
                System.out.println(pos + " Inizio...");
                Random r = new Random();
                Runtime runner = Runtime.getRuntime();
                try {
                    Thread.sleep(1000+r.nextInt(3000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                try {
                    //runner.exec("C:\\Programmi Portable\\nc\\nc.exe www.google.com 80");
                    //runner.exec("C:\\Windows\\System32\\cmd.exe");
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println("...fine di " + pos);
            }
        };
        Thread[] tasks = new Thread[0];
        for(int i = 0; i<tasks.length;i++){
            tasks[i]=new Thread(task);
        }
        for(int i = 0; i<tasks.length;i++){
            tasks[i].start();
        }
        Runtime runner = Runtime.getRuntime();
        try {
            //runner.exec("C:\\Programmi Portable\\nc\\nc.exe www.google.com 80");
            //runner.load("C:\\Windows\\System32\\cmd.exe");
        } catch (Exception e) {
            e.printStackTrace();
        }
        //Runtime.getRuntime().exec(new String[] {"cmd", "/K", "Start", ""});
*/


        Thread[] tasks = new Thread[10];
        for(int i = 0; i<tasks.length;i++){
            tasks[i]=new Thread(new Task());
        }
        for(int i = 0; i<tasks.length;i++){
            tasks[i].start();
        }



    }//end main

}//end class

class Task implements Runnable {
    @Override
    public void run() {
        System.out.println("Task running...");
        String hostName = "localhost";
        int portNumber = 80;
        try(Socket echoSocket = new Socket(hostName, portNumber)) {
            //Scrive sulla Socket
            PrintWriter out = null;
            out = new PrintWriter(echoSocket.getOutputStream(), true);
            //legge dalla Socket
            BufferedReader in = null;
            in = new BufferedReader(new InputStreamReader(echoSocket.getInputStream()));
            out.println("GET /phpinfo.php HTTP/1.1");//specificare comando e risorsa da ottenere out.println("GET /infophp.php HTTP/1.1");

/*
            echoSocket.getKeepAlive();
            out.println("Host: google.com");
            System.out.println("extra header, doppio invio per fermare");
            while ((txt = MyInput.leggiRiga()).length() > 0) {
                out.println(txt);
            }
            out.println("\n");//non fatta per restare in attesa
*/
            String output = "";
            while (true) {
                if ((output = in.readLine()) == null) break;
                System.out.println(output);
                System.out.println(output.length());
            }
            //in.lines().forEach(System.out::println);
            echoSocket.close();
            in.close();
            out.close();
 //           System.out.println("chiuso tutto");
        } catch (IOException e) {
            e.printStackTrace();
        }
        ;
    }
}