package it.nextre.academy.verifiche;
//utilizzare l'inizializzatore per avvisare della costruzione dei veicoli
public class EsVeicoli {
    public static void main(String[] args) {
        String input="";
        //controllo sull'esistenza di parametri
        if (args.length<1){
            //decido di lasciare il programma
            System.out.println("input non valido");
            System.exit(-5);
        }
        input=args[0];

    }
}//end class
