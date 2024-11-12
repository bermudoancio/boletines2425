package boletinArray1;

import java.util.Arrays;

public class Ejercicio16 {
    public static void main(String[] args) {
        int[][] matrizNumeros = {{1,1,3,4,5}, {1,7,8,9,10}, {5, 3, 1, 9, 9}, {3,8,5,6,3}, {1, 0 , 8, 3, 3}};

        int[][] matrizAdyacentes = crearMatrizAdyacentesPares(matrizNumeros);

        for (int i = 0; i < matrizAdyacentes.length; i++) {
            System.out.println(Arrays.toString(matrizAdyacentes[i]));
        }
    }

    private static int[][] crearMatrizAdyacentesPares(int[][] matrizNumeros) {
        int[][] matrizAdyacentesPares = new int[matrizNumeros.length][matrizNumeros[0].length];

        for (int i = 0; i < matrizNumeros.length; i++) {
            for (int j = 0; j < matrizNumeros[0].length; j++) {
                matrizAdyacentesPares[i][j] = cuentaAdyacentesPares(matrizNumeros, i, j);
            }
        }

        return matrizAdyacentesPares;
    }

    private static int cuentaAdyacentesPares(int[][] matrizNumeros, int i, int j){
        int numeroPares = 0;

        for (int k = i - 1; k <= i + 1; k++) {
            for (int l = j - 1; l <= j + 1; l++) {
                if (k >= 0 && k < matrizNumeros.length
                        && l >= 0 && l < matrizNumeros[0].length
                        && !(k == i && l == j)) {

                    if (matrizNumeros[k][l] % 2 == 0) {
                        numeroPares++;
                    }
                }
            }
        }

        return numeroPares;
    }
}
