package ejercicios;

import java.util.Arrays;

public class EJ_TuteV2 {

    public EJ_TuteV2(){

        String[] baraja = { 
        "1O", "2O", "3O", "4O", "5O", "6O", "7O", "10O", "11O", "12O",
        "1C", "2C", "3C", "4C", "5C", "6C", "7C", "10C", "11C", "12C",
        "1E", "2E", "3E", "4E", "5E", "6E", "7E", "10E", "11E", "12E",
        "1B", "2B", "3B", "4B", "5B", "6B", "7B", "10B", "11B", "12B" };

        String[] palos = {"Oros","Copas","Espadas","Bastos"};

        int[] reparto = arrayAleatorio(0, 39, 40);
        //Arrays.sort(reparto);
        //System.out.println(Arrays.toString(reparto));
        
        String[] cartaJugadores = muestraJugada(reparto,baraja);
        
        //System.out.println(Arrays.toString(cartaJugadores));

        for (int i = 0; i < cartaJugadores.length; i++)
            System.out.println("Jugador "+(i+1)+" : "+cartaJugadores[i]);
            
            int paloGanador = (int) (Math.random()*(3-0+1)+0);
            
            System.out.println("Palo ganador : "+palos[paloGanador]);

            
            boolean nohancantado = true;
            for (int y = 0; y < cartaJugadores.length; y++) {
                int canta = 20;
                int[]canto = cante(cartaJugadores[y],paloGanador);
                for (int x = 0; x < canto.length; x++) {
                    if (canto[x]==2) {
                        if (paloGanador==x) {
                            canta=40;
                        }
                        System.out.println("El jugador "+(y+1)+" : puede cantar "+canta+" en "+palos[x]);
                        nohancantado = false;
                    }
                }
            
                
                }

            if (nohancantado) {
                System.out.println("Nadie puede cantar");           
            }
            System.out.println("Fin");
        }

    private int[] cante(String cartaJugadores, int paloGanador) {
        int[]cante = new int[4];
        String[][]palos = {{"11O","12O"},{"11C","12C"},{"11E","12E"},{"11B","12B"}};

        for (int y = 0; y < palos.length; y++) {
            for (int x = 0; x < palos[y].length; x++) {
                if (cartaJugadores.indexOf(palos[y][x]) >= 0) {
                    cante[y]++;
                }
            }
        }
        return cante;
    }
        
    private String[] muestraJugada(int[] reparto, String[] baraja) { // REPASAR ESTE PUTO METODO
        String[]cartaJugadores = new String[4];
        Arrays.fill(cartaJugadores, "");
        int c = 0;
        for (int jug = 0; jug < 4; jug++) {
            for (int x = c; x < (c+10); x++) {
                cartaJugadores[jug]=cartaJugadores[jug]+baraja[reparto[x]];
            }
            c+=10;
        }
        return cartaJugadores;
    }

    private int[] arrayAleatorio(int inf, int sup, int cant) {
        int[]arrayAleatorio = new int[cant];
        int num;
        Arrays.fill(arrayAleatorio, -1);
        if ((sup-inf+1)<cant) {
            return null;
        }
        for (int l = 0; l < cant; l++) {
            do {
                num = (int) (Math.random()*((sup-inf+1)+inf));
            } while (seRepite(arrayAleatorio,num));

        arrayAleatorio[l]=num;
        }
        return arrayAleatorio;
    }

    private boolean seRepite(int[] arrayAleatorio, int num) {
        boolean repetido = false;
        for (int i = 0; i < arrayAleatorio.length; i++) {
            if (arrayAleatorio[i]==num) {
                repetido = true;
                break;
            }
        }
        return repetido;
    }

}
