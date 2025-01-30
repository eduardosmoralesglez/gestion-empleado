package es.ies.puerto.herencia.model;

public class Desarrollador extends Empleado{

    public Desarrollador() {
        
    }

    public Desarrollador(String nombre, int edad, double salarioBase) {
        super();
    }

    @Override
    public double calcularSalarioFinal() {
        return getSalarioBase() + (getSalarioBase() * 0.20);
    }

    @Override
    public String toString() {
        return "Empleado: Desarrollador, "+
        super.toString() + 
        " Salario Final: " + calcularSalarioFinal();
    }

    
}
