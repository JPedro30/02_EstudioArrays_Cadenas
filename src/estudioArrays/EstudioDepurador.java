package estudioArrays;

public class EstudioDepurador {

    public EstudioDepurador() {

        // TALLER DEPURACIÓN 1:

        // ACTIVIDAD 1
        int x = 5;
        int y = 10;
        int z = x + y;
        System.out.println("El resultado es: " + z);

        // ACTIVIDAD 2
        int a = 10;
        int b = 5;
        if (a > b) {
            System.out.println("a es mayor que b");
        } else {
            System.out.println("b es mayor o igual que a");
        }

        // ACTIVIDAD 3
        for (int i = 1; i <= 10; i++) {
            System.out.println("Número: " + i);
        }


        // TALLER DEPURACION 2:

        // ACTIVIDAD 4:
        int resultado = suma(5, 10);
        System.out.println("El resultado es: " + resultado);


        // ACTIVIDAD 5:
        int resultado2 = operacion(3, 4);
        System.out.println("El resultado final es: " + resultado2);


        // TALLER DEPURACION 3: 

        // ACTIVIDAD 6:
        // EJERCICIO 1:
        for (int i = 1; i <= 10; i++) {
            System.out.println("Número: " + i);
        }


        // EJERCICIO 2:
        int[] numeros = {2, 4, 6, 8, 10, 12, 14, 16};

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Número en el índice " + i + ": " +numeros[i]);

            if (esPar(numeros[i])) {
                System.out.println(numeros[i] + " es par.");
            }
        }


        // ACTIVIDAD 7:
        int[] valores = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < valores.length; i++) {
            if (valores[i] % 2 == 0) {
                System.out.println("El número " + valores[i] + " es par.");
            } else {
            System.out.println("El número " + valores[i] + " es impar.");
            }
        }


        // TALLER DEPURACION 4:

        // ACTIVIDAD 8: HOT CODE REPLACE
        int m = 5;
        int c = 10;
        int r = m + c;
        System.out.println("El valor de r es: " + r);

        // ACTIVIDAD 9:
        int[] numeros1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < numeros1.length; i++) {
            if (numeros1[i] % 2 == 0) {
                System.out.println(numeros1[i] + " es par.");
            } else {
                System.out.println(numeros1[i] + " es impar.");
            }
        }
        
    }

    public static int suma(int a, int b) {
    return a + b;
    }

    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }

    public static int operacion(int x, int y) {
    int suma = suma(x, y);
    int multiplicacion = multiplica(x, y);
    return suma + multiplicacion;
    }

    public static int multiplica(int a, int b) {
    return a * b;
    }

}
