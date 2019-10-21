package it.nextre.academy.prove.annotazioni;

public class Oggettocazzo {
    int sasso;

    public Oggettocazzo(int sasso) {
        this.sasso = sasso;
    }
    @Annotazione(chiappa = 2)
    public int chiappa(){
        return 5;
    }
}//end class
