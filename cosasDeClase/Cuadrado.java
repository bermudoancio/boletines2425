package cosasDeClase;

import java.util.Objects;

public class Cuadrado {
    private int lado;
    private String color;

    public Cuadrado(int lado) {
        this.setLado(3);
        this.setColor("Rojo");
        switch (lado){
            case 1:
                //metodoQuehaceAlgo();
                break;
            case 2:
                //otroMetodo();
                break;
            case 3:
                System.out.println("Adiós");
        }
    }

    /**
     * Actualiza la medida del lado del cuadrado
     * @param lado la longitud del lado
     */
    public void setLado(int lado) {
        assert lado > 0 && lado <= 20 : "El lado es incorrecto";
        this.lado = lado;
    }

    /**
     * Actualiza el color del rectángulo con el color pasado por parámetro
     * @param color El color a ponerle al rectángulo
     */
    public void setColor(String color) {
        assert color == null : "El color no puede estar vacío";
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cuadrado cuadrado = (Cuadrado) o;
        return lado == cuadrado.lado && Objects.equals(color, cuadrado.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lado, color);
    }

    /**
     *
     * @return
     */
    public String getColor() {
        return color;
    }
}
