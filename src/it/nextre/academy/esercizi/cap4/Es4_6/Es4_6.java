package it.nextre.academy.esercizi.cap4.Es4_6;

import it.nextre.academy.myUtil.MyLoadings;
import it.nextre.academy.myUtil.MyOutput;

public class Es4_6 {
    public static final int DIM=3;
    public static void main(String[] args) {
        int[][] mat1=new int[DIM][DIM];
        int[][] mat2=new int[DIM][DIM];
        int[][] matContr=new int[DIM][DIM];
        mat1= MyLoadings.caritcaMatNumeriCasualiInt(mat1, 0, 10);
        mat2= MyLoadings.caritcaMatNumeriCasualiInt(mat2, 0, 10);
        controllaMatrici(mat1,mat2,matContr);
    }

    private static void controllaMatrici(int[][] mat1, int[][] mat2, int[][] matContr) {
        for (int i=0;i<matContr.length;i++){
            for (int j=0;j<matContr[0].length;j++){
                if (mat1[i][j]<mat2[i][j]){
                    matContr[i][j]=-1;
                }else {
                    if (mat1[i][j]>mat2[i][j]){
                        matContr[i][j]=1;
                    }
                    else matContr[i][j]=0;
                }
            }
        }
        System.out.println("Matrice di controllo");
        MyOutput.stampaMatriceInt(matContr);
        System.out.println("Matrice di 1");
        MyOutput.stampaMatriceInt(mat1);
        System.out.println("Matrice di 2");
        MyOutput.stampaMatriceInt(mat2);
    }
}//end class
