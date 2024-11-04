package boletinArray1;

import comun.MiEntradaSalida;

public class Ejercicio14 {
    private static final int SIZE = 5;
    private static int[] cola;
    private static int numElementos;
    private static int iPE; //Índice del Primer Elemento

    public static void main(String[] args) {
        cola = new int[SIZE];

        encolar(4);
        encolar(5);
        encolar(0);
        encolar(1);
        encolar(3);
        encolar(2);
        System.out.println(desencolar());
        System.out.println(desencolar());
        System.out.println(desencolar());
        System.out.println(desencolar());
        System.out.println(desencolar());
        System.out.println(desencolar());
    }

    public static void encolar(int n) {
        if (numElementos == SIZE){
            System.out.println("La cola está llena");
        }
        else {
            cola[(iPE + numElementos) % SIZE] = n;
            numElementos = numElementos + 1;
        }
    }

    public static int desencolar() {
        int elementoDevolver = -1;
        if (numElementos == 0){
            System.out.println("La cola está vacía");
        }
        else {
            elementoDevolver = cola[iPE];
            iPE = (iPE + 1) % SIZE;
            numElementos = numElementos - 1;
        }

        return elementoDevolver;
    }
}
