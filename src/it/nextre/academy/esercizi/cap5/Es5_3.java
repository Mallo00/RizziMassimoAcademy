package it.nextre.academy.esercizi.cap5;

public class Es5_3 {
    public static void main(String[] args) {
        Auto[] a = new Auto[]{new Auto("Berlina"), new Auto("SUV"), new Auto("Utilitaria"), new Auto("Supercar"),
                new Auto("Utilitaria")};
        int posmax = 0;
        int posmin=0;
        for (int i = 0; i < a.length; i++) {
            System.out.println("Partenza----------------------------------------------------------------");
            a[i].corri();
            if (a[i].getKml() >= a[posmax].getKml()) {
                posmax = i;
            }
            if (a[i].getKml()<=a[posmin].getKml()) posmin=i;
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i].toString());
        }
        System.out.println("L'auto che ha percorso più strada è: " + a[posmax].toString());
        System.out.println("L'auto che ha percorso meno strada è: " + a[posmin].toString());
    }
}//end class
