package boletinArray1;

public class Buscaminas {
    private static int[][] matrizMinas;
    private static boolean[][] matrizLevantadas;

    private static final int TAM_MATRIZ = 10;
    private static final int MINAS_A_PLANTAR = 10;
    private static final int MINA = -1;
    public static void main(String[] args) {
        generarMatrices(TAM_MATRIZ);
        // Ahora plantamos las minas
        plantarMinas(MINAS_A_PLANTAR);
        //TODO: Falta rellenar con los números

        visualizaTablero();
    }

    public static void generarMatrices(int tam){
        matrizMinas = new int[tam][tam];
        matrizLevantadas = new boolean[tam][tam];
    }

    public static void plantarMinas(int numMinas){
        for (int i = 0; i < numMinas; i++) {
            int coordX = (int) (Math.random() * TAM_MATRIZ);
            int coordY = (int) (Math.random() * TAM_MATRIZ);

            if (matrizMinas[coordX][coordY] != MINA){
                matrizMinas[coordX][coordY] = MINA;
            }
            else {
                i--;
            }
        }
    }

    public static void visualizaTablero(){
        for (int i = 0; i < TAM_MATRIZ; i++) {
            for (int j = 0; j < TAM_MATRIZ; j++) {
                if (matrizLevantadas[i][j]){
                    // Muestro el contenido de la casilla de la matriz de minas
                    System.out.printf("%2d | ", matrizMinas[i][j]);
                }
                else {
                    System.out.print("  | ");
                }
            }
            System.out.println();
        }
    }

}
