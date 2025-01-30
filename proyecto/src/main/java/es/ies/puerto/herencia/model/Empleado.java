package es.ies.puerto.herencia.model;
import java.util.Objects;

public abstract class Empleado {

    private String nombre;
    private int edad;
    private double salarioBase;

    public Empleado() {

    }

    public Empleado(String nombre, int edad, double salarioBase) {
        this.nombre = nombre;
        this.edad = edad;
        this.salarioBase = salarioBase;
    }


    public String getNombre() {
        return this.nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public double getSalarioBase() {
        return this.salarioBase;
    }

    @Override
    public String toString() {
        return
            "Nombre = " + getNombre()  +
            ", Edad = " + getEdad() +
            ", SalarioBase = " + getSalarioBase();
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Empleado)) {
            return false;
        }
        Empleado empleado = (Empleado) o;
        return Objects.equals(nombre, empleado.nombre) && edad == empleado.edad && Objects.equals(salarioBase, empleado.salarioBase);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, edad, salarioBase);
    }

    public abstract double calcularSalarioFinal();
    
    public String mostrarInformacion() {
        return toString();
    }

}