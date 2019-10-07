package it.nextre.academy.esercizi.cap4;

public class es4_13correz {
    public static void main(String[] args) {
        String input="Ciao come va?";
        int nParole=0;
        String speciali=".:,;-_!?";
        CarttereSpeciale[] mem=new CarttereSpeciale[speciali.length()];
        for (int i = 0; i <speciali.length() ; i++) {
            char tmp=speciali.charAt(i);
            mem[i]=new CarttereSpeciale(tmp);
            conteggioCarattereSpeciale(input, mem[i]);

        }
        for (CarttereSpeciale car:mem){
            System.out.println();
        }

    }

    private static void conteggioCarattereSpeciale(String input, CarttereSpeciale carttereSpeciale) {

    }
}//end class


class CarttereSpeciale{
    private char carattere;
    private int occorrenze;
    public CarttereSpeciale(char carattere){
        occorrenze=0;
        this.carattere=carattere;
    }

    @Override
    public String toString() {
        return "CarttereSpeciale{" +
                "carattere=" + carattere +
                ", occorrenze=" + occorrenze +
                '}';
    }
}
