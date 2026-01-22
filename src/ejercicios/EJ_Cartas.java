package ejercicios;

import java.util.Arrays;

@SuppressWarnings("unused")
public class EJ_Cartas {

    public EJ_Cartas() {

        // BAJARA SPANISH : Con la Spanish Draw de 40 carta dividida en 4 palos, Oro,
        // Copa, Espada, Basto
        // repartimos 4 cartas a 2 jugadores, 10 jugadas, luego una carta ganadora, que
        // será la que utilice
        // para hacer el recuento de cuantas veces le ha salido esa carta a cada jugador
        // y comprobar quien es el ganador.

        String[] barajaEspañola = { 
        "1-ORO", "2-ORO", "3-ORO", "4-ORO", "5-ORO", "6-ORO", "7-ORO", "S-ORO", "C-ORO", "R-ORO",
        "1-COP", "2-COP", "3-COP", "4-COP", "5-COP", "6-COP", "7-COP", "S-COP", "C-COP", "R-COP",
        "1-ESP", "2-ESP", "3-ESP", "4-ESP", "5-ESP", "6-ESP", "7-ESP", "S-ESP", "C-ESP", "R-ESP",
        "1-BAS", "2-BAS", "3-BAS", "4-BAS", "5-BAS", "6-BAS", "7-BAS", "S-BAS", "C-BAS", "R-BAS" };

        int valorMIN = 0;
        int valorMAX = 39;
        int cantCartas = 8;
        int cantPartidas = 10;
    
        int[][] partida = new int[cantPartidas][];
        
        // GENERO EL ARRAY BIDIMENSIONAL CON LAS JUGADAS Y LAS CARTAS DE LOS 2 JUGADORES
        for (int i = 0; i < cantPartidas; i++) {
            partida[i] = generadorNumerosEnArraysAleatorios(valorMIN, valorMAX, cantCartas);
        }

        // GENERO LA CARTA GANADORA
        int cartaGanadora = (int) (Math.random() * ((valorMAX - valorMIN + 1) + valorMIN));


        // CONTADOR DE CUANTAS VECES ACIERTA CADA JUGADOR LA CARTA GANADORA
        int contadorAciertosJug1 = 0;
        int contadorAciertosJug2 = 0;

        for (int y = 0; y < partida.length; y++) {
            for (int x = 0; x < partida[0].length; x++) {
                if (x < 4) {
                    if (partida[y][x]==cartaGanadora) {
                        contadorAciertosJug1++;
                    }
                }else {
                    if (partida[y][x]==cartaGanadora) {
                        contadorAciertosJug2++;
                    }
                }
            }
        }

        //muestraMatriz(partida); // SIRVE PARA VER LA MATRIZ Y VER QUE SE HAYA GENERADO TODOS LOS NUMEROS BIEN

        // MUESTRO TODAS LAS CARTAS DEL JUGADOR 1 y JUGADOR 2
        System.out.println("====================================================");
        System.out.println("       JUGADOR 1                    JUGADOR 2");
        System.out.println("====================================================");

        for (int y = 0; y < partida.length; y++) {
            for (int x = 0; x < partida[0].length; x++) {
                if (x==4) { // METO UNA SEPARACIÓN CADA 4 CARTAS
                    System.out.print("     ");
                }
                System.out.print(barajaEspañola[partida[y][x]] + " ");                
            }
            System.out.println();
        }

        System.out.println("====================================================");

        // MUESTRO LA CARTA GANADORA
        System.out.println("----------------------------------------------------");
        System.out.println("La carta ¡GANADORA! es : " + barajaEspañola[cartaGanadora]);

        // MUESTRA LOS ACIERTOS DE LOS JUGADORES
        System.out.println("----------------------------------------------------");
        System.out.println("Aciertos del JUG 1 : "+contadorAciertosJug1+"       Aciertos del JUG 2 : "+contadorAciertosJug2);
        System.out.println("----------------------------------------------------");


        // MUESTRO EL RESULTADO EMPATE / GANADOR JUG 1 / GANADOR JUG 2
        if (contadorAciertosJug1 == contadorAciertosJug2) {
            System.out.println("¡Han quedado EMPATE JUGADOR 1 y JUGADOR 2!");
        } else if (contadorAciertosJug1 > contadorAciertosJug2) {
            System.out.println("¡El GANADOR es el JUGADOR 1!");
        } else
            System.out.println("¡El GANADOR es el JUGADOR 2!");
        System.out.println("----------------------------------------------------");

    }

    private int[] generadorNumerosEnArraysAleatorios(int valorMIN, int valorMAX, int cantCartas) {
        int[] partida = new int[cantCartas];
        Arrays.fill(partida, -1);
        int numero;
        for (int i = 0; i < cantCartas; i++) {
            do {
                numero = (int) (Math.random() * ((valorMAX - valorMIN + 1) + valorMIN));
            } while (repetido(numero, partida));
            partida[i] = numero;
        }
        return partida;
    }

    private boolean repetido(int numero, int[] partida) {
        boolean repetido = false;
        for (int i = 0; i < partida.length; i++) {
            if (partida[i] == numero) {
                repetido = true;
                break;
            }
        }
        return repetido;

    }

    private void muestraMatriz(int[][] matriz1) {
        for (int y = 0; y < matriz1.length; y++) {
            System.out.println(Arrays.toString(matriz1[y]));
            ;
        }
    }

}
