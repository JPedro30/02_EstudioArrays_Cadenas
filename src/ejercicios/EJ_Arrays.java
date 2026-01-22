package ejercicios;

import java.util.Arrays;

public class EJ_Arrays {

    public EJ_Arrays(){

        //EJERCICIO 1: Diseñar una función que genere un array que simule un boleto de primitiva. 
        // (Seis números entre 1 y 49 que no se repitan). ( Diseña una funcion generica que devuelva 
        // un cantidad de elementos entre un intervalo y que no se repitan)

        // 2.- Diseñar un programa que me permita almacenar 10 boletos de primitiva, luego genere un sorteo
        // y me diga cuantos aciertos tiene cada boleto.

        int cantNum = 6;
        int valorMIN = 1;
        int valorMAX = 49;

        int cantBoletos = 10;

        int[][] boletos = new int[10][6];

        int[] premiado = new int[cantNum];

        for (int i = 0; i < cantBoletos; i++) {
            boletos[i] = generaNumeroAleatoriosDistintos(cantNum,valorMIN,valorMAX); // falta validacion
        }

        premiado = generaNumeroAleatoriosDistintos(cantNum, valorMIN, valorMAX);

        System.out.println("=================================================================");
        System.out.println("                         SORTEO PRIMITIVA");
        System.out.println("=================================================================");
        System.out.printf("  Boleto PREMIADO: %-24s%n",Arrays.toString(premiado));
        System.out.println("-----------------------------------------------------------------");

        for (int i = 0; i < boletos.length; i++) {
            int aciertos = comparadorBoletos(premiado,boletos,i);
            int numBoleto = (i+1);
            System.out.printf("  Boleto Nº %2d --> %-24s --> Nº aciertos : %1d %n",numBoleto,Arrays.toString(boletos[i]),aciertos);
        }
        System.out.println("=================================================================");

    
    }

    private int comparadorBoletos(int[] premiado, int[][] boletos, int numBoleto) {
        int contadorAciertos = 0;
        for (int index = 0; index < premiado.length; index++) {
            if (premiado[index]==boletos[numBoleto][index]) {
                contadorAciertos++;
            }
        }
        return contadorAciertos;
    }

    private int[] generaNumeroAleatoriosDistintos(int cantNum, int valorMIN, int valorMAX) {
        int[]primitiva = new int[cantNum];
        int numero;
        for (int index = 0; index < cantNum; index++) {
            do {
                numero = (int) ((Math.random()*(valorMAX-valorMIN+1)+valorMIN));
            } while (Repetido(numero,primitiva));
            primitiva[index]=numero;            
        }
        return primitiva;
    }

    private boolean Repetido(int numero, int[] primitiva) {
        boolean repetido = false;
        for (int index = 0; index < primitiva.length; index++) {
            if (primitiva[index]==numero) {
                repetido = true;
                break;
            }
        }
        return repetido;
    }

}
