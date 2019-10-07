package it.nextre.academy.supermercato;
//classe dei prodotti da banco
public class ProdottoCasalingo extends Prodotto {
    private double categoria;

    ProdottoCasalingo(String nome, String barCode, double prezzo, double pesoKg, double prezzoKg) {
        super(nome, barCode, pesoKg*prezzoKg, pesoKg);
        super.setCategoria("casalingo");
    }
//inutile, glielo passiamo calcolandolo nel super
    //   public double getPrezzoKg() {
    //     return prezzoKg;
    //}


    @Override
    public String toString() {
        return "ProdottoCasalingo{" +
                "categoria=" + categoria +
                '}';
    }
}//end class
