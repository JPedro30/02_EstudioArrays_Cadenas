package estudioArrays;

import java.util.Scanner;

public class EstudioArrayUnidimensional {

    @SuppressWarnings({ "unused", "resource" })
    public EstudioArrayUnidimensional(){

        System.out.println("Estudio Arrays Funciona");

        // DECLARACIÓN DE ARRAYS

        int[] enteros; // Arrays de enteros
        double[] decimales; // Arrays de decimales
        String[] textos; // Arrays de String


        // CONSTRUCCIÓN DE ARRAYS (INSTANCIARLO)

        enteros = new int[5]; // Array de 5 enteros (se inicializan a 0)
        decimales = new double[10]; // Array de 10 decimales (se inicializan a 0.0)
        textos = new String[3]; // Array de 3 String (se inicializan a null)


        // DECLARACIÓN Y CONSTRUCCIÓN EN UNA SOLA LÍNEA

        int[] numeros = new int[5]; // Declaro e instancio en la misma linea el array
        String[] nombres = new String[4]; // Declaro e instancio en la misma linea el array


        // INICIALIZACIÓN DEL ARRAY (FORMA TORPE)

        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30; 


        // DECLARACIÓN + CONSTRUCCION (INSTANCIAR) + INICIALIZACIÓN (FORMA MAS COMUN Y RECOMENDADA)

        int[] edades = {18,19,20,23,26,29}; // Forma correcta
        String[] ciudades = {"Sevilla","Cádiz","Huelva"}; // Forma correcta
        double[] precios = {2.21,34.34,43.12}; // Forma correcta
        String[] cartas = {"1-Oro","2-Oro","3-Oro","4-Oro","5-Oro","6-Oro","7-Oro","8-Oro","9-Oro","Sota-Oro","Caballo-Oro","Rey-Oro"};

        // Ejemplo de forma incorrecta:

        // int[] edades;
        // edades = {18,19,20,23,26,29}; // Pese a parecer que está correctamente escrito, no estamos declarando el tamaño del array.
                                         // y al hacerlo en dos lineas es necesario dar el tamaño fijo del array.

        
        // ACCESO A ELEMENTOS

        // Primer elemento

        System.out.println("La primera carta es "+cartas[0]);

        // Segundo elemento

        System.out.println("La segunda carta es "+cartas[1]);

        // Numeros de elementos del array

        System.out.println("La cantidad de cartas es "+cartas.length);

        // ultimo elemento

        System.out.println("La última carta es "+cartas[cartas.length-1]);


        // RECORRIDO DE ARRAYS

        // RECORRIDO TRADICIONAL

        String[] frutas = {" Manzana", " Pera", " Platano", " Naranja"};

        for (int i = 0; i < frutas.length; i++) { // aqui mostramos el array original
            System.out.println("Fruta "+i+frutas[i]);
        }

        Scanner leer = new Scanner(System.in);

        //for (int i = 0; i < frutas.length; i++) { // usar scanner para escribir en un array
            //System.out.print("Introduzca una fruta y pulse intro : ");
            //frutas[i]=leer.next();
        //}

        //for (int i = 0; i < frutas.length; i++) { // aqui mostramos el nuevo array modificado
            //System.out.println("Fruta "+i+frutas[i]);
        //}
        

        // BUCLE FOR-EACH (FOR MEJORADO)

        for (String fruta : frutas) {
            System.out.println(fruta);
        }


        // BUCLE WHILE

        int i=0;

        while (i<numeros.length) { // muestra desde 0 hasta 4 por que el array es de 5 enteros, pero solo tengo iniciados 3, entonces los dos ultimos son 0
            System.out.println(numeros[i]);
            i++;
        }

        
        // PASO DE ARRAYS A METODOS
        
        double mediaEdad = calculaMedia(edades); // calculo la media de edad
        System.out.println("La media de edad es "+mediaEdad);

        comprobacionReferencias(edades); // voy a comprobar que los objetos se pasan por referencia cambiando las edades de 0 a 10

        mediaEdad = calculaMedia(edades); // calculo la nueva media de edad ahora que todas las edades son de 0 a 10
        System.out.println("La media de edad es "+mediaEdad);


        // HACER UNA COPIA DE UN ARRAY

        int[] copiaEdades = edades; // asi no vale por que al ser objeto la referencia de la memoria es lo que se almacena y entonces ambos arrays son el mismo arrays solo que se llaman distintos        
        int[] copiaEdadesBien = generaCopiaArrays(edades); // asi si se hace un clon o copia de un array

        // EJERCICIO DE EJEMPLO DE USO DE ARRAY UNIDIMENSIONALES RELACIONADOS Y METODOS:

        // arrays de notas, arrays con nombres de alumnos, la nota 1 es del alumno 1

        // ESTOS SON ARRAYS PARALELOS ESTAN RELACIONADOS (NECESITO SOLO UN BUCLE PARA PODER RELACIONARLOS AMBOS)
        int[] notasProgramacion = {8,2,7,3,9,2,9,5,4,6};
        String[] alumnosProgramacion = {"Andres","Arturo","JPedro","Pablo","Paco","Hugo","Ivan","Manuel","Cristian","Marcos"};

        leer = new Scanner(System.in); 

        System.out.println("=====================================");
        System.out.println("SELECTOR DE OPERACIONES");
        System.out.println("=====================================");
        System.out.println("1. Alumnos y notas.");
        System.out.println("2. Media notas clase.");
        System.out.println("3. ¿Cuántos alumnos han suspendidos?");
        System.out.println("4. ¿Quién ha suspendido? y su nota.");
        System.out.println("5. ¿Cuántos alumnos han aprobado?");
        System.out.println("6. ¿Quién ha aprobado? y su nota.");
        System.out.println("7. Alumno con mayor nota.");
        System.out.println("8. Alumno con menor nota.");
        System.out.println("=====================================");
        System.out.print("Seleccione que desea saber : ");

        int seleccion = leer.nextInt();

        System.out.println("=====================================");

        switch (seleccion) {
            case 1:
                mostrarAlumnos(notasProgramacion,alumnosProgramacion); // lista de clase
                break;
            
            case 2:
                media(notasProgramacion); // media de la clase
                break;
            
            case 3:
                numeroSuspenso(notasProgramacion); // numero de suspensos
                break;
            
            case 4:
                suspensos(notasProgramacion,alumnosProgramacion); // Quien ha suspendido y su nota
                break;
            
            case 5:
                numeroAprobado(notasProgramacion); // numero de aprobados
                break;
            
            case 6:
                aprobados(notasProgramacion,alumnosProgramacion); // Quien ha aprobado y su nota
                break;
            
            case 7:
                mayorNota(notasProgramacion,alumnosProgramacion); // Nota mas alta
                break;
            
            case 8:
                menorNota(notasProgramacion,alumnosProgramacion); // Nota mas baja
                break;
        
            default: System.out.println("Valor seleccionado incorrecto.");
                break;
        }
        System.out.println("=====================================");

        

    }

    private int[] generaCopiaArrays(int[] edades) { // esto es un metodo que clona un array
        int[] copia=null; // primero lo inicializo a nulo
        copia = new int[edades.length]; // luego le digo que tiene el mismo tamaño que el anterior
        
        for (int index = 0; index < copia.length; index++) {
            copia[index]=edades[index]; // a cada uno de los indices le doy el mismo valor que el indice del primer array
        }

        return copia; // devuelvo el array
    }

    private void comprobacionReferencias(int[] edades) {
        for (int index = 0; index < edades.length; index++) {
            edades[index]=(int)(Math.random()*10); // cambio el valor de las edades de 0 a 10
        }
    }

    // LOS OBJETOS SE PASAN POR REFERENCIAS (SI SE MODIFICAN EN EL METODO, SE MODIFICA EN EL ORIGINAL)
    private double calculaMedia(int[] edades) {
        double media=0;
        int sum=0;
        for (int edad : edades) {
            sum+=edad;
        }
        media=sum/(double)edades.length;
        return media;
    }

    private void menorNota(int[] notasProgramacion, String[] alumnosProgramacion) {
        int menorNota = notasProgramacion[0]; // creo la variable menorNota y la inicializo con el valor del primer valor del array
        String alumnoMenorNota = alumnosProgramacion[0]; // exactamente igual con el String del nombre del alumno

        for (int i = 0; i < notasProgramacion.length; i++) { // recorro todo el array de notas
            if (notasProgramacion[i]<menorNota) { // en cuanto encuentre una nota menor a la nota que tengo asignada como menor nota
                menorNota=notasProgramacion[i]; // esa nota pasa a ser la nota menor
                alumnoMenorNota=alumnosProgramacion[i]; // y ese alumno pasa a ser el alumno con menor nota
            }
        }
        System.out.println("El alumno con menor nota es "+alumnoMenorNota+" con una nota de "+menorNota); // una vez recorrido todo el array muestro el alumno con menor nota
    }

    private void mayorNota(int[] notasProgramacion, String[] alumnosProgramacion) {
        int mayorNota=notasProgramacion[0]; // creo la variable mayorNota y la inicializo con el valor del primer valor del array
        String alumnoMayorNota=alumnosProgramacion[0]; // exactamente igual con el String del nombre del alumno

        for (int index = 0; index < notasProgramacion.length; index++) { // recorro todo el array de notas
            if (notasProgramacion[index]>mayorNota) { // en cuanto encuentre una nota mayor a la nota que tengo asignada como mayor nota
                mayorNota=notasProgramacion[index]; // esa nota pasa a ser la nota mayor
                alumnoMayorNota=alumnosProgramacion[index]; // y ese alumno pasa a ser el alumno con mayor nota
            }
        }
        System.out.println("El alumno con mayor nota es "+alumnoMayorNota+" con una nota de "+mayorNota); // una vez recorrido todo el array muestro el alumno con mayor nota
    }

    private void numeroAprobado(int[] notasProgramacion) {
        int contadorAprobado=0; // inicializo un contador de aprobados
        for (int index = 0; index < notasProgramacion.length; index++) { // recorro el array de notas
            if (notasProgramacion[index]>=5) {
                contadorAprobado ++; // cada vez que una nota sea mayor o igual a 5 se sumará 1 al contador
            }
        }
        System.out.println("El numero de aprobado es : "+contadorAprobado); // al final muestro el contador
    }

    private void numeroSuspenso(int[] notasProgramacion) {
        int contadorSuspensos = 0; // inicializo un contador de suspensos
        for (int i = 0; i < notasProgramacion.length; i++) { // recorro el array de notas
            if (notasProgramacion[i]<5) { 
                contadorSuspensos ++; // cada vez que una nota sea menor que 5 se sumará 1 al contador
            }
        }
        System.out.println("En total han suspendido : "+contadorSuspensos); // al final muestro el contador
    }

    private void media(int[] notasProgramacion) {
        double media; // creo una variable media
        double sumatorio=0; // creo e inicializo una variable sumatorio
        for (int notas : notasProgramacion) { // he usado un bucle for each para almacenar cada valor de notasProgramacion en la variable notas
            sumatorio = sumatorio + notas; // sumatorio guardará el valor de la suma de las notas (es un almacen)
        }
        media=sumatorio/(double)notasProgramacion.length; // calculo la media entre sumatorio entre la longitud del array
        System.out.println("La media de las "+notasProgramacion.length+" notas, ha sido : "+media); // muestro la cantidad de notas tenidas en cuenta y la media
        
    }

    private void aprobados(int[] notasProgramacion, String[] alumnosProgramacion) {
        for (int index = 0; index < notasProgramacion.length; index++) { // recorro todo el array de notas 
            if (notasProgramacion[index]>=5) { // cada vez que encuentre una nota mayor o igual a 5 que me muestre el nombre y su nota
                System.out.printf("%-8s está aprobado con una nota de : %2d%n",alumnosProgramacion[index],notasProgramacion[index]);
        }
        }
            
    }

    private void mostrarAlumnos(int[] notasProgramacion, String[] alumnosProgramacion) {
        for (int index = 0; index < notasProgramacion.length ; index++) { // recorro todo el array de notas
            System.out.printf("%-8s ha sacado : %2d%n",alumnosProgramacion[index],notasProgramacion[index]); // muestro el nombre y la nota que ha sacado
        }
        
    }

    private void suspensos(int[] notasProgramacion, String[] alumnosProgramacion) {
        for (int index = 0; index < notasProgramacion.length; index++) { // recorro todo el array de notas
            if (notasProgramacion[index]<5) { // cada vez que encuentre una nota menor que 5 que me muestre el nombre y su nota
                System.out.printf("%-8s ha suspendido con una nota de %2d%n",alumnosProgramacion[index],notasProgramacion[index]);
            }
            
        }
        
    }



}
