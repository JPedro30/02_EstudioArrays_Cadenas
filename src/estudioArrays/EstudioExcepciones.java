package estudioArrays;

import java.util.Scanner;

import excepciones.InvalidAgeException;
import excepciones.SaldoInsuficienteException;

public class EstudioExcepciones {

    @SuppressWarnings({ "resource", "unused" })
    public EstudioExcepciones(){

        try {

            int resultado = 10/2;
            System.out.println(resultado);
            int[] numeros = {1, 2, 3};
            System.out.println(numeros[2]);
            String texto = "holii";
            System.out.println(texto.length());

            int edad = 14;
            compruebaEdad(edad);

        } 
        catch (ArithmeticException e) {

            System.out.println("No se puede dividir entre 0, paquetón");
            System.out.println(e.getMessage()); // esto dice "/ by zero"

        } 
        catch (ArrayIndexOutOfBoundsException ex) {

            System.out.println("Nos hemos salido del Array, crack");
            System.out.println(ex.getMessage()); // indexBound exception creo

        }
        catch (NullPointerException e) {

            System.out.println("Esta nulo, giliii");
            System.out.println(e.getMessage()); // cannot invoke "String.length()" because "texto" is null

        }
        catch (InvalidAgeException e) {

            System.out.println(e.getMessage());

        }
        catch (Exception e) {
            System.out.println("Esta es la excepcion padre, se pone la ultima");
            System.out.println(e.getMessage()); // funciona igual pero no sabes por que ha dado el error
        }

        System.out.println("Esto sigue como si nada.");


        Scanner scanner = new Scanner (System.in);
        
        boolean correcto = true;

        do {
            try {

                correcto = true;
                System.out.print("Introduzca un numero entero : ");
                String numero = scanner.next();
                int x = Integer.parseInt(numero);

            } catch (NumberFormatException e) {

                correcto = false;
                System.out.println("Has metido una letrilla, espabilao, enga escribelo bien anda.");
                System.out.println(e.getMessage()); // for input String:"(lo que he metido por teclado)"            

            }   
        } while (!correcto);


        try {
            retirarSaldo(100,120);
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }
        
       


    }

    private void retirarSaldo(int saldo, int retirada) throws SaldoInsuficienteException {
        if (retirada>saldo) {
            throw new SaldoInsuficienteException();
        }
    }

    private void compruebaEdad(int edad) throws InvalidAgeException {
        if (edad<18) {
            throw new InvalidAgeException(); 
        }
    }

}
