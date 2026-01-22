package estudioArrays;

public class EstudioArrayBidimensional {

    @SuppressWarnings("unused")
    public EstudioArrayBidimensional(){

        System.out.println("Estudio Array Bidimensional funciona");

        // DECLARAR ARRAYS BIDIMENSIONALES

        int[][]matriz=null;

        // INSTANCIAR ARRAYS BIDIMENSIONALES

        matriz = new int[5][30]; // matriz de 5 filas x 30 columnas

        // AGREGAR DATOS A ARRAYS BIDIMENSIONALES

        matriz[0][0]=5;matriz[0][1]=7; // manera torpisima de meter datos
        matriz[1][0]=8;
        

        // DECLARAR E INSTANCIAR SIMULTANEAMENTE ARRAYS BIDIMENSIONALES

        double[][] matriz2 = new double[5][20]; // se puede declarar e instanciar a la vez

        // DECLARAR, INSTANCIAR Y AGREGAR DATOS A LA VEZ DE ARRAYS BIDIMENSIONALES

        String[] nombres = {"Marcos","Arturo","Pablo","Ivan","Hugo","Fran","Paco","Marta","Abraham"}; // columnas (cantidad de datos dentro de las llaves amarillas)
        String[] asignaturas = {"Programacion","Sistemas","Bases de Datos","Entornos","Lenguaje de Marca"}; // filas (Cantidad de llaves amarillas)
        int[][] matrizNotas = { {4,2,5,6,2,7,8,2,9},
                                {7,8,9,5,7,9,4,6,8},
                                {4,6,7,4,8,9,5,3,5},
                                {3,5,7,8,5,4,6,8,5},
                                {5,7,9,6,4,3,5,7,9}}; // algo asi seria la matriz


        // RECORRER EL ARRAY

        // RECORRER EL ARRAY POR FILAS

        for (int x = 0; x < matrizNotas.length; x++) { // matrizNotas.lenght me da la cantidad de filas que hay
            
            for (int y = 0; y < matrizNotas[x].length; y++) { // matrixNotas[x].lenght hace referencia a la fila en la que este la cantidad de columna que haya
                System.out.print(matrizNotas[x][y]+"-");
            }
            System.out.println();
        }

        System.out.println();
        
        // RECORRER EL ARRAY POR COLUMNAS

        for (int y = 0; y < matrizNotas[0].length; y++) { // matrizNotas[0].length para coger de referencia el tamaño de la primera columna
            
            for (int x = 0; x < matrizNotas.length; x++) { // matrizNotas.length para recorrer la fila al completo
                System.out.print(matrizNotas[x][y]+".");
            }
            System.out.println();
        }

        System.out.println();

        // ARRAYS CON FILAS IRREGULARES

        int [][] ventas = {{2,3,4,5,7},{2,2,2,2,2,2,2,22},{3,3}};

        for (int x = 0; x < ventas.length; x++) { // ventas.lenght me da la cantidad de filas que hay
            
            for (int y = 0; y < ventas[x].length; y++) { // ventas[x].lenght hace referencia a la fila en la que este la cantidad de columna que haya
                System.out.print(ventas[x][y]+"-");
            }
            System.out.println();
        }

        System.out.println();

        // FOR EACH

        for (int[] asignatura : matrizNotas) { // asi saco la primera fila en asignatura
            
            for(int nota:asignatura){ // aqui saco cada nota de la primera fila de la matriz

                System.out.print(nota+"-");

            }
            System.out.println();
        }


        // EXTRAER FILAS DE UNA MATRIZ

        for (int x = 0; x < matrizNotas.length; x++) {
            
            int[]modulo=matrizNotas[x];
            int notaMedia=calculaMedia(modulo);

        }

        

    }

    private int calculaMedia(int[] modulo) {
        throw new UnsupportedOperationException("Unimplemented method 'calculaMedia'");
    }

}
