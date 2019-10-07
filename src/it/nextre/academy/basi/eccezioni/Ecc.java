package it.nextre.academy.basi.eccezioni;

public class Ecc {
    public static void main(String[] args) /*throws InvalidTiroException */ {

        int x = 3;
        int y = 0;
        int ris = 0;
        ris = x / y;//errore della classe ArithmeticException



        Dado d1 = new Dado(0, 6);
        try {
            d1.tira();//da gestire perché è checked. bruttissimo throws, meglio try catch
        } catch (InvalidTiroException |IllegalParamException e) {//stesso livello
            //e.printStackTrace();//pila dei metodi richiamati prima dell'eccezione
            System.err.println(e.getMessage());
            //e.getSuppressed();//mi permette di visualizzare tutte le eccezioni richiamate
        }
        catch (Exception e){//la più grande
            System.out.println("eccezione");
        }
        finally {//qualsiasi sia la tua strada, esegui sempr questo alla fine. non sostituisce catch
            System.out.println(d1.getFaccia());
        }
    }
}//end class
