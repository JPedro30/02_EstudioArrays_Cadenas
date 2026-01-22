package ejercicios;

public class EJ_Rombo {

    public EJ_Rombo(){

        int lados=7;
        
        for (int l = 1; l <= lados; l++) {
        String espaciosArriba = generaEspaciosArriba(l,lados);
        String caracteresArriba = generaCaracteresArriba(l);
        System.out.println(espaciosArriba+caracteresArriba);  
        
        }

        for (int i = 1; i < lados; i++) {
        String espaciosAbajo = generaEspaciosAbajo(i,lados);
        String caracteresAbajo = generaCaracteresAbajo(i,lados);
        System.out.println(espaciosAbajo+caracteresAbajo);
        }
        
    }

    private String generaCaracteresAbajo(int i, int lados) {
        String caracteresAbajo = "";
        int cant=((lados-i)*2)-1;
        for (int j = 0; j < cant; j++) {
            caracteresAbajo+="*";
        }
        return caracteresAbajo;
    }

    private String generaEspaciosAbajo(int i, int lados) {
        String espaciosAbajo = "";
        int cant=i;
        for (int j = 0; j < cant; j++) {
            espaciosAbajo+=" ";
        }
        return espaciosAbajo;
    }

    private String generaCaracteresArriba(int l) {
        String asteriscos  = "";
        int cant=(2*l)-1;
        for (int index = 0 ; index < cant; index++) {
            asteriscos+="*";
        }
        return asteriscos;
    }

    private String generaEspaciosArriba(int l,int lados) {
        String espacios = "";
        int cant=lados-l;        
        for (int i = 0; i < cant; i++) {
        espacios+=" ";
        }
        return espacios;      
        
    }

}
