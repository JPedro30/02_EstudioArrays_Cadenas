package estudioArrays;

import java.util.Arrays;

public class EstudioCadenas {

    public EstudioCadenas(){

        // A PARTIR DE AHORA TODOS LOS DATOS LOS VAMOS A GUARDAR COMO CADENAS Y VAMOS A PROCESAR LOS DATOS DE ENTRADA.

        // LAS STRING SON INMUTABLES (NO SE PUEDEN MODIFICAR)

        String nombre = "Jose Pedro";
        String nombre2 = new String("Marcos");
        String cadena = "Bienvenido a la clase de Programación   ";

        int tam = cadena.length();
        System.out.println("Tamaño : "+tam);


        // METODO : char charAt(indice) *MUY IMPORTANTE*

        char c = cadena.charAt(0);
        System.out.println(c);


        // METODO : substring = (acorta una cadena) *MUY IMPORTANTE*

        System.out.println(cadena.substring(0,10));
        System.out.println(cadena.substring(10));
        String dni = "31123456J";
        String numDniCadena = dni.substring(0,dni.length()-1);
        System.out.println(numDniCadena);
        String letraDni = dni.substring(dni.length()-1);
        System.out.println(letraDni);
        char carDni = dni.charAt(dni.length()-1);
        System.out.println(carDni);


        // METODO : indexof = (comprueba la posición de una palabra o un caracter en una cadena) *MUY UTILIZADO*

        System.out.println(cadena.indexOf("clase"));
        System.out.println(cadena.indexOf("o"));
        System.out.println(cadena.indexOf("o",10));
        

        // METODO : equals = (compara dos cadenas) *SE UTILIZA MUCHO*

        nombre = "Marcos";
        nombre2 = "marcos";
        System.out.println(nombre.equals(nombre2));
        System.out.println(nombre.equalsIgnoreCase(nombre2));


        // METODO : trim = (quita los espacios por delante y por detras)

        nombre = "    Marcos    ";

        System.out.println(nombre);
        System.out.println(nombre.length());

        String nombre3 = nombre.trim();
        System.out.println(nombre3);
        System.out.println(nombre3.length());

        nombre = nombre.trim();


        // METODO : toUpperCase (pasa a mayusculas)

        System.out.println(nombre.toUpperCase());

        // METODO : toLowerCase (pasa a minusculas)

        System.out.println(nombre.toLowerCase());

        
        // METODO : replace = (reemplazar caracteres, quitar espacios en mitad de la cadena)

        System.out.println(cadena.replace(" ", ""));


        // METODO : startWith = (comprobar si una cadena comienza con una cadena que ponga)

        System.out.println(cadena.startsWith("Bienvenido")); // devuelve true o false


        // METODO : contains = (comprueba si la cadena contiene la cadena que ponga)

        System.out.println(cadena.contains("ido")); // devuelve true o false


        String asignatura = "Programacion";
        char[]caracteres = asignatura.toCharArray();
        System.out.println(caracteres);
        System.out.println(Arrays.toString(caracteres));

        
        // METODO : split = (rompe una cadena en campos)

        String alumno = "Pepe, programacion, BBDD, LLMM";
        String[] nuevoAlumno = alumno.split(","); // aqui digo que el separador es la coma
        System.out.println(Arrays.toString(nuevoAlumno));


    }

}
