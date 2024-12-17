package boletin_objetos_1;

import java.time.LocalDate;

public class Persona {
    private LocalDate fechaNacimiento;

    public Persona(int year, int month, int day){
        this.setFechaNacimiento(year, month, day);
    }

    public void setFechaNacimiento(int year, int month, int day) {
        this.fechaNacimiento = LocalDate.of(year, month, day);

        if (this.fechaNacimiento.isAfter(LocalDate.now())){

        }

        if (LocalDate.now().minusYears(100).isAfter(this.fechaNacimiento)){

        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Persona{");
        sb.append("fechaNacimiento=").append(fechaNacimiento);
        sb.append('}');
        return sb.toString();
    }
}
