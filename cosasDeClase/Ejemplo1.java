package cosasDeClase;

import java.util.Random;
import java.util.Scanner;

public class Ejemplo1 {
    public static void main(String[] args) {
        String numRomano = "IX";
        int letraAnterior = Integer.MAX_VALUE;
        int letraActual;
        int temporal = 0;
        int resultado = 0;

        for (int i = 0; i < numRomano.length(); i++) {
            char letra = numRomano.charAt(i);

            letraActual = switch (letra) {
                case 'M' -> 1000;
                case 'D' -> 500;
                case 'C' -> 100;
                case 'L' -> 50;
                case 'X' -> 10;
                case 'V' -> 5;
                case 'I' -> 1;
                default -> 0;
            };

            if (letraActual > letraAnterior){
                resultado += letraActual - temporal;
                temporal = 0;
            }
            else if (letraActual == letraAnterior){
                resultado += temporal + letraActual;
                temporal = 0;
            }
            else {
                // letraAnterior > letraActual
                resultado += temporal;

                temporal = letraActual;
            }

            letraAnterior = letraActual;
        }

        resultado += temporal;

        System.out.printf("El valor de %s es %d", numRomano, resultado);
    }

}
