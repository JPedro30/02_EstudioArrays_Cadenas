package ejercicios;

import java.util.Arrays;

public class EJ_Tute {

    public EJ_Tute(){

        String[] baraja = { 
        "1O", "2O", "3O", "4O", "5O", "6O", "7O", "SO", "CO", "RO",
        "1C", "2C", "3C", "4C", "5C", "6C", "7C", "SC", "CC", "RC",
        "1E", "2E", "3E", "4E", "5E", "6E", "7E", "SE", "CE", "RE",
        "1B", "2B", "3B", "4B", "5B", "6B", "7B", "SB", "CB", "RB" };
        String[] palos = {"O","C","E","B"};
        String[] jugadores = {"Jugador 1 : ","Jugador 2 : ","Jugador 3 : ","Jugador 4 : "};
        int limINF = 0;
        int limSUP = 39;
        int cantJugadas = 3;
        int cantCartas = baraja.length;        

        String[]jugadas = new String[cantCartas];
     
        System.out.println(cantJugadas);

        for (int i = 0; i < cantJugadas; i++) {
            
            jugadas = generaJugadas(baraja,palos,limINF,limSUP,cantCartas);
            
            muestraJugadas(jugadas,jugadores);

            String paloGanador = paloGanador(palos);
            System.out.println(paloGanador);

            calculaGanadores(jugadas,jugadores,paloGanador);
        }
        

    }
    
    private void calculaGanadores(String[] jugadas, String[] jugadores, String paloGanador) {
        for (int x = 0; x < jugadores.length; x++) {
            boolean hanCantado = false;
            if (x>0 && x<=9) {
                if (jugadas[x].contains("C"+paloGanador) && jugadas[x].contains("R"+paloGanador)) {
                    System.out.println(jugadores[0]+" puede cantar cuarenta en "+paloGanador);
                    hanCantado = true;
                }else if (jugadas[x].contains("CO") && jugadas[x].contains("RO")) {
                    System.out.println(jugadores[0]+" puede cantar veinte en Oro");
                    hanCantado = true;
                }else if (jugadas[x].contains("CE") && jugadas[x].contains("RE")) {
                    System.out.println(jugadores[0]+" puede cantar veinte en Espada");
                    hanCantado = true;
                }else if (jugadas[x].contains("CC") && jugadas[x].contains("RC")) {
                    System.out.println(jugadores[0]+" puede cantar veinte en Copa");
                    hanCantado = true;
                }else if (jugadas[x].contains("CB") && jugadas[x].contains("RB")) {
                    System.out.println(jugadores[0]+" puede cantar veinte en Basto");
                    hanCantado = true;
                }
            }
            if (x>9 && x<=19) {
                if (jugadas[x].contains("C"+paloGanador) && jugadas[x].contains("R"+paloGanador)) {
                    System.out.println(jugadores[1]+" puede cantar cuarenta en "+paloGanador);
                    hanCantado = true;
                }else if (jugadas[x].contains("CO") && jugadas[x].contains("RO")) {
                    System.out.println(jugadores[1]+" puede cantar veinte en Oro");
                    hanCantado = true;
                }else if (jugadas[x].contains("CE") && jugadas[x].contains("RE")) {
                    System.out.println(jugadores[1]+" puede cantar veinte en Espada");
                    hanCantado = true;
                }else if (jugadas[x].contains("CC") && jugadas[x].contains("RC")) {
                    System.out.println(jugadores[1]+" puede cantar veinte en Copa");
                    hanCantado = true;
                }else if (jugadas[x].contains("CB") && jugadas[x].contains("RB")) {
                    System.out.println(jugadores[1]+" puede cantar veinte en Basto");
                    hanCantado = true;
                }
            }
            if (x>19 && x<=29) {
                if (jugadas[x].contains("C"+paloGanador) && jugadas[x].contains("R"+paloGanador)) {
                    System.out.println(jugadores[2]+" puede cantar cuarenta en "+paloGanador);
                    hanCantado = true;
                }else if (jugadas[x].contains("CO") && jugadas[x].contains("RO")) {
                    System.out.println(jugadores[2]+" puede cantar veinte en Oro");
                    hanCantado = true;
                }else if (jugadas[x].contains("CE") && jugadas[x].contains("RE")) {
                    System.out.println(jugadores[2]+" puede cantar veinte en Espada");
                    hanCantado = true;
                }else if (jugadas[x].contains("CC") && jugadas[x].contains("RC")) {
                    System.out.println(jugadores[2]+" puede cantar veinte en Copa");
                    hanCantado = true;
                }else if (jugadas[x].contains("CB") && jugadas[x].contains("RB")) {
                    System.out.println(jugadores[2]+" puede cantar veinte en Basto");
                    hanCantado = true;
                }
            }
            if (x>29 && x<=39) {
                if (jugadas[x].contains("C"+paloGanador) && jugadas[x].contains("R"+paloGanador)) {
                    System.out.println(jugadores[3]+" puede cantar cuarenta en "+paloGanador);
                    hanCantado = true;
                }else if (jugadas[x].contains("CO") && jugadas[x].contains("RO")) {
                    System.out.println(jugadores[3]+" puede cantar veinte en Oro");
                    hanCantado = true;
                }else if (jugadas[x].contains("CE") && jugadas[x].contains("RE")) {
                    System.out.println(jugadores[3]+" puede cantar veinte en Espada");
                    hanCantado = true;
                }else if (jugadas[x].contains("CC") && jugadas[x].contains("RC")) {
                    System.out.println(jugadores[3]+" puede cantar veinte en Copa");
                    hanCantado = true;
                }else if (jugadas[x].contains("CB") && jugadas[x].contains("RB")) {
                    System.out.println(jugadores[3]+" puede cantar veinte en Basto");
                    hanCantado = true;
                }
            }
            if (hanCantado) {
                System.out.println("Nadie puede cantar");
            } 
        }
        System.out.println("Fin"); 
    }

    private void muestraJugadas(String[] jugadas, String[] jugadores) {
        int cartasinicio=0;
        int cartasJugador=10;
        for (int y = 0; y < jugadores.length; y++) {
            System.out.print(jugadores[y]);
            System.out.println(Arrays.toString(Arrays.copyOfRange(jugadas,cartasinicio, cartasJugador)));
            cartasinicio+=10;
            cartasJugador+=10;
        }
    }

    private String paloGanador(String[] palos) {
        String palo;
        int num;

        num = (int) (Math.random()*(3-0+1)+0);
        
        palo=palos[num];

        return palo;
    }

    private String[] generaJugadas(String[] cartas, String[] palos, int limINF, int limSUP,int cantCartas) {
        int[]jugadas = new int[cantCartas];
        String[]baraja = new String[cantCartas];
        Arrays.fill(jugadas,-1);
        int num = 0;
        for (int x = 0; x < cantCartas; x++) {
            do {
                num = (int) (Math.random()*(limSUP-limINF+1)+limINF);
            } while (seRepite(jugadas,num));
            jugadas[x]=num;
            baraja[x]=cartas[num];
        }
        
        return baraja;
    }

    private boolean seRepite(int[] jugadas, int num) {
        boolean seRepite = false;
        for (int x = 0; x < jugadas.length; x++) {
            if (num==jugadas[x]) {
                seRepite = true;
                break;
            }
        }
        return seRepite;
    }

}
