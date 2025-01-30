package es.ies.puerto.herencia;

import es.ies.puerto.herencia.model.Desarrollador;
import es.ies.puerto.herencia.model.Empleado;


public class Programa {
    static Empleado desarrollador = new Desarrollador("Carlos", 30, 3000);
    
    public static void main(String[] args) {
        System.out.println(desarrollador);
    }
}
