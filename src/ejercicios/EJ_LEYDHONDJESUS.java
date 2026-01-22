package ejercicios;

import java.util.Arrays;

public class EJ_LEYDHONDJESUS {

    public EJ_LEYDHONDJESUS(){

        int escanos = 8;
        String[] partidos = {"P1","P2","P3"};
        int[] votos = {200,100,90};
        //int censo = 410;

        double[][]cocientes = new double[partidos.length][escanos];

        //RELLENAR LA MATRIZ
        for (int y = 0; y < cocientes.length; y++) {
            for (int x = 0; x < cocientes[y].length; x++) {
                cocientes[y][x]=(double)votos[y]/(x+1);                
            }            
        }

        for (int y = 0; y < cocientes.length; y++) {
            System.out.println(Arrays.toString(cocientes[y]));
        }

        int esc=0;
        int[] escanosObtenidos = new int[cocientes.length];

        do {
            double mayor=buscaMayor(cocientes);
            //System.out.println(mayor);
            int[] partidoMayor = asignaMayorConPartidos(cocientes,mayor);
            //System.out.println(Arrays.toString(partidoMayor));
            int partido = asignaEscano(escanosObtenidos,partidoMayor);
            escanosObtenidos[partido]++;
            esc++;
        } while (esc<escanos);
        
        System.out.println(Arrays.toString(escanosObtenidos));



    }

    private int asignaEscano(int[] escanosObtenidos, int[] partidoMayor) {
        int partido = -1;
        int maxEscano = -1; // recorr el ultimo partido al que hay que asignarle un escaño
        for (int x = 0; x < partidoMayor.length; x++) {
            if (partidoMayor[x]>0 && escanosObtenidos[x]>maxEscano) {
                partido=x;
                maxEscano=escanosObtenidos[x];
            }
        }
        return partido;
    }

    private int[] asignaMayorConPartidos(double[][] cocientes, double mayor) {
        int[] partidos = new int[cocientes.length];
        
        for (int y = 0; y < cocientes.length; y++) {
            for (int x = 0; x < cocientes[y].length; x++) {
                if (cocientes[y][x]==mayor) {
                    partidos[y]++;
                    cocientes[y][x]=0;
                }
            }    
        }
        return partidos;
    }

    private double buscaMayor(double[][] cocientes) {
        double mayor = -1;
        for (int y = 0; y < cocientes.length; y++) {
            for (int x = 0; x < cocientes[y].length; x++) {
                if (cocientes[y][x]>mayor) {
                    mayor=cocientes[y][x];
                }
            }
        }
        return mayor;
    }

}
