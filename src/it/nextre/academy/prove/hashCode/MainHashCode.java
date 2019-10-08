package it.nextre.academy.prove.hashCode;

public class MainHashCode {
    public static void main(String[] args) {
        Oggetto o1=new Oggetto("1");
        Oggetto o2=new Oggetto("1");
        System.out.println(o1.hashCode());
        System.out.println(o2.hashCode());
        System.out.println(o1.equals(o2));
        System.out.println(o1==o2);
        System.out.println(o1.toString());
        System.out.println(o2.toString());
        o1=o2;
        System.out.println(o1.equals(o2));
        System.out.println(o1==o2);
        System.out.println(o1.hashCode());
        System.out.println(o2.hashCode());
        System.out.println(o1.toString());
        System.out.println(o2.toString());
        System.out.println("------------------------------");
        o1.setNome("2");
        System.out.println(o1.equals(o2));
        System.out.println(o1==o2);
        System.out.println(o1.hashCode());
        System.out.println(o2.hashCode());
        System.out.println(o1.toString());
        System.out.println(o2.toString());
        System.out.println("-".repeat(100));

        System.out.println("------------------------------");
        Oggetto o3=new Oggetto("1");
        Oggetto o4=new Oggetto("2");
        System.out.println(o3.equals(o4));
        System.out.println(o3==o4);
        System.out.println(o3.hashCode());
        System.out.println(o4.hashCode());
        System.out.println(o3.toString());
        System.out.println(o4.toString());

    }
}//end class
