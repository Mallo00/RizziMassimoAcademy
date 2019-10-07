package it.nextre.academy.esercizi.cap4.Es4_5;
import it.nextre.academy.myUtil.MyOutput;
public class Es4_5 {
    public  static final int TABELLINA=10;
    public  static final int NUMERI=13;
    public static void main(String[] args) {
        int[][] matriceDiTab=new int[NUMERI][TABELLINA];
        tabellina13(matriceDiTab);
    }
    public static void tabellina13(int[][] matrice){
        for (int i=0;i<matrice.length;i++){
            for (int j=0;j<matrice[0].length;j++){
                matrice[i][j]=(i+1)*(j+1);
            }
        }
        MyOutput.stampaMatriceInt(matrice);
    }
}//end class
