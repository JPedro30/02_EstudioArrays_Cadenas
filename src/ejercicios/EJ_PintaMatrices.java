package ejercicios;

import java.util.Arrays;

public class EJ_PintaMatrices {

    public EJ_PintaMatrices(){

    // EJERCICIO 3: Diseña un programa en Java que rellene un array de 4x4 de la siguiente manera:
    //  1 0 0 0
    //  0 1 0 0
    //  0 0 1 0
    //  0 0 0 1

        int[][] matriz1 = new int[4][4];

        int numero=1;

        System.out.println("EJERCICIO 3:");
        System.out.println("Matriz antes de realizar cambio:");
        muestraMatriz(matriz1);

        pintaDiagonalPrincipal(matriz1,numero);
        System.out.println("Matriz despues de realizar cambio:");
        muestraMatriz(matriz1);  


    // EJERCICIO 4: Diseña un programa en Java que rellene un array de 4x4 de la siguiente manera:
    //  0 0 0 1
    //  0 0 1 0
    //  0 1 0 0
    //  1 0 0 0

        int[][] matriz2 = new int[4][4];

        int numero2 = 1;

        System.out.println("EJERICIO 4:");
        System.out.println("Matriz antes de realizar cambio:");
        muestraMatriz(matriz2);

        pintaDiagonalMenor(matriz2,numero2);

        System.out.println("Matriz despues de realizar cambio:");
        muestraMatriz(matriz2);


    // EJERCICIO 5: Dado un array de enteros de tamaño 5x5, diseñar un programa en Java que lo rellene como en la siguiente figura:
    //  0 1 2 3 4       0,0 0,1 0,2 0,3 0,4               
    //  1 2 3 4 3       1,0 1,1 1,2 1,3 1,4              
    //  2 3 4 3 2       2,0 2,1 2,2 2,3 2,4         
    //  3 4 3 2 1       3,0 3,1 3,2 3,3 3,4         
    //  4 3 2 1 0       4,0 4,1 4,2 4,3 4,4         

        int[][] matriz3 = new int[5][5];
        int[] numeros = {0,1,2,3,4};
        int[] numerosInversa = {4,3,2,1,0};

        System.out.println("EJERICIO 5:");
        System.out.println("Matriz antes de realizar cambio:");
        muestraMatriz(matriz3);

        for (int x = 0; x < numeros.length; x++) {
            pintaDiagonalSuperior(matriz3, numeros, x);
        }

        for (int y = 1 ; y < numerosInversa.length; y++) {
            pintaDiagonalInferior(matriz3, numerosInversa, y);
        }
        
        
        System.out.println("Matriz despues de realizar cambio:");
        muestraMatriz(matriz3);         
    

    }

    private void pintaDiagonalInferior(int[][] matriz3, int[] numerosInversa, int inicio) {
        int x = matriz3.length-1; // me coloco en la posicion 4
        for (int y = inicio; y < matriz3.length; y++) { // empiezo donde sea el bucle de arriba
            matriz3[y][x]=numerosInversa[inicio];
            System.out.println("Posición : (y,x) ("+y+","+x+") Numero : "+numerosInversa[inicio]+" Indice NumerosInversa: "+inicio);
            x--;
        }
    }

    private void pintaDiagonalSuperior(int[][] matriz3, int[] numeros, int inicio) {
        int y=0;
        for (int x = inicio; x >= 0; x--) {
            matriz3[y][x]=numeros[inicio];
            System.out.println("Posición : (y,x) ("+y+","+x+") Numero : "+numeros[inicio]+" Indice Numeros: "+inicio);
            y++;
        }
    }

    private void pintaDiagonalMenor(int[][] matriz2, int numero2) {
        int y=0;
        for (int x = matriz2.length-1; x >= 0; x--) {
            matriz2[y][x]=numero2;
            y++;
        }
    }

    private void muestraMatriz(int[][] matriz1) {
        for (int y = 0; y < matriz1.length; y++) {
            System.out.println(Arrays.toString(matriz1[y]));;
        }
    }

    private void pintaDiagonalPrincipal(int[][] matriz1, int numero) {
        int y=0;
        for (int x = 0; x < matriz1.length; x++) {
            matriz1[y][x]=numero;       
            y++;     
        }
    }


}
