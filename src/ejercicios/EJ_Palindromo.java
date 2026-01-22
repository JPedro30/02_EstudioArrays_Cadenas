package ejercicios;

public class EJ_Palindromo {

    public EJ_Palindromo(){

        //EJERCICIO Palindromo: Un programa que me pida una frase y e diga si es palíndroma. Busca frases palíndromas en internet.

        String palindromo = "dabale arroz a la zorra el abad";

        palindromo=palindromo.replace(" ", "");

        String palindromoInv = "";

        System.out.println(palindromo);

        for (int i = 0; i < palindromo.length(); i++) {
            palindromoInv=palindromo.charAt(i)+palindromoInv;
        }

        System.out.println(palindromoInv);

        if (palindromo.equalsIgnoreCase(palindromoInv)) {
            System.out.println("Es una frase palindroma");
        }else System.out.println("No es una frase palindroma");
        

    }

}
