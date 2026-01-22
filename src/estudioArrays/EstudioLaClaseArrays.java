package estudioArrays;

import java.util.Arrays;

public class EstudioLaClaseArrays {

    public EstudioLaClaseArrays(){


        // REPRESENTACION EN STRING : METODO = toString()

        String[] tareas = {"Lavar", "Estudiar", "Dormir"};

        // Forma incorrecta
        System.out.println("Incorrecto: " + tareas);

        // Forma correcta
        System.out.println("Correcto: " + Arrays.toString(tareas));


        // REPRESENTACION ARRAYS BIDIMENSIONAL : METODO = deepToString()

        int[][]notas={{1,2,3,4},{5,6,7,8},{9,0,1,2}};

        // Forma correcta
        System.out.println(Arrays.deepToString(notas));


        // ORDENAR ARRAYS : METODO = SORT()

        int[] numeros = {5, 2, 8, 1, 9};
        String[] nombres = {"Ana", "Zacarias", "Carlos", "Beto"};

        System.out.println("Array original: " + Arrays.toString(numeros));
        Arrays.sort(numeros);
        System.out.println("Array ordenado: " + Arrays.toString(numeros));

        System.out.println("Nombres original: " + Arrays.toString(nombres));
        Arrays.sort(nombres);
        System.out.println("Nombres ordenados: " + Arrays.toString(nombres));


        // BUSQUEDA EFICIENTE : METODO = binarySearch() *DEBE DE ESTAR ORDENADO PARA FUNCIONAR*

        int[] numerosOrdenados = {10, 20, 30, 40, 50};

        // Buscar el 30
        int indice1 = Arrays.binarySearch(numerosOrdenados, 30);
        System.out.println("El 30 está en el índice: " + indice1); // 2

        // Buscar el 35 (no existe)
        int indice2 = Arrays.binarySearch(numerosOrdenados, 35);
        System.out.println("El 35 no está. Valor de búsqueda: " + indice2); // -4


        // COMPARAR ARRAYS : METODO = equals()

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        int[] arr3 = {1, 3, 2};
        System.out.println("¿arr1 y arr2 son iguales? " + Arrays.equals(arr1, arr2));
        // true
        System.out.println("¿arr1 y arr3 son iguales? " + Arrays.equals(arr1, arr3));
        // false


        // RELLENAR ARRAYS : METODO = fill()

        int[] marcadores = new int[5];
        // Inicializar todos los marcadores a -1 (p.ej., "no visitado")
        Arrays.fill(marcadores, -1);
        System.out.println("Marcadores: " + Arrays.toString(marcadores));


        // COPIAR UN ARRAYS Y COPIAR EL RANGO : METODO = copyOf() y copyOfRange()

        int[] original = {10, 20, 30, 40, 50};

        // Copia completa
        int[] copiaTotal = Arrays.copyOf(original, original.length);
        System.out.println("Copia total: " + Arrays.toString(copiaTotal));

        // Copia truncada
        int[] copiaTruncada = Arrays.copyOf(original, 3);
        System.out.println("Copia truncada: " + Arrays.toString(copiaTruncada));

        // Copia de rango (índice 1 al 3, sin incluir el 4)
        int[] rango = Arrays.copyOfRange(original, 1, 4);
        System.out.println("Rango (1 al 3): " + Arrays.toString(rango));


    }

}
