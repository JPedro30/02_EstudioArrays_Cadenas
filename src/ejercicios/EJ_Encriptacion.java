package ejercicios;

import java.net.SocketTimeoutException;
import java.util.Arrays;

@SuppressWarnings("unused")
public class EJ_Encriptacion {

    public EJ_Encriptacion(){

        // EJERCICIO 1: Crea un método que encripte una cadena por el método de trasposición de los caracteres en base a una matriz.

        int[] clave = { 3, 4, 9, 6, 1, 7, 0, 8, 5, 2 };

        String mensaje = "3496170852";
        String espacios = " ";

        do {
           if (mensaje.length()%clave.length!=0) {
            mensaje=mensaje+espacios;
        } 
        } while (mensaje.length()%clave.length!=0);
        System.out.println("============================");
        System.out.println("MENSAJE SIN CIFRAR:");
        System.out.println(mensaje);
        System.out.println("============================");

        int longitudMensaje = mensaje.length();
        int longitudClave = clave.length;

        int cant = mensaje.length()/clave.length;

        String cadenaEncriptada = "";

        System.out.println("MENSAJE ACORTADO");
        for (int x = 0; x < mensaje.length() ; x+=clave.length) {
            String subCadena = mensaje.substring(x,x+clave.length);
            System.out.println(subCadena);
            cadenaEncriptada+=encripta(subCadena,clave);
        }

        System.out.println("MENSAJE CIFRADO");
        System.out.println(cadenaEncriptada);

        String cadenaDesencriptada="";
        for (int x = 0; x < cadenaEncriptada.length(); x+=clave.length) {
            String subCadena = cadenaEncriptada.substring(x,x+clave.length);
            //System.out.println(subCadena);
            cadenaDesencriptada+=desencripta(subCadena,clave);
        }
        
        System.out.println("MENSAJE DESCIFRADO");
        System.out.println(cadenaDesencriptada);
        

    }

    private String desencripta(String subCadena, int[] clave) {
        char[]subCadenaDesencriptada=new char[clave.length];
        for (int x = 0; x < subCadena.length(); x++) {
            subCadenaDesencriptada[x]=subCadena.charAt(clave[x]);
        }
        return String.valueOf(subCadenaDesencriptada);
    }

    private String encripta(String subCadena, int[] clave) {
        char[]subCadenaEncriptada=new char[clave.length];
        for (int x = 0; x < subCadena.length(); x++) {
            subCadenaEncriptada[clave[x]]=subCadena.charAt(x);   
        }
        return String.valueOf(subCadenaEncriptada);
    }


}
