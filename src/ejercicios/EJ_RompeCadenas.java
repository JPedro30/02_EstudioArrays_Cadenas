package ejercicios;

public class EJ_RompeCadenas {

    public EJ_RompeCadenas(){

        // EJERCICIO Rompe cadenas: Crea un programa que me pida una frase y me la rompa en palabras.

        String mensaje = "Marcos chupala que te gustan los pitos ";
        String palabra = "";

        for (int i = 0; i < mensaje.length(); i++) {
            if (mensaje.charAt(i)!= ' ') {
                palabra+= mensaje.charAt(i);
            }
            if (mensaje.charAt(i)== ' ' && palabra.length()!=0) {
                System.out.println(palabra);
                palabra = "";
            }
        }

    }

}
