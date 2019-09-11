package it.nextre.academy.geometria.basi;

import it.nextre.academy.myUtil.MyInput;

public class Multdimensionale {

    public static void array() {

    }

    public static void matrice() {
        //righe-colonne
        String[][] classifica = new String[2][4];
        /*
        classifica
        [0][0] [0][1] [0][2] [0][3]
        [1][0] [1][1] [1][2] [1][3]

         */
        //la dichiarazione new string può essere omessa solo in dichiarazione, non i ìn allocazione.
        //quando si re inizializza la matrice posso ridefinire le dimensioni.
        //ogni riga può avere lunghezza diversa
        //matrice quadrata: righe=colonne
        //colonna: collonna = 1
        //due ARRAY sono uguali quando hanno le stesse dimensioni e hanno valori congruenti.
        //il confronto viene effettuato tramite la classe array.equals

        classifica = new String[][]{
                {"riga 0 colonna 0", "Riga 0 colonna 2", "riga 0 colonna 2", "riga 0 colonna 3"},
                {"riga 1 colonna 0", "Riga 1 colonna 2", "riga 1 colonna 2", "riga 1 colonna 3"},
                {"riga 2 colonna 0", "Riga 2 colonna 2", "riga 2 colonna 2", "riga 2 colonna 3", "Riga 2 colonna 4"},
        };
        for (int riga = 0; riga < classifica.length; riga++) {
            //senza definire la colonna, java rgava l'indirizzo dell'oggetto
            System.out.println(classifica[riga]);
            for (int colonna = 0; colonna < classifica[riga].length; colonna++) {
                System.out.println(classifica[riga][colonna]);
            }
        }

    }

    public static void main(String[] args) {
        if (args.length > 0) {
            //farò delle cose
            for (String arg :
                    args) {
                checkArg(arg);
            }
        } else {
            //eseguo il programma
            array();
            ;
            matrice();
        }

        char[] parola;
        parola = new char[4];
        parola[0] = 'c';
        parola[1] = 'i';
        parola[2] = 'a';
        parola[3] = 'o';
/*
        char[] parola2=new char[]{'c','i','a','o'};
        for(char tmp:parola){
            System.out.println(tmp+".");
        }
        for (int i = 0; i < parola.length; i++) {
            System.out.println(parola[i]);
        }
        for(int i=0;;i++){
            System.out.println("chiappa");
            if (i>5) break;
        }
        int i=0;
        for (int k=0; k<5; k++){
            System.out.println("i="+i+", k="+k);
            if(i>5){
                break;
            }
        }
        for (int j = 0; j < parola.length; j++) {
            System.out.print(parola[j]);
        }

 */
        Multdimensionale obj = new Multdimensionale();

        //obj.es3_2();


        obj.es3_3();


    }

    private static void checkArg(String param) {
        /*switch di prova
        System.out.println("switch di prova");
        byte b=(byte)128;


        int vari=0;
        switch (vari) {
            case 0:
                System.out.println("caso 1");
                break;
            case 1:
                System.out.println("caso 2");
                break;
            default:
                System.out.println("Parametro \"" + param + "\" non valido");
        }//fine switch


        //ignoriamo le differenze di case inserite
        //inizio controllo parametro
        System.out.println("inizio controllo parametro");
        param = param.toLowerCase();
        switch (param) {
            case "pippo":
                System.out.println("caso 1");
                break;
            case "pluto":
                System.out.println("caso 2");
                break;
            default:
                System.out.println("Parametro \"" + param + "\" non valido");
        }//fine switch
        */

        //label
        int x=0;
        blocco1: {
            System.out.println("...");
            if (x==9){break blocco1;}
           // if (x==9){continue blocco1; NON è UN CICLO QUINDI NON è VALIDO
        }

        switch (param) {
            case "pippo":
                System.out.println("caso 1");
                break;
            case "pluto":
                System.out.println("caso 2");
                break;
            case "incremento":
                incremento();

            default:
                System.out.println("Parametro \"" + param + "\" non valido");
        }//fine switch
    }

    public static void incremento(){


        int x=3;
        System.out.println("1) "+x);//3
        x=x++;//=3, errore, prima leggo e poi incremento, ma viene riletto il valore non incrementato e non succede nulla
        System.out.println("2) "+x);//3
        x=++x;//inutile assegnazione, x++ è più immediato
        System.out.println("3) "+x);//4
        x++;
        System.out.println("4) "+x);//5
        x++;


    }

    /**
     * Operazioni che mettono in crisi il compilatore (operazioni con casting incompatibili, divisioni per 0...)
     */
    private void es3_2() {
        int intero;
        byte _byte;
        boolean flag;
        String parola;
        char carat;


        intero = 6;
        _byte = 0;
        flag = true;
        parola = "despacito";
        carat = 'e';
        char caratUni;
        /**
         * troppi caratteri nel literal, occorre ridurre ad un massimo di 3 dopo "|"
         *
         */
        caratUni = '\002';
        System.out.println(caratUni);
        char leta = 'a';
        char letb = 'b';
        //non è possibile effettuare la somma di due caratteri scritti in chiaro, ma è possibilile effettuarla se essi sono scritti in unicode
        //tuttavia occorre fare il casting per riconvertire il risultato prima di visualizzarlo

        //char letc=leta+letb;
        char let1 = 0026;
        System.out.println("Gallo " + let1);
        /*
        for (int i=0;i<3;i++){
            System.out.println("Inserisci un nome: ");
            String tmp= MyInput.leggiRiga();
        }
*/
        /*non è vero
/**
 * non è possibile effettuare la somma di una variabile intero con una stringa poichè i tipi sono incompatibili.
 * Occorre creare un oggetto della classe corrispondente e utilizzare il metodo toString()

 //     no  intero=intero+parola;
        Integer intero2=25;
       // ;
        parola=intero2+parola;
        */
        /**
         * errore logico (divisione per 0) non segnalato dal compilatore, si verifica in runtime
         */
        //System.out.println(intero/_byte);
        //   System.out.println(caratUni);
    }

    //con foreach, scansiona il vettore dall'inizio alla fine ponendo ogni scansione in una variabile d'appoggio
    public void es3_3() {
        /*
        int vetNum[]=new  int[]{9,8,7,6,5,4,3,2,1,0};
        for (int num:vetNum
             ) {
            System.out.print("sasso ");
            System.out.println(num);
        }
        for (int i = 0; i < vetNum.length; i++) {
            System.out.print(vetNum[i]+"-");
        }

         */
        //realizzare una serie di fibonacci e caricarla in un vettore
        int[] vetF = new int[9];
        vetF[0] = 0;
        vetF[1] = 1;
        for (int i = 2; i < vetF.length; i++) {
            vetF[i] = vetF[i - 1] + vetF[i - 2];
        }
        for (int i = 0; i < vetF.length; i++) {
            System.out.println(vetF[i]);
        }

        /*fibonacci di valerip

        int[] fibonacci=new int[MyInput.leggiInteroPositivo()+1];;

        for (int i = 0; i < fibonacci.length; i++) {
            if (i==0){
                fibonacci[i]=0;
                continue;
            }
            if (i==1){
                fibonacci[i]=1;
                continue;
            }
            fibonacci[i]=fibonacci[i-1]+fibonacci[i-2];
        }
        for (int i = 0; i < vetF.length; i++) {
            System.out.println(vetF[i]);
        }


         */

/*creare un vettore di nomi da dimensione e nomi inseriti da tastiera

        String []vetNomi;

        System.out.println("Inserisci il numero di nomi del vettore");
        vetNomi=new String[MyInput.leggiInteroPositivo()];

        for (int i = 0; i < vetNomi.length; i++) {
            System.out.println("Inserisci il "+(i+1)+" nome: ");
            vetNomi[i]=MyInput.leggiRiga();
            System.out.println("");
        }
        for (String appo:
             vetNomi) {
            System.out.println(appo);
        }

 */
        String[] vetNomi;

        System.out.println("Inserisci il numero di nomi del vettore");
        vetNomi = new String[MyInput.leggiInteroPositivo()];

        for (int i = 0; i < vetNomi.length; i++) {
            System.out.println("Inserisci il " + (i + 1) + " nome: ");
            vetNomi[i] = MyInput.leggiRiga();
            System.out.println("");
        }
        for (String appo :
                vetNomi) {
            System.out.println(appo);
        }


    }


}//end class