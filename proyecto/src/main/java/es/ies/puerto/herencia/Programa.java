package es.ies.puerto.herencia;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Programa {
    static Persona persona;
    static Crud repositorio;
    
    public static void main(String[] args) {
        repositorio = new Bbdd();
        persona = new Administrador("Pepe", "00000000H",
         "aa@ee.com", "ss", Arrays.asList("eliminar"));
        System.out.println("Valor de persona:"+persona);
        System.out.println("Almacena:"+repositorio.add(persona));
    }
}
