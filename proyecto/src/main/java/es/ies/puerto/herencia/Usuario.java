package es.ies.puerto.herencia;
import java.util.Objects;

public class Usuario extends Persona{
    String email;
    String password;

    public Usuario() {
    }

    public Usuario(String identificador) {
        super(identificador);
    }

    public Usuario(String nombre, String identificador,
     String email, String password) {
        super(nombre, identificador);
        this.email = email;
        this.password =password;
    }


    public String getEmail() {
        return this.email;
    }

    public String getPassword() {
        return this.password;
    }


    public Usuario(String email, String password) {
        this.email = email;
        this.password = password;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public Usuario email(String email) {
        setEmail(email);
        return this;
    }

    public Usuario password(String password) {
        setPassword(password);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Usuario)) {
            return false;
        }
        Usuario usuario = (Usuario) o;
        return Objects.equals(email, usuario.email) && Objects.equals(password, usuario.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, password);
    }

    @Override
    public String toString() {
        return "" +
            super.toString()+
            " email='" + getEmail() + "'" +
            ", password='" + getPassword() + "'" +
            "";
    }
    


}
