package it.nextre.academy.supermercato;
//classe dei prodotti da banco
public class Cibo extends Prodotto {
    private double prezzoKg;

    Cibo(String nome, String barCode, double prezzo, double pesoKg, double prezzoKg) {
        //super(nome, barCode, pesoKg*prezzoKg, pesoKg, prezzoKg);
        super.setCategoria("da banco");
        this.prezzoKg = prezzoKg;
        //il prezzo di un prod da banco è in base al peso
        setPrezzo();
    }
//inutile, glielo passiamo calcolandolo nel super
 //   public double getPrezzoKg() {
   //     return prezzoKg;
    //}

    public void setPrezzo() {
        super.setPrezzo(prezzoKg * super.getPesoKg());
    }


}//end class
