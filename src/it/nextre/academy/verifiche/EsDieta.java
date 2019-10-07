package it.nextre.academy.verifiche;

public class EsDieta {
    public static void main(String[] args) {
        String input="";
        //controllo sull'esistenza di parametri
        if (args.length<1){
            //decido di lasciare il programma
            System.out.println("input non valido");
            System.exit(-5);
        }
        input=args[0];
        switch (input){
            case "1":
                menu1();
                break;
            case "2":
                menu2();
                break;
            case "3":
                menu3();
                break;
            case "4":
                menu4();
                break;
            case "5":
                menu5();
                break;
            case "6":
                menu6();
                break;
            case "7":
                menu7();
                break;
            default:
                System.out.println("Valore non valido");
                //decido di lasciare il programma
                System.exit(-5);

        }
    }//fina main

    private static void menu1(){
        System.out.println("Lunedi");
        System.out.println("\t- Colazione");
        System.out.println("\t Latte e biscotti");
        System.out.println("\t- Pranzo");
        System.out.println("\t Risotto giallo");
        System.out.println("\t- Cena");
        System.out.println("\t Brodino di pollo");
    }
    private static void menu2(){
        System.out.println("Lunedi");
        System.out.println("\t- Colazione");
        System.out.println("\t Latte e biscotti");
        System.out.println("\t- Pranzo");
        System.out.println("\t Risotto giallo");
        System.out.println("\t- Cena");
        System.out.println("\t Brodino di pollo");
    }
    private static void menu3(){
        System.out.println("Lunedi");
        System.out.println("\t- Colazione");
        System.out.println("\t Latte e biscotti");
        System.out.println("\t- Pranzo");
        System.out.println("\t Risotto giallo");
        System.out.println("\t- Cena");
        System.out.println("\t Brodino di pollo");
    }
    private static void menu4(){
        System.out.println("Lunedi");
        System.out.println("\t- Colazione");
        System.out.println("\t Latte e biscotti");
        System.out.println("\t- Pranzo");
        System.out.println("\t Risotto giallo");
        System.out.println("\t- Cena");
        System.out.println("\t Brodino di pollo");
    }
    private static void menu5(){
        System.out.println("Lunedi");
        System.out.println("\t- Colazione");
        System.out.println("\t Latte e biscotti");
        System.out.println("\t- Pranzo");
        System.out.println("\t Risotto giallo");
        System.out.println("\t- Cena");
        System.out.println("\t Brodino di pollo");
    }
    private static void menu6(){
        System.out.println("Lunedi");
        System.out.println("\t- Colazione");
        System.out.println("\t Latte e biscotti");
        System.out.println("\t- Pranzo");
        System.out.println("\t Risotto giallo");
        System.out.println("\t- Cena");
        System.out.println("\t Brodino di pollo");
    }
    private static void menu7(){
        System.out.println("Lunedi");
        System.out.println("\t- Colazione");
        System.out.println("\t Latte e biscotti");
        System.out.println("\t- Pranzo");
        System.out.println("\t Risotto giallo");
        System.out.println("\t- Cena");
        System.out.println("\t Brodino di pollo");
    }
}//end class
