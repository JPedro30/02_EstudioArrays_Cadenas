package ejercicios;

import excepciones.DniException;

public class EJ_CompruebaDNI {

    public EJ_CompruebaDNI(){

        // EJERCICIO CADENAS: metodo compruebaDni(String dni) objetivo validar dni, si el dni no es
        // correcto, este metodo throw DniException. 8 numeros y 1 letra. String letrasDni "JFK.." (Las que corresponden a los dni), tenemos que dividir el numero entre 23 y conocer el resto entre 0 y 22 y depende de la posicion esa letra es la que necesito.
        // erroes posibles, mas de 9 tamaño, en los numeros no haya solo numero, la letra no sea letra,
        // todo eso debe de lanzar throw exception, 

        String dni = "47348675r";
        
        try {
            compruebaDni(dni);
            System.out.println("DNI : "+dni+" valido.");
        } catch (DniException e) {
            System.out.println(e.getMessage());
        }

    }

    private void compruebaDni(String dni) throws DniException {

        String letrasDni = "TRWAGMYFPDXBNJZSQVHLCKE";

        if (dni.length()!=9) throw new DniException("DNI INVALIDO: Tamaño incorrecto.");

        int numerosDniNum = 0;
        String letra = dni.substring(dni.length()-1);
        String NumDniCadena = dni.substring(0,dni.length()-1);

        
        try {

            numerosDniNum = Integer.parseInt(NumDniCadena);

        } catch (NumberFormatException e) {
            throw new DniException("DNI INVALIDO: Revise los numeros.");
        }   
        
        int resto = numerosDniNum % 23;
        String letra2 = letrasDni.substring(resto,resto+1);            

        if (letra.equalsIgnoreCase(letra2)) {
        }else throw new DniException("DNI INVALIDO: Letra incorrecta.");
        
    }

}
