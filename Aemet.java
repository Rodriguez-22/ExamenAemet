package ExamenAemet;

import java.util.Scanner;

public class Aemet {
    public static Scanner entrada = new Scanner(System.in);
    static int NDIAS = 7;//constantes para el numero de dias
    static int NCIUDADES = 8;//constante para el numero de ciudades
    static int NTEMPS = 3;//constante para el numero aleatorio de temperaturas
    static String[] jrrDias = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};//array con los dias de la semana
    static String[] jrrCiudad = {"Almeria", "Granada", "Cádiz", "Malaga", "Jaén", "Cordoba", "Huelva", "Sevilla"};//array con las provincias de la junta de andalucia
    // public static Temperaturas[] jrrtemperatura = new Temperaturas[NTEMPS];
    static double[][] jrrTemperatura = new double[NDIAS][NCIUDADES];//matriz q almacena las temperaturas para los dias y las ciudades.
    public static void main(String[] args) {
        Aemet.jrrGenerarRegistroTemp();
        Aemet.jrrListarRegistroTemp();
        //Aemet.tempMedia("Almeria");
    }
    
    //metodo q genera aleatoriamente todas las temperaturas
    public static void jrrGenerarRegistroTemp(){
        for (int i=0; i<NDIAS; i++){//para recorrer cada dia
            for (int j=0; j<NCIUDADES; j++){ //para recorrer cada ciudad
                jrrTemperatura[i][j] = (Math.random()) * (40 -20) + 20;
                /*
                Yo lo q he hecho a sido, generar las temperaturas aleatorias pero en vez de pedirlas por teclado
                he puesto q salgan temperaturas entre 20 y 40 grados
                 */
            }

                // int pmax; int pmin;
            // for (int i=0; i<NDIAS; i++){
            //     System.out.println("Ingrese el valor máximo" + (i+1) +" : ");
            //     pmax = Temperaturas.entrada.next();
            //     System.out.println("Ingrese el valor minimo" + (i-1) +" : ");
            //     jrrCiudad = Temperaturas.entrada.next();
            //     jrrtemperatura[i] = new Temperaturas(pmax, pmin);
            //}
        }
    }

    //esto es la impresion para registrar todas las temperaturas
    public static void jrrListarRegistroTemp(){
        System.out.println("---------------------------------REGISTRO TEMPERATURAS---------------------------");
        System.out.printf("%20s", " ");
        for (int i=0; i<NDIAS; i++){
            System.out.printf("%15s", Aemet.jrrDias[i]);
        };
        System.out.println();
        System.out.println();
        for (int j=0; j<NCIUDADES; j++){
            System.out.printf("%1s", Aemet.jrrCiudad[j]);
            for (int i=0; i<NDIAS; i++){
                System.out.printf("%5.2f", Aemet.jrrTemperatura[i][j]);
                System.out.print("");
                System.out.printf("%1s", " ");
                System.out.printf("%1.2f", Aemet.jrrTemperatura[i][j]);
                System.out.print("");
                System.out.printf("%1s", " ");
                System.out.printf("%1.2f", Aemet.jrrTemperatura[i][j]);
                System.out.print("  ");
            }
            System.out.println();
            System.out.println();   
        }
    }

//      metodo paara sacar la temperatura máxima de una ciudad
//     public static void jrrCiudadTempMax(String jrrCiudad){
//         int iest = getIndexJrrCiudad(jrrCiudad);//obtener el indice de la ciudad
//         if (iest == -1) {//para comprobar por si la ciudad q busca no existe
//             System.out.println("Dia no encontrado");
//             return;
//         }
//         double maxTemp = -1;//inicializar la temperatura máxima
//         int ciudadMax = -1;//inicializa el indice de la estación junto con el de la temperatura máxima
//         for (int j=0; j<NCIUDADES; j++){//se encarga de recorrer todas las estaciones
//             if (jrrTemperatura[j][iest] > maxTemp) {//verifica si la temperatura es mayor que la máxima registrada
//                 maxTemp = jrrTemperatura[j][iest];//actualiza la temperatura maxima
//                 ciudadMax = j;//actualiza el indice de la estacion con la temperatura máxima
//             }
//         }
//         System.out.println("La ciudad con la mayor temperatura en " 
//         + jrrCiudad + " es" + jrrCiudad[ciudadMax] + 
//         " con una temperatura de " + maxTemp);
//         //imprime la ciudad con la temperatura máxima
//     }

//     //metodo para imprimir la temperatura media de una ciudad
//     public static void tempMedia(String jrrCiudad){
//         int iciud = getIndexCiudades(jrrCiudad);//para obtener el indice de la ciudad
//         if (iciud == -1) {//por si la ciudad no existe
//             System.out.println("La ciudad no ha sido encontrada");
//             return;
//         }
//         double suma = 0;//inicializamos las sumas a 0
//         for (int i=0; i<NDIAS; i++){//esto lo hacemos para que recorra todos los dias
//             suma += jrrTemperatura[i][iciud];//para sumar la temperatura de los dias
//         }
//         double media = suma / NDIAS;//la operacion para acalcular la media
//         System.out.println("La temperatura media de " + jrrCiudad + " es: " + media);
//         //para imprimir la temperatura media
//     }
}
