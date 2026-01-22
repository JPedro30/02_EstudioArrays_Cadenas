package ejercicios;

import java.util.Arrays;

public class EJ_LeyDhodtV2 {

    public EJ_LeyDhodtV2(){

        int escanos = 8;
        String[] partidos = {"P1","P2","P3"};
        int[] votos = {40000,40000,20000};
        //int censo = 410;

        double[][]cocientes = new double[partidos.length][escanos];

        //RELLENAR LA MATRIZ
        for (int y = 0; y < cocientes.length; y++) {
            for (int x = 0; x < cocientes[y].length; x++) {
                cocientes[y][x]=(double) votos[y] / (x+1);                
            }            
        }
        System.out.println("MATRIZ DE COCIENTES :");

        for (int i = 0; i < escanos; i++) {
            System.out.print(String.format("%10d",(i+1)));
        }

        System.out.println();

        //ASI SE MUESTRA LA MATRIZ BONITA
        for (int y = 0; y < cocientes.length; y++) {
            System.out.print(String.format("%-4s", partidos[y]));
            for (int x = 0; x < cocientes[y].length; x++) {
                System.out.print(String.format("%-10.2f", cocientes[y][x]));
            }
            System.out.println();
        }

        
        int[]escanosObtenidos = reparteEscanos(cocientes,partidos.length,escanos,votos);

        System.out.println("ESCAÑOS OBTENIDOS POR PARTIDO :");
        System.out.println(Arrays.toString(escanosObtenidos));



    }

    private int[] reparteEscanos(double[][] cocientes, int numPartidos, int escanos, int[] votos) {
        int[]escanosAsignados = new int[numPartidos];
        for (int k = 0; k < escanos; k++) { // se dan vueltas hasta que se reparten todos los escaños
        
            double maxValor = -1;
            int partidoGanador = -1;
            int divisorGanador = -1;

            for (int y = 0; y < cocientes.length; y++) {
                for (int x = 0; x < cocientes[y].length; x++) {
                    
                    if (cocientes[y][x]>maxValor) { // aqui encontramos el primer mayor
                        
                        maxValor = cocientes[y][x];
                        partidoGanador = y;
                        divisorGanador = x;
                        
                    }else if (cocientes[y][x]==maxValor && votos[y]>votos[partidoGanador]) { // en caso de empate se asigna al que mas voto tenga
                        
                        partidoGanador = y;
                        divisorGanador = x;

                    }else if (cocientes[y][x]==maxValor && votos[y]==votos[partidoGanador] && Math.random()<0.5) { // en caso de empate y tienen los mismos votos
                        
                        partidoGanador = y;
                        divisorGanador = x;

                    }
                }
            }

            escanosAsignados[partidoGanador]++;
            cocientes[partidoGanador][divisorGanador]=0;

        }

        return escanosAsignados;

    }

    
}

