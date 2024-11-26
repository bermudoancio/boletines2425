package boletin_objetos_1;

import cosasDeClase.MiEntradaSalida;

public class PrincipalMaquina {

    public static void main(String[] args) {

        Maquina m1 = new Maquina();

        int opcion = 0;

        do {
            try {
                System.out.println("-------------------------------");
                System.out.println("Bienvenido a mi máquina de café");
                opcion = MiEntradaSalida.seleccionaOpcion("Seleccione una opción",
                        new String[]{"Café solo (" + Maquina.PRECIO_CAFE + " €)"
                                , "Leche (" + Maquina.PRECIO_LECHE + " €)"
                                , "Café con leche (" + Maquina.PRECIO_CAFE_LECHE + " €)"
                                , "Conocer estado de la máquina"
                                , "Apagar máquina y salir"});

                // Guardamos el dinero introducido por el cliente
                double dineroIntroducido = 0;

                switch (opcion) {
                    case Maquina.OPCION_CAFE:
                    case Maquina.OPCION_LECHE:
                    case Maquina.OPCION_CAFE_LECHE:
                        if (controlaExistencia(m1, opcion)) {
                            double cambio = procesaOpcion(m1, opcion);
                            if (cambio > 0) {
                                System.out.printf("Recoja su cambio (%.2f)€\n", cambio);
                            }
                        }
                        break;
                    case Maquina.OPCION_ESTADO:
                        System.out.println(m1);
                        break;
                    case Maquina.OPCION_APAGAR:
                        break;
                }
            } catch (ParametroNoValidoException ex) {
                System.out.println(ex.getMessage());
            }
        } while (opcion != Maquina.OPCION_APAGAR);


    }

    public static double pedirDinero(Maquina m1, int opcion) throws ParametroNoValidoException {
        double dineroIntroducido = MiEntradaSalida.solicitarDoublePositivo("Introduce el dinero");

        if (dineroIntroducido < getPrecioOpcion(opcion)) {
            throw new ParametroNoValidoException("No has introducido suficiente");
        }

        if (dineroIntroducido - getPrecioOpcion(opcion) > m1.getMonedero()) {
            throw new ParametroNoValidoException("Lo siento pero no tengo cambio suficiente");
        }

        return dineroIntroducido;
    }

    public static double getPrecioOpcion(int opcion) {
        double precioProducto = 0;

        switch (opcion) {
            case Maquina.OPCION_CAFE:
                precioProducto = Maquina.PRECIO_CAFE;
                break;
            case Maquina.OPCION_LECHE:
                precioProducto = Maquina.PRECIO_LECHE;
                break;
            case Maquina.OPCION_CAFE_LECHE:
                precioProducto = Maquina.PRECIO_CAFE_LECHE;
                break;
        }

        return precioProducto;

        /*
        return switch (opcion) {
            case Maquina.OPCION_CAFE -> Maquina.PRECIO_CAFE;
            case Maquina.OPCION_LECHE -> Maquina.PRECIO_LECHE;
            case Maquina.OPCION_CAFE_LECHE -> Maquina.PRECIO_CAFE_LECHE;
            default -> 0;
        };
         */
    }

    /**
     * @param m      el objeto que representa la m�quina
     * @param opcion la opci�n seleccionada
     * @return el cambio a devolver
     */
    public static double procesaOpcion(Maquina m, int opcion) throws ParametroNoValidoException {
        double dineroIntroducido = pedirDinero(m, opcion);

        double cambioADevolver = dineroIntroducido - getPrecioOpcion(opcion);

        m.servirProducto(opcion);
        System.out.println("Recoja su producto");

        return cambioADevolver;
    }

    public static boolean controlaExistencia(Maquina m, int opcion) {
        boolean hayExistencias = false;
        switch (opcion) {
            case Maquina.OPCION_CAFE:
                hayExistencias = m.getVasosRestantes() > 0 && m.getDosisCafes() > 0;
                break;
            case Maquina.OPCION_LECHE:
                hayExistencias = m.getVasosRestantes() > 0 && m.getDosisLeche() > 0;
                break;
            case Maquina.OPCION_CAFE_LECHE:
                hayExistencias = m.getVasosRestantes() > 0 && m.getDosisLeche() > 0 && m.getDosisCafes() > 0;
                break;
        }

        /*
        boolean hayExistencias = switch (opcion) {
            case Maquina.OPCION_CAFE -> m.getVasosRestantes() > 0 && m.getDosisCafes() > 0;
            case Maquina.OPCION_LECHE -> m.getVasosRestantes() > 0 && m.getDosisLeche() > 0;
            case Maquina.OPCION_CAFE_LECHE ->
                    m.getVasosRestantes() > 0 && m.getDosisLeche() > 0 && m.getDosisCafes() > 0;
            default -> false;
         */

        return hayExistencias;
    }

}
