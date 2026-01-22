package ejercicios;

import java.util.Arrays;

public class EJ_LeyDhond {

    public EJ_LeyDhond(){

        int escanos = 7;
        String[] grupos = {"P1","P2","P3"};
        int[] votos = {100,250,70};
        //int censo = 410;

        double[][]matrizDhond = new double[grupos.length][escanos];

        
        //  INTRODUCIMOS LOS VOTOS
        for (int y = 0; y < matrizDhond.length; y++) {
            matrizDhond[y][0]=votos[y];
        }
    
        calculaVotos(matrizDhond);

        System.out.println("Calculo los votos, para los escaños");
        muestraMatriz(matrizDhond, grupos);
        System.out.println();

        calculaEscanos(matrizDhond,escanos,votos);        
        muestraMatriz(matrizDhond, grupos);
        

    }

    private void calculaEscanos(double[][] matrizDhond,int numEscanos,int[]votos) {

        int[]escanos = new int[matrizDhond.length];

        for (int i = 0; i < numEscanos ; i++) {
            double mayorVoto= -1;
            int posY = -1;
            int posX = -1;

            for (int y = 0; y < matrizDhond.length; y++) {
                for (int x = 0; x < matrizDhond[y].length; x++) {
                    if (matrizDhond[y][x]>mayorVoto) { // cuando hay empates en vez de >= poner solo > sin empates dejar >=
                        mayorVoto=matrizDhond[y][x];
                        posY = y;
                        posX = x;
                    }
                }
            }
            matrizDhond[posY][posX] = 0;
            escanos[posY]++;
        }
        System.out.println(Arrays.toString(escanos));
    }

    private void calculaVotos(double[][] matrizDhond) {
        for (int y = 0; y < matrizDhond.length; y++) {
            for (int x = 1; x < matrizDhond[y].length; x++) {
                matrizDhond[y][x]=Math.floor(matrizDhond[y][0]/(x+1)*100)/100;
            }
        }
    }

    private void muestraMatriz(double[][] matrizDhond, String[] grupos) {
        for (int i = 0; i < matrizDhond.length; i++) {
            System.out.print(grupos[i]);
            System.out.println(Arrays.toString(matrizDhond[i]));
        }
    }

}
