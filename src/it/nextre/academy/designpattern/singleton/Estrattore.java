package it.nextre.academy.designpattern.singleton;

public class Estrattore {
    public static void main(String[] args) {
        //così creiamo 1 e 1 solo pallottoliere, con costruttore privato
        Pallottoliere p1=Pallottoliere.getInstance();//è lo stesso oggetto, stessa area di memoria
        Pallottoliere p2=Pallottoliere.getInstance();//
        Pallottoliere p3=Pallottoliere.getInstance();//
        //in questo modo vengono applicate le stesse condizioni su ogni oggetto
        p1.estrai();

    }
}//end class
