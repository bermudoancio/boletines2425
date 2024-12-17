package boletin_objetos_1.Linea;


import java.util.Objects;

public class Linea {
    private Punto puntoA, puntoB;
    public Linea() {
        this.puntoA = new Punto();
        this.puntoB = new Punto();
    }
    public Linea(Punto puntoA, Punto puntoB){
        this.puntoA = puntoA;
        this.puntoB = puntoB;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Linea linea = (Linea) o;
        return this.puntoA.equals(linea.puntoA) && this.puntoB.equals(linea.puntoB);
    }

    @Override
    public int hashCode() {
        return Objects.hash(puntoA, puntoB);
    }
}
