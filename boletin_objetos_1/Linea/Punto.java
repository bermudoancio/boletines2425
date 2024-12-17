package boletin_objetos_1.Linea;

import java.util.Objects;

public class Punto {
    private double coordX, coordY;

    public Punto() {
        coordX = 0;
        coordY = 0;
    }

    public  Punto(double coordX, double coordY) {
        this.coordX = coordX;
        this.coordY = coordY;
    }

    public double getCoordX() {
        return coordX;
    }

    public void setCoordX(double coordX) {
        this.coordX = coordX;
    }

    public double getCoordY() {
        return coordY;
    }

    public void setCoordY(double coordY) {
        this.coordY = coordY;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Punto punto = (Punto) o;
        return this.coordX == punto.coordX && this.coordY == punto.coordY;
    }

    @Override
    public int hashCode() {
        return Objects.hash(coordX, coordY);
    }
}
