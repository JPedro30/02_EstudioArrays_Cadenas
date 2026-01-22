package ejercicios;

import java.util.Arrays;

public class EJ_GeneracionCMagico {

    public EJ_GeneracionCMagico(){

        // EJERCICIO 15: Crear una matriz de 5x5 con todos los números enteros comprendidos entre 1 y 25 de forma que coincida la
    // suma de los elementos de cada fila, de cada columna o de las diagonales principales. A este tipo de matriz se le denomina
    // CUADRADO MÁGICO:

    // La construcción de esta matriz se realiza de la siguiente forma: El número 1 se coloca en la primera fila, columna
    // central. Cada número que le sigue (2, 3, ...) se coloca en la fila anterior, columna posterior. Si el número a colocar
    // sigue a un múltiplo de 5, se colocará en la misma columna, pero en la fila posterior.
    // NOTA: la fila anterior a la primera será la última y la columna posterior a la última será la primera.

        int[][] generacionMagica = new int[5][5];

        System.out.println("Cuadrado mágico vacío : ");
        muestraMatriz(generacionMagica);

        int columna=2;
        int fila=0;

        for (int x = 1; x < 26; x++) { // generamos numeros del 1 al 25
            generacionMagica[fila][columna]=x;
            if (x%5==0) {
                fila++;
                if (fila>4) fila=0;
            }else {
                fila--;
                if (fila<0) fila=4;
                columna++;   
                if (columna>4) columna=0;
            }
        }

        System.out.println("Cuadrado mágico relleno : ");
        muestraMatriz(generacionMagica);

    }

    private void muestraMatriz(int[][] matriz1) {
        for (int y = 0; y < matriz1.length; y++) {
            System.out.println(Arrays.toString(matriz1[y]));;
        }
    }

}
