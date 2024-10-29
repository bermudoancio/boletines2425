package cosasDeClase;

import java.util.Arrays;

public class EjemploTernaria {
    public static void main(String[] args) {
        int[] miArray = {1,3,1,1,5,6,8,6};

        System.out.println(Arrays.toString(eliminaDuplicados(miArray)));
    }

    public static int[] eliminaDuplicados(int[] array){
        int[] arraySinDuplicados = new int[array.length];
        int indiceArraySinDuplicados = 0;
        for (int i = 0; i < array.length; i++) {
            if (!buscarElemento(arraySinDuplicados, array[i])){
                arraySinDuplicados[indiceArraySinDuplicados++] = array[i];
            }
        }

        int[] arrayTamExacto = new int[indiceArraySinDuplicados];

        for (int i = 0; i < indiceArraySinDuplicados; i++) {
            arrayTamExacto[i] = arraySinDuplicados[i];
        }

        return arrayTamExacto;
    }

    public static boolean buscarElemento(int[] array, int elem){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elem)
                return true;
        }
        return false;
    }
}
