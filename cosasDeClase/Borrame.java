package cosasDeClase;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Borrame {
    public static final int TAMANO = 10;


    public static void main(String[] args) {
        int[][] matriz = new int[5][6];
        int[][] matriz2 = new int[5][5];

        System.out.println(esMatrizCuadrada(matriz));
        System.out.println(esMatrizCuadrada(matriz2));

    }

    public static boolean esMatrizCuadrada(int[][] matriz) {
        int filas = matriz.length;

        for (int i = 0; i < matriz.length; i++) {
            if (filas != matriz[i].length){
                return false;
            }
        }

        return true;
    }

    /**
     * Rellena con números aleatorios el array pasado como parámetro.
     * Los números aleatorios serán del 0 al 100
     * @param array
     */
    public static void rellenaAleatorios(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
    }

    public static int[] contarTerminaciones(int[] array) {
        int[] repeticionTerminaciones = new int[10];

        for (int i = 0; i < array.length; i++) {
            int digitoTermina = array[i] % 10;
            repeticionTerminaciones[digitoTermina]++;
        }

        System.out.println("holaa");

        return repeticionTerminaciones;
    }

    public static void numeroTerminacionMax(int[] repeticionTerminaciones) {

        int max = -1;

        for (int i = 0; i < repeticionTerminaciones.length; i++) {
            if (repeticionTerminaciones[i] > max) {
                max = repeticionTerminaciones[i];
            }
        }

        for (int repeticiones: repeticionTerminaciones) {
            if (repeticiones > max){
                max = repeticiones;
            }
        }

        System.out.println("La/s terminaciones que más se han repetido son: ");
        for (int i = 0; i < repeticionTerminaciones.length; i++) {
            if (repeticionTerminaciones[i] == max){
                System.out.printf("%d: %d veces\n", i, max);
            }
        }

    }


}
