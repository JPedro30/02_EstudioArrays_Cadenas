package ejercicios;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

@SuppressWarnings("unused")
public class Pruebas {

    @SuppressWarnings("resource")
    public Pruebas(){
                
    // EJERCICIO TARJETA CLAVE: Se trata de diseñar un programa que me pida las coordenadas de una tarjeta de claves.
    // Para comprobar su funcionamiento el programa me pedirá 3 claves, por ejemplo:
    // Introduzca la clave F5, Si la clave es correcta me dará la bienvenida la aplicación y terminará el programa y la clave es
    // errónea me pedirá de nuevo esta hasta un máximo de tres veces, tras las cuales me dirá “Lo siento intentos agotados” 
    // y finalizará el programa. Para generar la tarjeta de claves se utilizará un método llamado generaTarjeta() que devolverá 
    // un array bidimensional de 10x10 de números aleatorios sin repetir entre el 1 y el 100.

        int limINF = 10;
        int limSUP = 20;
        int cant = 10;

        String[] filas = {" A "," B "};
        String[] columnas = {" 1 "," 2 "," 3 "," 4 "," 5 "};

        int[]ale = generaNumAleatorio(limINF,limSUP,cant);
        //System.out.println(Arrays.toString(ale));
        int[][]tarjeta = new int[filas.length][columnas.length];
        int c=0;
        for (int y = 0; y < tarjeta.length; y++) {
            for (int x = 0; x < tarjeta[y].length; x++) {
                tarjeta[y][x]=ale[c];
                c++;
            }
        }
        System.out.println("=====================================================");
        System.out.printf("   %s%n",Arrays.toString(columnas));
        for (int i = 0; i < tarjeta.length; i++) {
            System.out.print(filas[i]);
            System.out.println(Arrays.toString(tarjeta[i]));
        }

        

        Scanner leer = new Scanner(System.in);
        int numIntro;
        int contador = 3;
        int letra;
        int numero;
        
        do{
        letra = (int)((Math.random()*((columnas.length-1)-0+1)+0));
        numero = (int)((Math.random()*((filas.length-1)-0+1)+0));
        System.out.println("=====================================================");
        System.out.print("Introduzca las coordenadas de "+filas[numero]+columnas[letra]+" : ");
        numIntro = leer.nextInt();
                if (numIntro!=tarjeta[numero][letra]) {
                    contador--;
                    System.out.println("-----------------------------------------------------");
                    System.out.println("Error, le quedan "+contador+ " intentos.");
                    System.out.println("=====================================================");
                    if (contador>0) {
                        System.out.printf("   %s%n",Arrays.toString(columnas));
                        for (int i = 0; i < tarjeta.length; i++) {
                            System.out.print(filas[i]);
                            System.out.println(Arrays.toString(tarjeta[i]));
                        }
                    }
                }else {
                    System.out.println("Clave correcta.");
                    System.out.println("=====================================================");
                    break;
                }
        } while (numIntro!=tarjeta[numero][letra] && contador>0);

        

        
        
    }

    private int[] generaNumAleatorio(int limINF, int limSUP, int cant) {
        int[]arrayNum = new int[cant];
        int num;
        if ((limSUP - limINF + 1)<= cant) {
            return arrayNum;
        }
        for (int i = 0; i < arrayNum.length; i++) {
            do {
                num = (int)((Math.random()*(limSUP-limINF+1)+limINF));
            } while (seRepite(num,arrayNum));
        arrayNum[i]=num;
        }
        return arrayNum;        

    }

    private boolean seRepite(int num, int[] arrayNum) {
        boolean seRepite=false;
        for (int i = 0; i < arrayNum.length; i++) {
            if (arrayNum[i]==num) {
                seRepite=true;
                break;
            }
        }
        return seRepite;
    }


}
