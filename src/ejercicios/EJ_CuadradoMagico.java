package ejercicios;

import java.util.Arrays;

public class EJ_CuadradoMagico {

    public EJ_CuadradoMagico(){

        // EJ CUADRADO MAGICOS : Metodo pasar una matriz cuadrada y comprobar que sea cuadrado magico
        // para que sea cuadrado magico las sumas de sus filas, columnas y diagonales debe de ser las mimas.

        int[][] cuadradoMagico =   {{6,32,3,34,35,1},
                                    {7,11,27,28,8,30},
                                    {19,14,16,15,23,24},
                                    {18,20,22,21,17,13},
                                    {25,29,10,9,26,12},
                                    {36,5,33,4,2,31}};

        
        int[] valorSumaFilas;
        int[] valorSumaColumnas;
        int valorDiagonal1;
        int valorDiagonal2;

        valorSumaFilas = recorreFilas(cuadradoMagico);
        //System.out.println(Arrays.toString(valorSumaFilas));
        valorSumaColumnas = recorreColumnas(cuadradoMagico);
        //System.out.println(Arrays.toString(valorSumaColumnas));
        valorDiagonal1 = recorreDiagonal1(cuadradoMagico);
        //System.out.println(valorDiagonal1);
        valorDiagonal2 = recorreDiagonal2(cuadradoMagico);
        //System.out.println(valorDiagonal2);
     
        if (esMagico(valorDiagonal1,valorDiagonal2,valorSumaFilas,valorSumaColumnas)) {
            System.out.println("El cuadrado es Magico.");
        }else System.out.println("El cuadrado no es Magico.");

    }
    
    private boolean esMagico(int valorDiagonal1, int valorDiagonal2, int[] valorSumaFilas, int[] valorSumaColumnas) {
        if (valorDiagonal1!=valorDiagonal2) {
            return false;
        }else if (!Arrays.equals(valorSumaFilas,valorSumaColumnas)) {
            return false;
        }else if (Arrays.binarySearch(valorSumaColumnas,valorDiagonal1)<0) {
            return false;
        }
        return true;
    }

    private int recorreDiagonal2(int[][] cuadradoMagico) {
        int suma = 0;
        int x=0;
        for (int y = cuadradoMagico.length-1; y >= 0; y--) {
            suma=cuadradoMagico[y][x];
            x++;
        }
        return suma;
    }

    private int recorreDiagonal1(int[][] cuadradoMagico) {
        int suma = 0;
        int y=0;
        for (int x = 0; x < cuadradoMagico.length; x++) {
            suma+=cuadradoMagico[y][x];
            y++;
        }
        return suma;
    }

    private int[] recorreColumnas(int[][] cuadradoMagico) {
        int[] valorSumaColumnas = new int[cuadradoMagico.length];
        int sumasColumnas;
        for (int y = 0; y < cuadradoMagico.length; y++) {
            sumasColumnas=sumasColumnas(cuadradoMagico,y);
            valorSumaColumnas[y]=sumasColumnas;
        }
        return valorSumaColumnas;
    }

    private int sumasColumnas(int[][] cuadradoMagico, int y) {
        int suma=0;
        for (int x = 0; x < cuadradoMagico[0].length; x++) {
            suma+=cuadradoMagico[x][y];
        }
        return suma;
    }

    private int[] recorreFilas(int[][] cuadradoMagico) {
        int[] valorSumaFilas = new int[cuadradoMagico.length];
        int sumasFilas;
        for (int x = 0; x < cuadradoMagico[0].length; x++) {
            sumasFilas=sumasFilas(cuadradoMagico,x);
            valorSumaFilas[x]=sumasFilas;
        }
        return valorSumaFilas;
    }

    private int sumasFilas(int[][] cuadradoMagico, int y) {
        int suma=0;
        for (int x = 0; x < cuadradoMagico[0].length; x++) {
            suma+=cuadradoMagico[y][x];
        }
        return suma;
    }

}
