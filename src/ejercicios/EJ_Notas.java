package ejercicios;

import java.util.Scanner;

public class EJ_Notas {

    @SuppressWarnings("resource")
    public EJ_Notas() {

        int[][] notas = {
                { 5, 7, 8, 6, 9, 4, 7, 8, 5, 6, 7, 9, 8, 6, 5, 7, 8, 9, 6, 7 },
                { 6, 8, 7, 9, 5, 6, 8, 7, 9, 5, 6, 8, 7, 5, 1, 8, 9, 3, 8, 6 }, // cambiar 3 por 7 y cambiar 1 por 6
                { 7, 6, 9, 8, 7, 5, 6, 9, 8, 7, 5, 6, 4, 8, 7, 6, 5, 2, 9, 7 }, // cambiar 4 por un 9 y 2 por 8
                { 8, 9, 6, 7, 8, 9, 5, 6, 7, 8, 9, 5, 6, 7, 8, 9, 6, 7, 5, 8 },
                { 9, 5, 8, 7, 6, 8, 9, 5, 6, 7, 8, 9, 5, 6, 7, 8, 5, 6, 7, 9 }
        };
        String[] alumnos = {
                "Juan García", "María López", "Carlos Ruiz", "Ana Martinez", "Pedro Sánchez",
                "Laura Fernández", "Diego Torres", "Sofía Romero", "Javier Díaz", "Carmen Muñoz",
                "Alberto Pérez", "Elena González", "Miguel Ángel", "Isabel Jiménez", "Francisco Gil",
                "Lucia Ramos", "Roberto Herrera", "Patricia Vega", "Daniel Moreno", "Cristina Silva"
        };
        String[] asignaturas = { "Programación", "BBDD", "Sistemas", "LLMM", "Entornos" };

        Scanner leer = new Scanner(System.in);

        int opcion;

        do {
            System.out.println("================================================");
            System.out.println("             MENÚ GESTIÓN DE NOTAS");
            System.out.println("================================================");
            System.out.println("1. Mostrar todas las notas de una asignatura."); // ejemplo programacion felipe 8 juan 9
            System.out.println("2. Mostrar notas de cada alumno."); // pedir numero de lista de un alumno y mostrar sus notas en cada asignatura
            System.out.println("3. Mostrar alumno con la mayor media.");
            System.out.println("4. Mostrar alumnos que han sacado mayor o igual que 8 en Programación y que han suspendido Sistemas.");
            System.out.println("5. Mostrar alumno que han suspendido BBDD o Sistemas, only 1.");
            System.out.println("6. Salir."); // no hace nada solo sale del programa
            System.out.println("===========================================================================");

            System.out.print("Introduzca el número de ejercicio que desea realizar : ");
            opcion = leer.nextInt();
            System.out.println("===========================================================================");

        } while (opcion < 1 || opcion > 6);

        switch (opcion) {
            case 1:
                System.out.println("=========================");
                System.out.println("   LISTA DE ASIGNATURA");
                System.out.println("=========================");
                System.out.println("1. Programación.");
                System.out.println("2. BBDD.");
                System.out.println("3. Sistemas.");
                System.out.println("4. LLMM.");
                System.out.println("5. Entornos.");
                System.out.println("================================================");

                System.out.print("Introduzca el numero de la asignatura : ");
                int numAsignatura = leer.nextInt();
                numAsignatura--;
                System.out.println("================================================");

                System.out.printf("%15s%n", asignaturas[opcion]);
                System.out.println("=========================");

                for (int x = 0; x < notas[0].length; x++) {
                    System.out.printf("%-15s -> %1d%n", alumnos[x], notas[numAsignatura][x]);
                }

                System.out.println("=========================");

                break;

            case 2:
                System.out.println("=========================");
                System.out.println("LISTA DE ALUMNOS");
                System.out.println("=========================");
                System.out.println("1. Juan García");
                System.out.println("2. María López");
                System.out.println("3. Carlos Ruiz");
                System.out.println("4. Ana Martinez");
                System.out.println("5. Pedro Sánchez");
                System.out.println("6. Laura Fernández");
                System.out.println("7. Diego Torres");
                System.out.println("8. Sofía Romero");
                System.out.println("9. Javier Díaz");
                System.out.println("10. Carmen Muñoz");
                System.out.println("11. Alberto Pérez");
                System.out.println("12. Elena González");
                System.out.println("13. Miguel Ángel");
                System.out.println("14. Isabel Jiménez");
                System.out.println("15. Francisco Gil");
                System.out.println("16. Lucia Ramos");
                System.out.println("17. Roberto Herrera");
                System.out.println("18. Patricia Vega");
                System.out.println("19. Daniel Moreno");
                System.out.println("20. Cristina Silva");
                System.out.println("================================================");

                System.out.print("Seleccione un numero de la lista : ");
                int numAlumno = leer.nextInt();
                numAlumno--;
                System.out.println("================================================");

                System.out.printf("%-16s%n", alumnos[opcion]);
                System.out.println("=========================");

                for (int y = 0; y < notas.length; y++) { // aqui no estoy seguro si en vez de x es y, por que me muevo en el eje y
                    System.out.printf("%-13s -> %1d%n", asignaturas[y], notas[y][numAlumno]);
                }

                System.out.println("=========================");

                break;

            case 3:

            double mayorMedia = 0;
            String alumnoMayorMedia = "";
            double[] mediaAlumno = new double[notas[0].length];

                for (int x = 0; x < notas[0].length; x++) { // aqui recorro toda la lista de alumnos
                    mediaAlumno[x] = calculaMediaNotasAlumnos(x, notas);
                    System.out.println(mediaAlumno[x]);
                    
                    if (mediaAlumno[x]>mayorMedia) {
                    mayorMedia=mediaAlumno[x];
                    alumnoMayorMedia=alumnos[x];
                }
                }

                System.out.println(
                        "El alumno con mayor media es " + alumnoMayorMedia + " con una media de " + mayorMedia);
                System.out.println("===========================================================================");

                break;

            case 4:
                for (int x = 0; x < notas[0].length; x++) {
                    if (notas[0][x]>=8 && notas[2][x]<5) {
                        System.out.printf("%-16s : ha sacado un %1d en Programación y un %1d en Sistemas.%n",alumnos[x],notas[0][x],notas[2][x]);
                    }
                }

                break;

            case 5:
                for (int x = 0; x < notas[0].length; x++) {
                    boolean bbddSuspensa = notas[1][x]<5;
                    boolean sistemasSuspensa = notas[2][x]<5;
                    if ((bbddSuspensa || sistemasSuspensa) && (!bbddSuspensa || !sistemasSuspensa))  {
                        System.out.printf("%-16s : ha sacado en BBDD un %1d y en Sistemas un %1d.%n",alumnos[x],notas[1][x],notas[2][x]);
                    }
                }

                break;

            

            default:
                System.out.println("Saliendo...");
                break;
        }

    }

    private double calculaMediaNotasAlumnos(int alumnoSel, int[][] notas) {
        double sumaNotasAlumno = 0;
        double media=0;

        for (int y = 0; y < notas.length; y++) {
            sumaNotasAlumno+=notas[y][alumnoSel];
        }

        media=sumaNotasAlumno/ (double) notas.length;

        return media;
    }

}
