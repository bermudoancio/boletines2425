package boletinArray1;

public class Jardin {
    public static final int SEMILLA = 1;
    public static final int AGUA = 2;
    public static final int MALA_HIERBA = 3;
    public static final int GUSANO = 4;
    public static final int ABEJA = 5;

    public static int[][] jardin = {
            {1, 0, 0, 0, 1, 0, 0, 0, 2, 1, 1, 0, 0, 5, 0},
            {0, 2, 0, 5, 0, 0, 3, 0, 1, 0, 0, 0, 1, 0, 0},
            {3, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 2, 4},
            {0, 0, 2, 0, 0, 0, 0, 0, 2, 1, 3, 0, 0, 0, 1},
            {0, 0, 1, 0, 0, 0, 3, 0, 1, 0, 0, 0, 0, 0, 3},
            {4, 3, 0, 0, 0, 2, 1, 0, 0, 0, 0, 5, 0, 0, 0},
            {1, 2, 0, 5, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 2},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1},
            {3, 0, 0, 0, 0, 0, 2, 1, 4, 0, 0, 0, 1, 0, 0},
            {2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 3, 0},
            {0, 0, 5, 1, 0, 0, 0, 5, 0, 3, 0, 0, 1, 0, 0},
            {1, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 5, 2, 4, 0},
            {0, 0, 1, 3, 0, 0, 1, 0, 0, 1, 0, 0, 1, 3, 0},
            {0, 1, 2, 1, 0, 0, 0, 0, 0, 2, 3, 1, 0, 0, 1},
            {1, 3, 4, 0, 0, 5, 0, 0, 1, 0, 0, 0, 0, 4, 2}};
    public static void main(String[] args) {
        recorrerJardin();
    }

    public static void recorrerJardin() {
        for (int i = 0; i < jardin.length; i++) {
            for (int j = 0; j < jardin[i].length; j++) {
                if (jardin[i][j] == SEMILLA){
                    if (comprobarSiFlorece(i, j)){
                        System.out.printf("La semilla de la posición %d,%d florecerá\n", i, j);
                    }
                }
            }
        }
    }

    private static boolean comprobarSiFlorece(int i, int j) {
        return hayAgua(i, j) && hayAbeja(i, j) && (!hayMalaHierba(i, j) || (hayMalaHierba(i, j) && hayGusano(i, j)));
    }

    private static boolean hayAgua(int i, int j){
        return check(i, j, AGUA, 1);
    }

    private static boolean hayAbeja(int i, int j){
        return check(i, j, ABEJA, 3);
    }

    private static boolean hayMalaHierba(int i, int j){
        return check(i, j, MALA_HIERBA, 1);
    }

    private static boolean hayGusano(int i, int j){
        return check(i, j, GUSANO, 1);
    }

    private static boolean check(int i, int j, int objetoBuscado, int rango){
        for (int k = i-rango; k <= i+rango; k++) {
            for (int l = j-rango; l <= j+rango; l++) {
                if (k >= 0 && k < jardin.length && l >= 0 && l < jardin[k].length){
                    if (jardin[k][l] == objetoBuscado){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
