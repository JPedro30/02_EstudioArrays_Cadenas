package ejercicios;

import excepciones.IsbnException;

public class EJ_ComprobacionISBN {

    public EJ_ComprobacionISBN(){

        //EJERCICIO ISBN-13: Debemos multiplicar cada número por 1 si la posición que ocupa es impar o por 3 si la posición que ocupa 
        //es par y calcular la suma de todos salvo del último que es el dígito de control. Dividimos el resultado de la suma anterior 
        //entre 10 y obtenemos el resto de la división. Restamos a 10 el resto obtenido. El isbn será válido si el valor obtenido es 
        //igual al dígito de control (último dígito del isbn). ( Sí el resultado de la resta es 10 el DC será 0) Ejemplo: Comprueba 
        //la validez del siguiente isbn-13: 978-84-415-2682-2 • Suma: 9*1 + 7*3 + 8*1 + 8*3 + 4*1 + 4*3 + 1*1 + 5*3 + 2*1 + 6*3 + 8*1
        //+ 2*3 = 128 • Cálculo del dígito de control: 128 mod 10 = 8 (el resto). 10 – 8 = 2 (coincide con el dígito de control).

            String ISBN = "978-84-95354-15-0"; //978-84-8130-252-3 B //978-84-8450-382-8 B //978-84-204-4290-7 B //978-84-95354-15-0 B //978-84-4152-682-3 M

            try {
                compruebaIsbn(ISBN);
            } catch (IsbnException e) {
                System.out.println(e.getMessage());
            }


    }

    @SuppressWarnings("unused")
    private void compruebaIsbn(String ISBN) throws IsbnException {
        String copiaISBN=ISBN;
        ISBN=ISBN.replace("-", "");

        if (ISBN.length()!=13) throw new IsbnException();
        String ISBNacortado = ISBN.substring(0,12);

        char ultimoDig = ISBN.charAt(ISBN.length()-1);
        String ultimoDigString=String.valueOf(ultimoDig);    

        long ISBNacortadoINT;
        int ultimoDigINT;

        try {
            ISBNacortadoINT = Long.parseLong(ISBNacortado);
            ultimoDigINT = Integer.parseInt(ultimoDigString);
        } catch (NumberFormatException e) {
            throw new IsbnException();
        }

        int acumulacion=0;

        for (int i = 0; i < ISBNacortado.length(); i++) {
            int posicion = i+1;
            String cifra;
            int num=0;
            cifra=ISBNacortado.substring(i,posicion);
            if (posicion%2!=0) {
                num = Integer.parseInt(cifra);
                acumulacion+=num*1;
            }
            if (posicion%2==0) {
                num = Integer.parseInt(cifra);
                acumulacion+=num*3;
            }     
        }

        int resto = acumulacion%10;
        if (resto==0) {
            resto=10;
        }
        
        if (10-resto==ultimoDigINT) {
            System.out.println("ISBN ( "+copiaISBN+" ) Correcto.");
        }else throw new IsbnException();


    }

}
