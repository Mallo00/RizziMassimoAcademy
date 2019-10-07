package it.nextre.academy.basi.oop;

public class OverX {
    //stesso, nome, stessi parametri, tipo diverso
    //public double somma(int a, int b){
    //    return 0;
    //}


    @Override
    public String toString() {
        return super.toString();//richiamo al metodo tostring di obj
    }

    //due metodi con lo stesso nome ma firme differenti
    public int somma(int a, int b) {
        System.out.println("Somma int int");
        return a + b;
    }

    public double somma(double a, double b) {
        System.out.println("Somma double double");
        return a + b;
    }

    public long somma(long a, long b) {
        System.out.println("Somma long long");
        return a + b;
    }

    public int somma(int... a) {
        System.out.println("Somma int... args");
        int tot = 0;
        for (int i = 0; i < a.length; i++) {
            tot += a[i];
        }
        return tot;
    }

    /*
    public int somma( int... b, float... a) {
        System.out.println("Somma int... args");
        int tot = 0;
        for (int i = 0; i < a.length; i++) {
            tot += a[i];
        }
        return tot;
    }

     */
    public float somma(float a, double b) {
        return (float) (a + b);
    }

    public float somma(float a, float b) {
        return (a + b);
    }

    public double somma(double a, int b) {
        return (a + b);
    }

    public String somma(int i, String x){
        return i+x;
    }


    public static void main(String[] args) {
        OverX tmp = new OverX();
        /**
         * richiama float somma(float a, double b)
         */
        System.out.println(tmp.somma(3, 5.3));
        /**
         * richiama int somma(int a, int b)
         */
        System.out.println(tmp.somma(3, 5));
        /**
         * richiama double somme(double a, double b)
         */
        System.out.println(tmp.somma(3.6, 5));
        /**
         * richiama double somme(double a, double b)
         */
        System.out.println(tmp.somma(3.0, 5.0));
        /**
         * richiama int somme(int a, int b)
         */
        System.out.println(tmp.somma(3, 0x9));
        System.out.println(tmp.somma(3, 2));


    }

}//end class
