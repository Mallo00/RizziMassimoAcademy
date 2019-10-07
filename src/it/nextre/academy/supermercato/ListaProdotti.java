package it.nextre.academy.supermercato;
public class  ListaProdotti{
    Prodotto[] listaP;
    public void add(Prodotto p) {
        Prodotto [] tmp= new Prodotto [listaP.length+1];
        for (int i = 0; i < listaP.length; i++) {
            tmp[i]=listaP[i];
        }
        tmp[tmp.length-1]=p;
        listaP=tmp;
    }
    public ListaProdotti(){
        listaP=new Prodotto[0];
    }
    public boolean contains(Prodotto p){
        for (int i = 0; i<listaP.length; i++) {
            if(listaP[i].equals(p))
                return true;
        }
        return false;
    }
    public void clear() {
        listaP=new Prodotto [0];
    }
}//end class