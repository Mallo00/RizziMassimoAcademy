package it.nextre.academy.esercizi.cap4.Es4_1;

public class Es4_1 {
    public static void main(String[] args) {
        int k=0;
        System.out.println(false && k++>k);//false, perché l'operatore logico && vuole che entrambe le condizioni si verifichino
        // contemporaneamente per ottenere true, e l'incremento di k viene eseguito posteriormente
        System.out.println(false&&++k>0);//true, perché l'operatore logico && vuole che entrambe le condizioni si verifichino
        // contemporaneamente per ottenere true, e l'incremento di k viene eseguito anteriormente
        //EDIT: il risultato è false perché la prima consizione è false
        boolean flag=true;
        k=0;
        System.out.println(flag&&k++==0);//true, perché l'incremento di k viene effettuato a posteriori e flag è impostato a true
        if(!flag)
            saluta();//non saluterà, perchè la condizione è sempre insoddisfatta
        // il compilatore segnala come unreachable statement solo ciò che è nel while, ma non ciò che è nell'if
        if (false)
            System.out.println("sasso");
//        while (false)
  //          System.out.println("sassolino");
        System.out.println("CiaoCIaoCio");
        System.out.println(true||false);//true, perché l'operatore logico or vede sodisfatta una delle sue condizioni

    }

    private static void saluta() {
        System.out.println("Ciao");
    }


}//end class
