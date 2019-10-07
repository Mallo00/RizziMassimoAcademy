package it.nextre.academy.supermercato;

public class Cassa {
    private double tot;
    private String scontrino;
    public Cassa(){
        tot=0d;
        scontrino="";
    }
    //add singolo prod
    //add array prod
    //getottale
    //azzera
    public void addProdotto(Prodotto p){
        tot+=p.getPrezzo();
        scontrino+="\n"+p.getNome();
    }
    public void addProdotti(Prodotto[] p){
        for (int i = 0; i < p.length; i++) {
            tot+=p[i].getPrezzo();
        }

    }
    public void reset(){

    }
    public double getTot(){
        return tot;
    }
    public String getScontrino(){
        return scontrino;
    }

}//end class
