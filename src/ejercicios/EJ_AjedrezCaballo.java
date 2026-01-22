package ejercicios;

import java.util.Arrays;

public class EJ_AjedrezCaballo {

    public EJ_AjedrezCaballo() {

        int[][] tablero = new int[8][8];
        // movimientos del caballo
        int[] movimientosY = { 2, 1, -1, -2, -2, -1, 1, 2 };
        int[] movimientosX = { 1, 2, 2, 1, -1, -2, -2, -1 };
        // posicion inicial
        int fila = 0;
        int col = 0;
        tablero[fila][col] = 2; // marcar la posicion del caballo
        // marcar todas las posiciones posibl es del caballo respecto a esta posicion
        for (int i = 0; i < movimientosX.length; i++) {
            int nuevaY = fila + movimientosY[i];
            int nuevaX = col + movimientosX[i];
            // comprobar que la nueva posicion esta dentro del tablero
            if (nuevaY >= 0 && nuevaY < tablero.length && nuevaX >= 0 && nuevaX < tablero[nuevaY].length) {
                tablero[nuevaY][nuevaX] = 1; // marcar la posicion como alcanzable
            }
        }
        // imprimir el tablero
        for (int x = 0; x < tablero.length; x++) {
            System.out.println(Arrays.toString(tablero[x]));
        }
    }

}
