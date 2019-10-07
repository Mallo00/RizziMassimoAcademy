package it.nextre.academy.esercizi.testPingCMD;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class MainPing {

    public static void main(String[] args) {
        /*
        Singolo s = Singolo.getInstance();
        s.sasso();

         */
        String ip = "tropicalacquapark.it";
        String pingResult = "";

        String pingCmd = "ping " + ip;
        try {
            Runtime r = Runtime.getRuntime();
            Process p = r.exec(pingCmd);

            BufferedReader in = new BufferedReader(new
                    InputStreamReader(p.getInputStream()));
            String inputLine = null;
            while (true) {
                if ((inputLine = in.readLine()) == null) break;
                System.out.println(inputLine);
                pingResult += inputLine;
            }
            in.close();

        } catch (IOException e) {
            System.out.println(e);
        }

    }
}
