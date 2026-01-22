package ejercicios;

public class GuiaRepasoExamen {

    public GuiaRepasoExamen(){

        System.out.println("Guia repaso examen funciona");

        // LARGOS DIFICILES
            // LEY DHONDT
                // 1. declarar matriz
                // 2. rellenarla con los votos, recorriendola posición por posición
                // 3. puedo mostrar la matriz de forma bonita con un print(String.format) como un printf
                // 4. declaro un array unidimensional que lo relleno llamando a un metodo que rapartirá los escaños y hará el resto del ejercicio
                    // 4.1 hago tantas vueltas como escaños tenga que repartir
                    // 4.2 recorro la matriz posicion por posicion buscando 3 condiciones
                        // 4.2.1 condicion 1 posicion en la que me encuentro es mayor que el valor maximo hago intercambio variables
                        // 4.2.2 condicion 2 posicion en la que me encuentro es igual al maximo valor y los votos que tiene el partido me lo determina la y, es mayor que la y ya guardada en el intercambio anterior, hago nuevamente intercambio de variables.
                        // 4.2.3 condicion 3 posicion en la que me encuentro es igual al maximo valor y los votos que tiene el partido me lo determina la y, es igual que la y ya guardada en el intercambio anterior, entonces procedemos a hacer un sorteo al 50/50 con un mathrandom<0.5 y hacemos intercambio de variables.
                    // 4.3 una vez recorrida la matriz entera y pasada todas las condiciones ya tendremos a que partido sumarle el escaño, asi que lo siguiente a hacer es al array que devolveremos en la posicion de la y guardada ++, y en la posicion guardada de y y x de la matriz lo igualamos a 0, para no volver a recoger ese maximo valor.
                // 5 mostramos el array devuelto con los escaños por partido

            // TUTE
                // 1. declaro un array unidimensional del reparto de 40 o el numero de cartas que se vayan a jugar, que se van a rellenar llamando a un metodo reparte carta que tendra liminf, limsup, cant
                    // 1.1 dentro de este metodo hay que crear un metodo para saber si se repite los numeros. (importante, si el lim inf es 0, rellenar este array de -1 con Arrays.fill(nombrearray, -1);)
                // 2. luego rellenaremos un array esta vez String con los valores reales de las cartas, rellenandolo con el metodo para mostrar la jugada de cada jugador
                    // 2.1 como es un array de string rellenaremos este array con "", para eliminar el null, e iremos sumando los valores de las cartas pero en formato cadena, pero todo junto, para ello haremos un doble for pese a ser un array unidimensional, for exterior recorre jugadores, el interior va x = c ; x<(c+10); x++; fuera esta c inicializado a 0 y cuando acabe el for interior c+=10; esto hace un sumatorio de el array creado en Jugadores(for exterior)+baraja[reparto(primerMetodo)[x(for exterior)]] empiece en 0 y 10 luego 10 y 20 asi hasta 30 y 40 (fumadon de jesus)
                // 3. ahora ya viene el final del ejercicio, que es mostrar todo lo obtenido, hacemos un for de el array anterior.lenght
                    // 3.1 mostramos a cada jugador con sus cartas
                    // 3.2 hago un math.random simple de (3-0+1)+0 para que me saque numeros de 0 a 3 para el palo ganador
                    // 3.3 muestro el palo ganador.
                    // 3.4 validaciones de cante, doble for de cartas.lenght
                        // 3.5 creo array unidimensional que llamo al metodo cante y mando el arrayunicreadoantes[contador creado en este for]
                            // 3.5.1 creo un array bidimensional con las posibles combinaciones 11O,12O, 11C,12C etc,
                            // 3.5.2 doble for validacion si (cartaJugadores.indexOf(palos[y][x])>=0) cant[y]++ palos es el arraybidimensional de arriba, tengo que ver que hace el indexof
                        // 3.6 another for cante.lenght (matenme)
                        // 3.7 si canto[i]==2
                            // 3.7.1 si paloganador==x cambio la variable de cantar a 40 en vez de 20
                            // 3.7.2 muestro que el jugador de y+1 puede cantar la variable cantar en el palo palo[x]
                            // 3.7.3 nohancantado = false
                    // 4 si no han cantado (variable booleana creada justo antes del doble for)
                        // 4.1 mostrar si nadie puede cantar

            // GENERA CLAVE
                // 1. genero un array bi tarjeta con el tamaño de fila y de columnas lenghts 
                // 2. genero un array uni que llamo al metodo genera num aleatorio con cant de todos los numeros que se van a meter en el array bi y ahi no se pueden repetir los numeros
                // 3. contador 0 , creo un doble for hasta tarjeta.lenght, en cada una de las posiciones de tarjeta[y][x] asignno aleatorio[contador] y contador++
                // 4. hago escaner del numero que introduce por teclado y creo un contador del numero de fallos
                // 5. do while con la condicion de numIntroducido != tarjeta[numero][letra] && contador>0 
                    // 5.1 condicion 1: numIntro!=tarjeta[numero][letra] contadorfallo-- y muestro que ha fallado
                        // 5.1.1 si el contador es mayor a 0 volver a mostrar la matriz (pijada)
                    // 5.2 else condicion 1: clave correcta break;

            // CIFRADO
                // 1. rellenar de algun caracter el mensaje si no es divisible por la clave con dowhile %
                // 2. rompemos en subcadenas y ciframos con un for hasta el tamaño del mensaje que en cada vuelta sume el tamaño de la clave
                    // 2.1 creamos variable subMensaje que sea un substring del mensaje desde x hasta x+tamaño de la clave esto hara que cada vuelta parta el mensaje en trozos iguales del tamaño de la clave
                    // 2.2 en cadenaEncriptada creada justo antes del for, llamamos al metodo encripta con el submensaje de este momento y la clave
                        // 2.2.1 creamos un array char unidimensional del tamaño de la clave
                        // 2.2.2 un for del tamaño de la subCadena.lenght() y dentro del for hacemo un ArrayChar[clave[x]]=subCadena.charAt(x) ENTENDER QUE HACE ESTO
                        // 2.2.3 retornamos pero String.valueOf entiendo que esto transforma el arraychar como un String
                // 3. rompemos en subcadenas ahora mensaje encriptado y desencriptamos
                    // 3.1 creamos variable subMensaje que sea un substring de la cadenaEncriptada desde x hasta x+tamaño de la clave
                    // 3.2 en cadenaDesencriptada llamamos al metodo desencripta con el submensajeencriptado y la clave
                        // 3.2.1 creamos un array char unidimensional del tamaño de la clave
                        // 3.2.2 un for del tamaño de subCadena.lenght() y dentro del for hacemos subCadenaDesencriptada[x]=subCadena.charAt(clave[x]);
                        // 3.2.3 retornamos String.valueOf subCadenaDesencriptada

        // CORTOS "FACILES"
            // GENERAR CUADRADO MAGICO + MOVERME EN ALGUNA DIAGONAL Y SACAR ALGUNA INFO
                // 1. genero un array bi con el tamaño del cuadrado magico que quiera asignar
                // 2. hacer un for desde 1 hasta el maximo de numeros que se puedan meter en la matriz, si es 5x5 son 25 numeros de 1 a < 26
                // 3. me posiciono desde afuera del for en fila 0 y columna 2, y digo que arrayCuadrado[fila][columna] = x y comienzo a validar
                    // 3.1 condicion 1: x%5==0 si el numero siguiente que voy a meter es multiplo de 5 entonces la fila++;
                    // 3.2 else fila--;
                        // 3.2.1 condicion 2: fila<0 fila=4 o el limite del cuadrado; columna++;
                        // 3.2.2 condicion 3: columa>4 o limite del cuadrado columna = 0; 

                // 4. para recorrerla tenemos que ver exactamente como nos lo pide el ejercicio si es completamente es con un doble for normal
                // 5. si es en diagonal con un doble for pero y e x van sumando y con iguales y si es diagonal inversa igual pero restando
                // 6. para validar los datos, primero recorremos sacamos los datos en esas posiciones y validamos con ifs en esas posiciones.

            // ROMBO
                // 1. declarar los lados del rombo
                // 2. un for para la parte superior desde 1 hasta <= a lados
                    // 2.1 String espacioArriba llamamos a generaEspacioArriba
                        // 2.1.1 este metodo tendra un for que se hara una cant de veces que lo determinara lados-linea en la que estemos en ese momento, y dentro se hara una acumulador de cadena de espacios vacios y retornara los espacios
                    // 2.2 String caracteresArriba llamamos a generaCaracteresArriba
                        // 2.2.2 este metodo tendra un for que se hara una cant de veces que lo determinara (2*linea en la que estamos)-1 y dentro habra un acumulador de cadenas que se acumulara "*" o el simbolo que nos pidan, si es un grupo de caracteres estamos cooked
                    // 2.3 sout de espaciosArriba+caracteresArriba
                // 3. un for para la parte inferior desde 1 hasta < a lados
                    // 3.1 String espacioAbajo llamamos a generaEspacioAbajo
                        // 3.1.1 este metodo tendra un for que se hara una cant de veces que lo determinara la linea en la que estemos y dentro habra un acumulador de cadenas que acumulara espacios
                    // 3.2 String caracteresAbajo llamaos a generaCaracteresAbajo
                        // 3.2.2 este metodo tendra un for que se hara una cant de veces que lo determinara la ((lados-linea en la que estemos)*2)-1; y dentro habra un acumulador que acumulará "*";
                    // 3.3 sout de espaciosAbajo+caracteresAbajo

            // AJEDREZ CABALLO
                // 1. declaro el tablero en un array bi
                // 2. declaro en array uni las posibles posiciones del caballo llandolo posicionesY y posicionesX cuales son estas? , voy poco a poco, colocando al caballo en una posicion si tengo que mover la y en 2,1,-1,-2 muevo la x en consonancia hasta tener todas las posiciones cubiertas
                // 3. posiciono al caballo en una fila = cualquier numero y columna = cualquier numero
                // 4. for desde 0 hasta lenght de cualquiera de los dos array de movimientos
                    // 4.1 int nuevaY que sera y + arrayposicionY[contadordelfor]
                    // 4.2 int nuevaX que sera x + arrayposicionX[contadordelfor]
                    // 4.3 validamos que las posiciones que querramos pintar este dentro del cuadrado con nuevaY >= 0 y < tablero.lenght y nuevaX >=0 y < tablero[nuevaY].lenght
                        // 4.3.1 si es valido entonces tablero[nuevaY][nuevaX]=1; para marcar todas las posiciones
                // 5. y por ultimo mostramos el tablero con un for y un sout arrays.toString de tablero[contadordelfor];

        // VALIDACIONES
            // ISBN
            // DNI
            // CUENTA BANCARIA


    }

}
