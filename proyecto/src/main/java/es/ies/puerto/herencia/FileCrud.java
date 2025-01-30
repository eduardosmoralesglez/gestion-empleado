package es.ies.puerto.herencia;

public class FileCrud implements Crud{

    @Override
    public boolean add(Persona persona) {
        return false;
    }

    @Override
    public boolean read(Persona persona) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'read'");
    }

    @Override
    public boolean update(Persona persona) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public boolean delete(Persona persona) {
        return true;
    }

    @Override
    public boolean delete(String identificador) {
        return false;
    }
    
}
