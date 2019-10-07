package it.nextre.academy.basi.oop;

public class Conto {
   private String nome;
   private String cognome;
   private String cf;
   private String ddn;

   private String numeroConto;
   private String IBAN;
   private double saldo;

   private String nCarta; //CODICE DI 16 CIFRE
   private String cvv; //CODICE DI CONTROLLO
   private String dds; //MM/YY
   private int tipo; //0- debito, 1- credito
   private String circuito;

   public String getNumeroConto(){
       //pericoloso, potrei ritornare un'area di memoria modificabile. meglio ritornare una copia dell'oggetto originale
       //return numeroConto;
       return "AccountNumber: "+numeroConto;
   }

   public boolean paga(double importo){
       if (importo<0) return false;
       if (saldo<importo){
           //non POTREI pagare
           if (getTipo()==1){
               saldo-=importo;
               return true;
           }
           else return false;
       }
       else {
           //
           saldo-=importo;
           return true;
       }
   }

   public double carica(double amount){
       return saldo+=amount;
   }

   public void addebito(double cifraAdde, int tipo){
        if (tipo==0){
        //carta di debito
            if (saldo<cifraAdde){
                System.out.println("Impossibile completare l'operazione: saldo inferiore all'importo inserito");
                System.out.println("Saldo: "+saldo);
            }
        }
        else{
            //carta di credito
        }
   }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getCf() {
        return cf;
    }

    public void setCf(String cf) {
       //occorre evitare il nullPointerException
        if (cf!=null&&cf.length()==16)
        this.cf = cf;
    }

    public String getDdn() {
        return ddn;
    }

    public void setDdn(String ddn) {
        this.ddn = ddn;
    }

    public void setNumeroConto(String numeroConto) {
        this.numeroConto = numeroConto;
    }

    public String getIBAN() {
        return IBAN;
    }

    public void setIBAN(String IBAN) {
        this.IBAN = IBAN;
    }

    public double getSaldo() {
        return saldo;
    }

    void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getnCarta() {
        return nCarta;
    }

    public void setnCarta(String nCarta) {
        this.nCarta = nCarta;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getDds() {
        return dds;
    }

    public void setDds(String dds) {
        this.dds = dds;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getCircuito() {
        return circuito;
    }

    public void setCircuito(String circuito) {
        this.circuito = circuito;
    }
}//end class
