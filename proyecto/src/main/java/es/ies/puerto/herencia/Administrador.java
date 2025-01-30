package es.ies.puerto.herencia;

import java.util.List;

public class Administrador extends Usuario{
    List<String> permisos;

    public Administrador() {}

    public Administrador(String identificador) {
        super(identificador);
    }

    public Administrador(String nombre, String identificador, 
    String email, String password, List<String> permisos) {
        super(nombre, identificador, email, password);
        this.permisos = permisos;
    }

    public List<String> getPermisos() {
        return this.permisos;
    }


    @Override
    public String toString() {
        return "" +
            super.toString() +
            " permisos='" + permisos + "'" +
            "";
    }



}
