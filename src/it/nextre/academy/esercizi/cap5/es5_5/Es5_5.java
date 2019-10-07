package it.nextre.academy.esercizi.cap5.es5_5;
//Es 5.5
//Realizzare la simulazione interattiva del gioco sasso-carta-forbice. Il giocatore dovrà giocare contro il
//computer 5 giocate. Al termine di ogni giocata si vedrà chi ha vinto, al termine delle 5 giocate il giocatore
//che ha vinto di più vincerà la partita.

import it.nextre.academy.designpattern.singleton.Pallottoliere;
import it.nextre.academy.myUtil.MyInput;
import java.util.ArrayList;

public class Es5_5 {
    private static final int N_GIOCATE = 5;

    public static void main(String[] args) throws InterruptedException {
        Player g1=iscrizione();//mi iscrivo
        Player cpu=new Player("CPU");//preparo la cpu
        gioco(g1, cpu);
    }

    private static void gioco(Player g1, Player cpu) throws InterruptedException {
        ArrayList<String> mosse=new ArrayList<>();//arraylist di mosse
        mosse.add("Sasso");
        mosse.add("Carta");
        mosse.add("Forbice");
        for (int i = 0; i < N_GIOCATE; i++) {
            String mossaG1="";
            String mossaCPU=cpu.gioca(mosse);
            do {
                mossaG1=g1.gioca(g1.getNome()+", fai la tua mossa!");
                Thread.sleep(1500);
                if (!mosse.contains(mossaG1)){
                    System.out.println("Valore non valido, riprova.");
                }
            }while (!mosse.contains(mossaG1));
            System.out.println("Sasso...");
            Thread.sleep(1500);
            System.out.println("... Carta...");
            Thread.sleep(1500);
            System.out.println("Forbice!");
            Thread.sleep(1500);
            System.out.print(g1.getNome()+": "+mossaG1+"! | ");
            System.out.println(cpu.getNome()+": "+mossaCPU+"!");
            Thread.sleep(1500);
            if (!mossaCPU.equals(mossaG1)){
                if((mossaCPU.equals("Carta")&&mossaG1.equals("Sasso"))||(mossaCPU.equals("Forbice")&&mossaG1.equals("Carta"))
                        ||(mossaCPU.equals("Sasso")&&mossaG1.equals("Forbice"))){
                    System.out.println("Ha vinto la CPU!");
                    cpu.vittoria();
                }
                else {
                    System.out.println("Ha vinto "+g1.getNome()+"!");
                    g1.vittoria();
                }
            }
            else System.out.println("Round in pareggio!");
            Thread.sleep(1500);
        }
        Thread.sleep(1500);
        if (g1.getnVittorie()==cpu.getnVittorie()){
            System.out.println("PAREGGIO POPPOOOOO");
        }else {
            if (g1.getnVittorie()>cpu.getnVittorie()){
                System.out.println("La vittoria finale va a: "+g1.getNome());
            }
            else {
                System.out.println("La vittoria finale va alla cpu!");
            }
        }
    }

    private static Player iscrizione() {
        System.out.println("inserisci il tuo nome");
        return new Player(MyInput.leggiRiga());
    }
}//end class
