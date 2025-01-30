package es.ies.puerto.herencia;
import java.util.Objects;

public abstract class Persona {

    private String nombre;
    private String indentificador;


    public Persona() {
    }

    public Persona(String identificador) {
        this.indentificador = identificador;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getIndentificador() {
        return this.indentificador;
    }

    public Persona(String nombre, String indentificador) {
        this.nombre = nombre;
        this.indentificador = indentificador;
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Persona)) {
            return false;
        }
        Persona persona = (Persona) o;
        return Objects.equals(indentificador, persona.indentificador);
    }

    @Override
    public int hashCode() {
        return Objects.hash(indentificador);
    }


    @Override
    public String toString() {
        return "" +
            " nombre='" + getNombre() + "'" +
            ", indentificador='" + getIndentificador() + "'" +
            "";
    }

    

}