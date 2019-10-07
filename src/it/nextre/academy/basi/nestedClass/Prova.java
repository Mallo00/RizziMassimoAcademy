package it.nextre.academy.basi.nestedClass;

public class Prova {
    public class Anonima{
        Button btnSave=new Button() {
            @Override
            public void doClick() {
                System.out.println("Hai cliccato salva");
            }
        };
    }
    abstract class Button implements  CLiccabile{}
    public interface CLiccabile{
        void doClick();
    }

}//end class
