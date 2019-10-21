package it.nextre.academy.prove.annotazioni;


public class MainAnnotazioni {
    @Override
    public String toString() {
        return "MainAnnotazioni{}";
    }

    public static void main(String[] args) {
        Oggettocazzo oc=new Oggettocazzo(5);
        System.out.println(oc.chiappa());

    }


}//end class
