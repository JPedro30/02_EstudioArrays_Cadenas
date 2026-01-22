package excepciones;

public class InvalidAgeException extends Exception {

    public InvalidAgeException(){

        super("No cumple los requisitos de edad");
        
    }

}
